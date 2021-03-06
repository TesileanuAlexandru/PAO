package lambda.Ex1;

        import java.sql.SQLOutput;

public class Ex1 {

    public static void main(String[] args) {

        Instrument guitar = new Guitar();
        guitar.play();

        Instrument piano = new Instrument() {
            @Override
            public void play() {
                System.out.println("playing piano");
            }
        };  //Clasa anoima

        piano.play();

        Instrument i1 = () -> System.out.println("new instrument playing");

        i1.play();

        Instrument i2 = () -> System.out.println("stop playing");
        i2.play();
    }
}
