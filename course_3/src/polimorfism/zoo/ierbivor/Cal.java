package polimorfism.zoo.ierbivor;

public class Cal extends Ierbivor {
    public Cal(String nume, int varsta) {
        super(nume, varsta);
        this.sunetSpecific = "nihoho";
    }

    @Override
    public void scoateSunet(){
        System.out.println("calul" + this.sunetSpecific);
    }
}
