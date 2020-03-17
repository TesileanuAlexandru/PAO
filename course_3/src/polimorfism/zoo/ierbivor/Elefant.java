package polimorfism.zoo.ierbivor;

public class Elefant extends Ierbivor {
    public Elefant(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "uuuuu or sth";
    }

    @Override
    public void scoateSunet(){
        System.out.println("elefant" + this.sunetSpecific);
    }
}
