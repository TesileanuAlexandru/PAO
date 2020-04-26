import CSV_RW.CSVReader;
import CSV_RW.CSVWriter;

import java.awt.event.ItemEvent;
import java.io.IOException;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
        // Let's load some vans
        CSVReader reader;
        reader = CSVReader.getInstance("vans.csv");

        // Created a buffer to read from
        List<String> buff;

        List<Duba> dube = new ArrayList<>();

        buff = reader.readLine();
        int safetyNet = 0; // Created just in case the reading goes wrong, prevents infinite loop
        int netLevel = 100;
        while(buff.size() != 0 && safetyNet < netLevel){
            dube.add(new Duba(buff.get(0), Integer.parseInt(buff.get(1)),false,Integer.parseInt(buff.get(2))));
            buff = reader.readLine();
            safetyNet++;
        }
        System.out.println(safetyNet);

        //Change the reader's path in order to read some buses
        reader.changePath("buses.csv");

        List<Autobuz> autobuze = new ArrayList<>();
        buff = reader.readLine();
        safetyNet = 0;
        while ( (buff.size()!= 0) && (safetyNet < netLevel)){
            autobuze.add(new Autobuz(buff.get(0), Integer.parseInt(buff.get(1)), false, Integer.parseInt(buff.get(2))));
            buff = reader.readLine();
            safetyNet++;
        }
        System.out.println(safetyNet);

        //Change the reader's path in order to read some items for our load
        reader.changePath("itemsLoad.csv");
        // List<List<String>> csvList = new ArrayList<List<String>>();

        ArrayList<ArrayList<ItemIncarcatura> >itemeInc = new ArrayList< ArrayList<ItemIncarcatura> >();
        buff = reader.readLine();
        safetyNet = 0;
        ArrayList<ItemIncarcatura> line = new ArrayList<>();
        while ((buff.size()!=0) && (safetyNet < netLevel)) {
            if (buff.size() == 2) {
                line.add(new ItemIncarcatura( Integer.parseInt(buff.get(0)), Integer.parseInt(buff.get(1))));
                buff = reader.readLine();
            } else { //TODO Some "bug" here, first batch not read, to be fixed later (no time today :( )
                itemeInc.add(line);
                line.clear();
                buff = reader.readLine();
            }
        }

        //Change the reader's path one last time in order to read the loads

        /*
        reader.changePath("load.csv");
        buff = reader.readLine();
        List<Incarcatura> incarcaturi = new ArrayList<>();
        int crtIndex = 0;
        while(buff.size() != 0){
            ItemIncarcatura[] array = itemeInc.get(crtIndex).toArray(new ItemIncarcatura[itemeInc.get(crtIndex).size()]); // TODO Fix NPE

            incarcaturi.add(new Incarcatura(buff.get(0), array));
            crtIndex++;
            buff = reader.readLine();
        }
        */

        //Let's create a fleet

        Flota flota = new Flota(2); //TODO nu e cel mai elegant mod de a face log ul, de revuzit. O solutie ar fi o clasa utilitara care sa scrie in log
        flota.adaugaAututurism(autobuze.get(0));
        flota.adaugaAututurism(dube.get(1));







        /*
        OLD TEST CODE
        Duba d1 = new Duba("vito", 1997, false,4);
        Autobuz a1 = new Autobuz("Sprinter", 1998, false, 15);


        Flota flota = new Flota(2);
        flota.adaugaAututurism(d1);
        flota.adaugaAututurism(a1);

        int[] timp = new int[]{10, 5, 15, 18};
        int[] nr = new int[]{20, 20, 20, 20};

        Incarcatura inc = new Incarcatura("farmaceutice", timp, nr);
        inc.sorteazaItemIncarcatura();

        if (flota.vehicule[0] instanceof Duba){
            System.out.println("yes it is");
           // Duba aux = (Duba)flota.vehicule[0];
           // aux.incarca();

           // aux.descarca();
        }

        CSVReader reader;
        reader = CSVReader.getInstance("in.csv");
        List<String> s= reader.readLine();
        System.out.println(s);

        CSVWriter writer;
        writer = CSVWriter.getInstance("out.csv");

        List<String> test = new ArrayList<>();
        test.add("some");
        test.add("thin");
        test.add("\n");
        test.add("something");
        test.add("else");
        writer.write(test);


         */
    }
}
