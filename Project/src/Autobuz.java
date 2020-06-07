import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Autobuz extends Autoturism implements TransportaOameni{

    private int nrLocuri;
    public static int ID = DBAccess.getInstance().getMaxAutoturisme() + 1;
    public int DB_ID = -1;

    public int getNrLocuri() {
        return nrLocuri;
    }

    @Override
    public int hashCode() {
        return DB_ID ;
    }

    public Autobuz(String model, int anFab, boolean isLoaded, int nrLocuri) {
        super(model, anFab, isLoaded);
        this.nrLocuri = nrLocuri;
        DB_ID = ID;
        ID+=1;
    }

    @Override
    public void imbarcheaza() {
        if(this.isLoaded == false){
            System.out.println("Se imbarcheaza pasagerii ...");

            try{
                TimeUnit.SECONDS.sleep(5); //Metoda poate arunca o exceptie, desi nu vad cum, de asta am tratat-o la acest nivel
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }

            System.out.println("Done!");
            this.isLoaded = true;
        }else{
            System.out.println("Pasagerii sunt deja imbarcati!");
        }
    }

    @Override
    public void debarcheaza() {
        if(this.isLoaded == true){
            System.out.println("Se debarcjeaza pasagerii ...");

            try{
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }

            System.out.println("Done!");
            this.isLoaded = false;
        } else{
            System.out.println("Pasagerii sunt deja debarcati!");
        }
    }

    public static Object[] getAutobuzeHeader(){
        Object[] ret = {"Model", "An Fabr.", "Nr. Locuri", "Este Incarcat", "ID", "ID Flota"};
        return ret;
    }

    public static Object[][] formatAutobuzToTable (List<Autobuz> autobuze){
        int len = autobuze.size();
        Object[][] objArr = new Object[len][6];
        for (int i = 0; i < len; ++i){
            objArr[i][0] = autobuze.get(i).getModel();
            objArr[i][1] = autobuze.get(i).getAnFab();
            objArr[i][2] = autobuze.get(i).getNrLocuri();
            objArr[i][3] = autobuze.get(i).getisLoaded();
            objArr[i][4] = autobuze.get(i).hashCode();
            objArr[i][5] = autobuze.get(i).idflota;
        }
        return objArr;
    }
}
