package Streams;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Ex1 {

    private static final String BASE_PATH ="./src/Streams";

    public static void main(String[] args) {

        System.out.println(System.getProperty("file.separator"));

        //Create director
        File dir = new File(BASE_PATH, "/dir");
        dir.mkdir();

        File dir2 = new File(BASE_PATH, "/a/b/c/dir2");
        dir2.mkdirs();

        //Create new file

        File file1 = new File(BASE_PATH , "file1.txt");
        try {
            if (file1.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println(file1.exists());
                System.out.println(file1 + " already existent");
            }
        } catch (IOException e){
            System.out.println(e);
        }

        System.out.println(file1.getName());
        System.out.println(file1.length());
        System.out.println(file1.getAbsolutePath());

        //List files
        File f1 = new File("./src/Streams");
        System.out.println(Arrays.toString(f1.listFiles()));


    }
}
