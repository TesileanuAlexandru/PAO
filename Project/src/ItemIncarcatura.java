import java.util.List;
import java.util.UUID;

public class ItemIncarcatura implements Comparable<ItemIncarcatura>{

    private int timpRamasExpediere;
    private int nrPaletiIncarcat;
    private static int ID = DBAccess.getInstance().getMaxItemIncarcatura() + 1;
    public int DB_ID = -1;
    public int ID_INCARCATURA = -1;

    public int getTimpRamasExpediere() {
        return timpRamasExpediere;
    }

    public int getNrPaletiIncarcat() {
        return nrPaletiIncarcat;
    }

    @Override
    public int hashCode() {
        return DB_ID;
    }

    ItemIncarcatura(int timpRamasExpediere, int nrPaletiIncarcat) {
        this.timpRamasExpediere = timpRamasExpediere;
        this.nrPaletiIncarcat = nrPaletiIncarcat;
        DB_ID = ID;
        ID += 1;
    }

    ItemIncarcatura(ItemIncarcatura other) {
        this.nrPaletiIncarcat = other.nrPaletiIncarcat;
        this.timpRamasExpediere = other.timpRamasExpediere;
        ID += 1;
    }

    @Override
    public int compareTo(ItemIncarcatura o) {

        float calcul1 = (1F / (float) this.timpRamasExpediere) / (float) this.nrPaletiIncarcat;
        float calcul2 = (1F / (float) o.timpRamasExpediere) / (float) o.nrPaletiIncarcat;

        if(calcul1 < calcul2){
            return 1;
        }else if(calcul1 == calcul2){
            return  0;
        }else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return "ItemIncarcatura{" +
                "timpRamasExpediere=" + timpRamasExpediere +
                ", nrPaletiIncarcat=" + nrPaletiIncarcat +
                '}';
    }


    public static Object[] getItemIncarcaturaTableHeader(){
        Object[] ret = {"Timp Ramas", "Numar Paleti Incarcat", "ID", "ID Incarcatura"};
        return ret;
    }

    public static Object[][] formatItemIncarcaturaToObjTable(List<ItemIncarcatura> items){
        int len = items.size();
        Object[][] arr = new Object[len][4];
        for(int i = 0; i<len; ++i){
            arr[i][0] = items.get(i).getTimpRamasExpediere();
            arr[i][1] = items.get(i).getNrPaletiIncarcat();
            arr[i][2] = items.get(i).hashCode();
            arr[i][3] = items.get(i).ID_INCARCATURA;
        }
        return arr;

    }
}
