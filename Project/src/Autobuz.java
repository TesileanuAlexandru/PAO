import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.concurrent.TimeUnit;

public class Autobuz extends Autoturism implements TransportaOameni{

    private int nrLocuri;

    public Autobuz(String model, int anFab, boolean isLoaded, int nrLocuri) {
        super(model, anFab, isLoaded);
        this.nrLocuri = nrLocuri;
    }

    @Override
    public void imbarcheaza() {
        if(this.isLoaded == false){
            System.out.println("Se imbarcheaza pasagerii ...");

            try{
                TimeUnit.SECONDS.sleep(5); //Metoda poate arunca o exceptie, desi nu vad cum, de asta am tratat-o la acest nivel
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }

            System.out.println("Done!");
            this.isLoaded = true;
        }else{
            System.out.println("Pasagerii sunt deja imbarcati!");
        }
    }

    @Override
    public void debarcheaza() {
        if(this.isLoaded == true){
            System.out.println("Se debarcjeaza pasagerii ...");

            try{
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }

            System.out.println("Done!");
            this.isLoaded = false;
        } else{
            System.out.println("Pasagerii sunt deja debarcati!");
        }
    }
}
