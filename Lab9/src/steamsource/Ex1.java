package steamsource;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> intList =Arrays.asList(4,6,7,9,22,33,44);

        //folosind iteratia
        for (int i : intList){
            if(i%2 ==0){
                System.out.println(i);
            }
        }

        //folosind stream()
        Stream<Integer> s1 = intList.stream();
        s1.filter(i -> i % 2 == 0)
                .forEach(i -> System.out.println(i));

        //empty()
        long count = streamOf(new HashSet<>()).count();
        System.out.println(count);

        //builder
        Stream<String> streamWithBuilder = Stream.<String >builder().add("aa").add("bbb").add("aab").add("abbc").build();
        Optional<String> opt = streamWithBuilder.
                filter(s -> s.startsWith("a"))
                .max(Comparator.comparingInt(String::length));
        System.out.println(opt);

    }

    public static Stream<String> streamOf(Set<String> set){
        return set == null|| set.isEmpty() ? Stream.empty() : set.stream();
    }
}
