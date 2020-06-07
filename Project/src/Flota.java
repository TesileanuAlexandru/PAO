import CSV_RW.CSVWriter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Flota {
    private int capacitateFlota;
    private int index = 0;
    Autoturism[] vehicule;
    public static int ID = DBAccess.getInstance().getMaxFlote() + 1;
    public int DB_ID = -1;



    public int getCapacitateFlota() {
        return capacitateFlota;
    }

    @Override
    public int hashCode() {
        return DB_ID;
    }

    public Flota(int capacitateFlota) {
        DB_ID = ID;
        ID += 1;
        if (capacitateFlota > 0) {
            this.capacitateFlota = capacitateFlota;
            vehicule = new Autoturism[capacitateFlota];


            try {
                CSVWriter wr;
                wr = CSVWriter.getInstance("log.csv");
                String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
                List<String> w = new ArrayList<>();
                w.add("Created Fleet");
                w.add(timeStamp);
                wr.write(w);
            } catch (IOException e){
                e.printStackTrace();
            }


        }else{
            throw new RuntimeException("Nu ati introdus un numar pozitiv!");
        }
    }

    public boolean adaugaAututurism(Autoturism autoturism){
        if(index < capacitateFlota){
            autoturism.idflota = this.hashCode();
            vehicule[index] = autoturism;
            System.out.println("Ati adaugat un autoturism de tip " + autoturism.getClass().getSimpleName() + " la pozitia " + index++);

            try {
                CSVWriter wr;
                wr = CSVWriter.getInstance("log.csv");
                String timeStamp = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss").format(new Date());
                List<String> w = new ArrayList<>();
                w.add("Adaugat Autoturism");
                w.add(timeStamp);
                wr.write(w);
            } catch (IOException e){
                e.printStackTrace();
            }

            return true;
        }else {
            return false;
        }
    }

    public int getIndex() {
        return index;
    }

    public static Object[] getFlotaTableHeader(){
        Object[] ret = {"Capacitate Flota", "ID"};
        return ret;
    }

    public static Object[][] formatFlotaToObjTable(List <Flota> flote){
        int len = flote.size();
        Object[][] arr = new Object[len][2];
        for(int i = 0; i < len; ++i){
            arr[i][0] = flote.get(i).getCapacitateFlota();
            arr[i][1] = flote.get(i).hashCode();
        }
        return arr;

    }

}
