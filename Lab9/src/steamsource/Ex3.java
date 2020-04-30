package steamsource;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        IntStream streamOfChars = "abcasdsa".chars();
        streamOfChars.forEach(x -> System.out.println((char)x));

        Stream<String> streamOfStrings = Pattern.compile(",").splitAsStream("a, b, c, d, e, f, g, h");

        
    }
}