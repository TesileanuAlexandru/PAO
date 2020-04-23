package lambda.Ex1;

//functional interface, cu o singura metoda abstracta, permite comportament cu expresie lambda

public interface Instrument {

    void play();

    default void clean(){
        System.out.println("in default metod");
    }

    static void method(){
        System.out.println("still works");
    }
}
