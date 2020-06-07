package CSV_RW;

import java.io.*;
import java.util.List;


public class CSVWriter {
    private static CSVWriter instance = null;

    private File file;
    private FileWriter writer;
    private String path = "./src/data/";

    private CSVWriter(String filename) throws IOException {
        file = new File(path + filename);
        if (file.exists()){
            writer = new FileWriter(file, true);


        }
        else{
            file.createNewFile();
            writer = new FileWriter(file, true);
        }
    }

    public static CSVWriter getInstance(String filename) throws IOException {
        /**
         Aceasta metoda returneaza o instanta a clasei CSVWriter.
         @param filename Numele fisierului in care se va scrie
         @return O instanta unica a CSVWriter
         */
        if (instance == null)
            instance = new CSVWriter(filename);
        return instance;
    }

    public void write(List<String> header) throws IOException {
        /**
         Aceasta metoda scie un un fiser CSV.
         @param header Lista de String ce se va scrie.
         */
        header.forEach((h) ->
        {
            try {
                writer.append(h+",");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        writer.append("\n");
        writer.flush();
    }


}
