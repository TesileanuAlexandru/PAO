package polimorfism.zoo.carnivor;

public class Leu extends Carnivor {
    public Leu(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "raww";
    }

    @Override
    public void scoateSunet(){
        System.out.println("leul" + this.sunetSpecific);
    }
}
