import javax.lang.model.element.NestingKind;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBAccess {
    private static DBAccess instance = null;
    private Connection conn;
    private ResultSet result;
    private Statement queryStatement;
    private DBAccess() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(
                    " jdbc:oracle:thin:@localhost:1521:xe", "student", "STUDENT");
            queryStatement = conn.createStatement();
            conn.setAutoCommit(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    public static DBAccess getInstance() {
        if(instance == null) {
            instance = new DBAccess();
        }
        return  instance;
    }
    public void insertDuba(Duba duba){
        try{
            int isLoadedInt = duba.getisLoaded() ? 1 : 0 ;
            queryStatement.executeUpdate("INSERT INTO DUBE VALUES ( " +  duba.getCapacitatePaleti() + ", " + duba.getAnFab() + ", " + "'" + duba.getModel() + "', " + isLoadedInt + ", " + duba.hashCode() + ", NULL )" );
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void insertAutobuz(Autobuz autobuz){
        try{
            int isLoadedInt = autobuz.getisLoaded() ? 1 : 0 ;
            queryStatement.executeUpdate("INSERT INTO AUTOBUZE VALUES ( " +  autobuz.getNrLocuri() + ", " + autobuz.getAnFab() + ", " + "'" + autobuz.getModel() + "', " + isLoadedInt + ", " + autobuz.hashCode() + ", NULL )" );
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();

        }
    }
    public void adaugaFlota(Flota flota){
        try{
            queryStatement.executeUpdate("INSERT INTO FLOTE VALUES ( " + flota.getCapacitateFlota() +", "+ flota.hashCode()  + ")" );
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void adaugaItemIncarcatura(ItemIncarcatura item){
        try{
            queryStatement.executeUpdate("INSERT INTO ITEMEINCARCATURA VALUES ( " + item.getTimpRamasExpediere() + ", " + item.getTimpRamasExpediere() + ", " + item.hashCode() +", NULL)");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void adaugaIncarcatura(Incarcatura item){
        try{
            queryStatement.executeUpdate("INSERT INTO INCARCATURA VALUES ('" + item.getDenumireIncarcatura() +"', " + item.getDimensiuneIncarcatura() + ", " + item.hashCode() + ")");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void updateFlota (Flota flota){ //Updates the field IDFLOTA from autobuze and dube for a certain fleet
        try{
            for (int i=0; i < flota.getIndex(); ++i){
                Statement stm = conn.createStatement();
                if(flota.vehicule[i] instanceof Duba) {
                    stm.executeUpdate("UPDATE DUBE SET IDFLOTA = " + flota.hashCode() + "WHERE ID = " + flota.vehicule[i].hashCode());
                    flota.vehicule[i].idflota = flota.hashCode();
                } else{
                    stm.executeUpdate("UPDATE AUTOBUZE SET IDFLOTA = " + flota.hashCode() + "WHERE ID = " + flota.vehicule[i].hashCode());
                    flota.vehicule[i].idflota = flota.hashCode();
                }
            }
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public void updateIncarcatura(Incarcatura incarcatura){
        try{
            for(int i = 0; i < incarcatura.getIndex(); ++i){
                queryStatement.executeUpdate("UPDATE ITEMEINCARCATURA SET IDICARCATURA = " + incarcatura.hashCode() + "WHERE ID = " + incarcatura.itemIncarcatura[i].hashCode());
                incarcatura.itemIncarcatura[i].ID_INCARCATURA = incarcatura.hashCode();
            }

        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }
    public List<Autobuz> getAutobuze(){
        ArrayList<Autobuz> returnable = new ArrayList<Autobuz>();
        try {

            ResultSet resultSet = queryStatement.executeQuery("SELECT * FROM AUTOBUZE");
            while(resultSet.next()){
                String model = resultSet.getString("MODEL");
                int nrlocuri = resultSet.getInt("NRLOCURI");
                int anfab = resultSet.getInt("ANFAB");
                boolean isloaded = resultSet.getInt("ISLOADED") == 1 ? true : false;
                int id = resultSet.getInt("ID");
                Autobuz autobuz = new Autobuz(model,anfab,isloaded,nrlocuri);
                autobuz.DB_ID = id;
                returnable.add(autobuz);
            }
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        return returnable;
    }
    public List<Duba> getDube(){
        ArrayList<Duba> returnable = new ArrayList<Duba>();
        try{
            ResultSet resultSet = queryStatement.executeQuery("SELECT * FROM DUBE");
            while (resultSet.next()){
                int capacitatepaleti = resultSet.getInt("CAPACITATEPALETI");
                int anfab = resultSet.getInt("ANFAB");
                boolean isloaded = resultSet.getInt("ISLOADED") == 1 ? true : false;
                int id = resultSet.getInt("ID");
                String model = resultSet.getString("MODEL");
                Duba duba = new Duba(model,anfab,isloaded,capacitatepaleti);
                duba.DB_ID = id;
                int idflota = resultSet.getInt("IDFLOTA");
                duba.DB_ID = idflota;
                returnable.add(duba);
            }
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        return returnable;
    }
    public List<Flota> getFlote(){
        ArrayList<Flota> returnable = new ArrayList<Flota>();
        List<Duba> dube = this.getDube();
        List<Autobuz> autobuze = this.getAutobuze();

        try{
            ResultSet resultSet = queryStatement.executeQuery("SELECT * FROM FLOTE");
            while (resultSet.next()){
                int capacitateflota = resultSet.getInt("CAPACITATEFLOTA");
                int id = resultSet.getInt("ID");
                Flota flota = new Flota(capacitateflota);
                flota.DB_ID = id;
                returnable.add(flota);
            }
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
        for (Flota f: returnable){
            for(Duba d: dube){
                if(d.idflota == f.hashCode()){
                    f.adaugaAututurism(d);
                }
            }
            for(Autobuz a: autobuze){
                if(a.idflota == f.hashCode()){
                    f.adaugaAututurism(a);
                }
            }
        }

        return  returnable;
    }

    public List<ItemIncarcatura> getItemeIncarcatura(){
        ArrayList<ItemIncarcatura> returnable = new ArrayList<ItemIncarcatura>();
        try{
            ResultSet resultSet = queryStatement.executeQuery("SELECT * FROM ITEMEINCARCATURA");
            while(resultSet.next()){
                int timpramasexpediere = resultSet.getInt("TIMPRAMASEXPEDIERE");
                int nrpaletiincarcat = resultSet.getInt("NRPALETIINCARCAT");
                int id = resultSet.getInt("ID");
                int idincarcatatura = resultSet.getInt("IDICARCATURA");
                ItemIncarcatura item = new ItemIncarcatura(timpramasexpediere,nrpaletiincarcat);
                item.ID_INCARCATURA = idincarcatatura;
                item.DB_ID = id;
                returnable.add(item);
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return returnable;
    }

    public List<Incarcatura> getIncarcatura(){
        ArrayList<Incarcatura> returnable = new ArrayList<Incarcatura>();
        List<ItemIncarcatura> items = this.getItemeIncarcatura();
        try{
            ResultSet resultSet = queryStatement.executeQuery("SELECT * FROM INCARCATURA");
            while (resultSet.next()){
                String denumireincarcatura = resultSet.getString("DENUMIREINCARCATURA");
                int dimensiuneincarcatura = resultSet.getInt("DIMENSIUNEINCARCATURA");
                int id = resultSet.getInt("ID");
                Incarcatura obj = new Incarcatura(denumireincarcatura,dimensiuneincarcatura);
                obj.DB_ID = id;
                returnable.add(obj);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        for (Incarcatura incarcatura: returnable){
            for (ItemIncarcatura item: items){
                if(incarcatura.hashCode() == item.ID_INCARCATURA){
                    incarcatura.add(item);
                }
            }
        }
        return returnable;
    }

    public void deleteAutobuz(Autobuz autobuz){
        try{
            queryStatement.executeUpdate("DELETE FROM AUTOBUZE WHERE ID = " + autobuz.hashCode());
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void deleteDuba(Duba duba){
        try{
            queryStatement.executeUpdate("DELETE FROM DUBE WHERE ID = " + duba.hashCode());
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void deleteFlota(Flota flota){
        try {
            List <Duba> dube = this.getDube();
            List <Autobuz> autobuze = this.getAutobuze();
            for (Duba d : dube){
                if (d.idflota == flota.hashCode()){
                    queryStatement.executeUpdate("UPDATE DUBE SET IDFLOTA = NULL WHERE ID = " + d.hashCode());
                }
            }
            for (Autobuz a : autobuze){
                if(a.idflota == flota.hashCode()){
                    queryStatement.executeUpdate("UPDATE AUTOBUZE SET IDFLOTA = NULL WHERE ID = " + a.hashCode());
                }
            }

            queryStatement.executeUpdate("DELETE FROM FLOTE WHERE ID = " + flota.hashCode());

        } catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void deleteItemIncarcatura(ItemIncarcatura item){
        try{
            queryStatement.executeUpdate("DELETE FRM ITEMEINCARCATURA WHERE ID = " + item.hashCode());
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }

    public void deleteIncarcatura(Incarcatura inc){
        try{
            List <ItemIncarcatura> items = this.getItemeIncarcatura();
            for (ItemIncarcatura i : items){
                if(i.ID_INCARCATURA == inc.hashCode()){
                    queryStatement.executeUpdate("UPDATE ITEMEINCARCATURA SET IDINCARCATURA = NULL WHERE ID = " + i.hashCode());
                }
            }
            queryStatement.executeUpdate("DELETE FROM INCARCATURA WHERE ID = " + inc.hashCode());
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }
    }


    public int getMaxAutoturisme(){

        int mxD = 0;
        int mxA = 0;

        try{
            Statement stmt = conn.createStatement();
            Statement stmt2 = conn.createStatement();
            ResultSet maxDube ;
            ResultSet maxAutobuze;
            maxDube = stmt2.executeQuery("SELECT MAX(ID) FROM DUBE");
            maxAutobuze = stmt.executeQuery("SELECT MAX(ID) FROM AUTOBUZE");

            while(maxAutobuze.next()){
                mxA = maxAutobuze.getInt("MAX(ID)");
                //System.out.println("A " + mxA);
            }

            while (maxDube.next()){
                mxD = maxDube.getInt("MAX(ID)");
                //System.out.println("D " + mxD);
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return mxA >= mxD ? mxA : mxD;
    }

    public int getMaxFlote(){
        int m = 0;
        try{
            ResultSet max = queryStatement.executeQuery("SELECT MAX(ID) AS M FROM FLOTE");
            while(max.next()){
                m = max.getInt("M");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return m;
    }

    public int getMaxIncarcatura(){
        int m = 0;
        try{
            ResultSet max = queryStatement.executeQuery("SELECT MAX(ID) AS M FROM INCARCATURA");
            while (max.next()){
                m = max.getInt("M");
            }

        } catch (Exception e){
            System.out.println(e);
        }
        return m;
    }

    public int getMaxItemIncarcatura(){
        int m = 0;
        try{
            ResultSet max = queryStatement.executeQuery("SELECT MAX(ID) AS M FROM ITEMEINCARCATURA");
            while (max.next()){
                m = max.getInt("M");
            }
        } catch (Exception e){
            System.out.println(e);
        }
        return m; }

    }
