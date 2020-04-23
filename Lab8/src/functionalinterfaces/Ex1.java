package functionalinterfaces;


import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/*
    Consumer<T> - void accept(T t)
    BiConsumer<T, R> - void accept(T t, R r)
    Supplier<T> - T get()
    Function<T, R> - R apply(T t)
    BiFunction<T, V, R> - R apply(T t, V v)
    Priedicate<T> - boolean test(T t)
 */
public class Ex1 {

    public static void main(String[] args) {

        Consumer<String> c1 = x -> System.out.println(x);
        c1.accept("ABC");

        Supplier<LocalDate> s1 = () -> LocalDate.now();
        s1.get();

        Function<String, Integer> f1 = s -> s.length();
        f1.apply("Sdfs");

        Predicate<Integer> p1 = x -> x % 2 = 0;
        p1.test(43);
    }
}
