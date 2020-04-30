package optional;

import java.util.Optional;

public class Ex2 {

    public static void main(String[] args) {
        String initalValue = "123";
        Ex2 ex = new Ex2();
        String s1 = Optional.ofNullable(initalValue).orElse(ex.getDefault());
        System.out.println(s1);
        String s2 = Optional.ofNullable(initalValue).orElseGet(ex::getDefault);
        System.out.println(s2);

        String s3 = null;
        String s4 = Optional.ofNullable(s3).orElseThrow(IllegalArgumentException::new);

    }

    String getDefault(){
        System.out.println("gettomg defailt value");
        return  "defailt";
    }
}
