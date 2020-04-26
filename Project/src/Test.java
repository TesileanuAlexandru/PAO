import CSV_RW.CSVReader;
import CSV_RW.CSVWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) throws IOException {
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

    }
}
