package polimorfism.zoo.omnivor;

public class Urs extends Omnivor {
    public Urs(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "moor mor";
    }

    @Override
    public void scoateSunet(){
        System.out.println("ursul" + this.sunetSpecific);
    }
}
