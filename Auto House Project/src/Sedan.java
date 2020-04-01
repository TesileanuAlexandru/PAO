public class Sedan extends Autoturism {

    private int volumPortbagaj;
    private String nivelDotari;

    public Sedan(int anFabricatie, int pret, String model, int volumPortbagaj, String nivelDotari) {
        super(anFabricatie, pret, model);
        this.volumPortbagaj = volumPortbagaj;
        this.nivelDotari = nivelDotari;
    }
}
