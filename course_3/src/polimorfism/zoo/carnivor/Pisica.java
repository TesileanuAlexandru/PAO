package polimorfism.zoo.carnivor;

public class Pisica extends Carnivor {
    public Pisica(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "mewow";
    }

    @Override
    public void scoateSunet(){
        System.out.println("pisica" + this.sunetSpecific);
    }
}
