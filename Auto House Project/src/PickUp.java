public class PickUp extends Autoturism {

    protected int numarLocuri;
    protected boolean benaAcoperita;

    public PickUp(int anFabricatie, int pret, String model, int numarLocuri, boolean benaAcoperita) {
        super(anFabricatie, pret, model);
        this.numarLocuri = numarLocuri;
        this.benaAcoperita = benaAcoperita;
    }
}
