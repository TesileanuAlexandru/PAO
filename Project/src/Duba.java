import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Duba extends Autoturism implements TransportaMarfa{

    private int capacitatePaleti;
    private static int ID = DBAccess.getInstance().getMaxIndexAutoturisme();
    public int DB_ID = -1;

    @Override
    public int hashCode() {
        return DB_ID != -1 ? DB_ID : ID;
    }

    public Duba(String model, int anFab, boolean isLoaded, int capacitatePaleti) {
        super(model, anFab, isLoaded);
        this.capacitatePaleti = capacitatePaleti;
        ID+=1;
    }

    public int getCapacitatePaleti() {
        return capacitatePaleti;
    }

    @Override
    public void incarca(Incarcatura incarcatura) {
        if (this.isLoaded == false){
            System.out.println("Se incarca ...");

            try {
                TimeUnit.SECONDS.sleep(4);
            } catch (InterruptedException e){
                System.out.println("Something went terribly wrong: " + e);
            }

            //TODO scade din incarcatura, adaufa in auto prin metoda rucsacului greedy


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
