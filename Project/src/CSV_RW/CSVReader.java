package CSV_RW;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
    private String path = "./src/data/";
    private static CSVReader instance = null;
    private File file;
    private FileReader reader;
    private BufferedReader br;

    private CSVReader(String filename) throws IOException{
        this.file = new File(this.path + filename);
        this.br = new BufferedReader((new FileReader(this.path + filename)));
    }

    public static CSVReader getInstance(String filename) throws IOException {
        /**
         Aceasta metoda returneaza o instanta a clasei CSVReader.
         @param filename Numele fisierului din care se va citi
         @return O instanta unica a CSVReader
         */
        if (instance == null)
            instance = new CSVReader(filename);
        return instance;
    }

    public List<String> readLine() throws IOException {
        /**
         Aceasta metoda returneaza o lista de String cu toate cuvintele de pe o line.
         @return Vector de String
         */
        String line = "";
        List<String> values = new ArrayList<>();

        while((line = br.readLine()) != null){
            String[] l = line.split(",");
            values.addAll(Arrays.asList(l));
            break;
        }
        return values;
    }
}
