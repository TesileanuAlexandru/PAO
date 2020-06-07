import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Collections;
import java.util.UUID;

public class Incarcatura {

    private String denumireIncarcatura;
    private int dimensiuneIncarcatura;
    ItemIncarcatura[] itemIncarcatura;
    private static int ID = DBAccess.getInstance().getMaxIncarcatura() + 1;
    public int DB_ID = -1;
    public int index = 0;

    public String getDenumireIncarcatura() {
        return denumireIncarcatura;
    }

    public int getDimensiuneIncarcatura() {
        return dimensiuneIncarcatura;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public int hashCode() {
        return DB_ID ;
    }
    Incarcatura(String denumireIncarcatura, int dimensiuneIncarcatura){
        DB_ID = ID;
        ID +=1;
        this.denumireIncarcatura = denumireIncarcatura;
        this.itemIncarcatura = new ItemIncarcatura[dimensiuneIncarcatura];
        this.dimensiuneIncarcatura = dimensiuneIncarcatura;
    }

    public void add(ItemIncarcatura item){
        this.itemIncarcatura[index] = item;
        index += 1;
    }

    public Incarcatura(String denumireIncarcatura, ItemIncarcatura[] itemIncatura) {
        this.denumireIncarcatura = denumireIncarcatura;
        this.dimensiuneIncarcatura = itemIncarcatura.length;
        this.itemIncarcatura = new ItemIncarcatura[this.dimensiuneIncarcatura];

        for(int i = 0; i < itemIncatura.length; ++i){
            this.itemIncarcatura[i] = new ItemIncarcatura(itemIncatura[i]);
            this.itemIncarcatura[i].ID_INCARCATURA = this.hashCode();
        }

        ID += 0;
    }

    public Incarcatura(String denumireIncarcatura , int[] timp, int[] nr) {
        this.denumireIncarcatura = denumireIncarcatura;
        this.dimensiuneIncarcatura = timp.length;

        this.itemIncarcatura = new ItemIncarcatura[this.dimensiuneIncarcatura];
        for(int i = 0; i < this.dimensiuneIncarcatura; ++ i) {
            this.itemIncarcatura[i] = new ItemIncarcatura(timp[i], nr[i]);
        }
    }

    public void sorteazaItemIncarcatura(){
        Arrays.sort(this.itemIncarcatura );

    }

    @Override
    public String toString() {
        return "Incarcatura{" +
                "denumireIncarcatura='" + denumireIncarcatura + '\'' +
                ", dimensiuneIncarcatura=" + dimensiuneIncarcatura +
                ", itemIncarcatura=" + Arrays.toString(itemIncarcatura) +
                '}';
    }

    public static Object[] getIncarcaturaTableHeader(){
        Object[] ret = {"Denumire", "Dimensiune", "ID"};
        return ret;
    }

    public static Object[][] formatIncarcaturaToObjTable(List<Incarcatura> loads){
        int len = loads.size();
        Object[][] arr = new Object[len][3];
        for(int i = 0; i < len; ++i){
            arr[i][0] = loads.get(i).getDenumireIncarcatura();
            arr[i][1] = loads.get(i).getDimensiuneIncarcatura();
            arr[i][2] = loads.get(i).hashCode();
        }
        return arr;

    }


}

