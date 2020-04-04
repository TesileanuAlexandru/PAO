import java.util.concurrent.TimeUnit;

public class Duba extends Autoturism implements TransportaMarfa{

    private float lungime, latime, inaltime;

    public Duba(String model, int anFab, boolean isLoaded, float lungime, float latime, float inaltime) {
        super(model, anFab, isLoaded);
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }

    @Override
    public void incarca() {
        if (this.isLoaded == false){
            System.out.println("Se incarca ...");

            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }

            System.out.println("Done!");
            this.isLoaded = true;
        }
        else{
            System.out.println("Autoturismul este deja incarcat!");
        }
    }

    @Override
    public void descarca() {
        if(this.isLoaded == true){
            System.out.println("Se descarca ...");

            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }
            System.out.println("Done!");
            this.isLoaded = false;
        }
        else{
            System.out.println("Autoturismul este deja descarcat!");
        }

    }
}
