package optional;

import javax.swing.text.html.Option;
import javax.xml.bind.SchemaOutputResolver;
import java.util.Optional;

public class Ex3 {

    public static void main(String[] args) {
        Optional<String> optional = Optional.of("java");
        String s1 = optional.get();
        System.out.println(s1);

        // System.out.println(Optional.of(null).get()); NPE

        /*
        String s2 = null;
        Optional<String> opt = optional.of(s2);
        opt.ifPresent(System.out::println);
        */

    }


}
