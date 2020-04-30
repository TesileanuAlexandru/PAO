package steamsource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ex2 {
    public static void main(String[] args) {

        Stream<String> streamOfArray = Stream.of("aa","bb","alx");//{"aa","bb","alx"}
        streamOfArray.forEach(System.out::println);

        int[] omts = {1,3,5,6,8,432,453,231,54};
        Set<Integer> set  = new HashSet<>(Arrays.asList(13,4,55,77,44,88,33,13,4));
        Stream<Set<Integer>> s1 =  Stream.of(set);
        Stream<int[]> streamOfIntArray =  Stream.of(omts);
        //streamOfArray.forEach(System.out::println);
        //vs
        Arrays.stream(omts).forEach(System.out::println);
        Arrays.stream(omts,2,5).forEach(System.out::println);//[2,5)

        //IntStream. DoubleStream, LongStream
        //IntStream is1 = Arrays.stream(omts);
        //System.out.println(is1.count());
       //stem.out.println(is1.sum());

        LongStream ls1 = LongStream.rangeClosed(3,5); //[3,5}
        ls1.forEach(System.out::println);

        Random random = new Random();
        DoubleStream ds1 = random.doubles().limit(3);
        ds1.forEach(System.out::println);

        DoubleStream ds2 = random.doubles(5,5,6);
        ds2.forEach(System.out::println);

        //UnaryOperator
        Stream<Integer> integerStream = Stream.iterate(0,i -> i+2).limit(10);
        integerStream.forEach(System.out::println);
    }

}
