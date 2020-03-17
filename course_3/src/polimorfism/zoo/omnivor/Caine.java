package polimorfism.zoo.omnivor;

public class Caine extends Omnivor {
    public Caine(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "woof woof";
    }

    @Override
    public void scoateSunet(){
        System.out.println("cainele" + this.sunetSpecific);
    }
}
