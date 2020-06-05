import CSV_RW.CSVWriter;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class Flota {
    private int capacitateFlota;
    private int index;
    Autoturism[] vehicule;
    public static int ID = DBAccess.getInstance().getMaxFlote();
    public int DB_ID = -1;



    public int getCapacitateFlota() {
        return capacitateFlota;
    }

    @Override
    public int hashCode() {
        return DB_ID != -1 ? DB_ID : ID;
    }

    public Flota(int capacitateFlota) {
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


}
