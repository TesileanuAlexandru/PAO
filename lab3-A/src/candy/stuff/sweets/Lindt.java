package candy.stuff.sweets;

import candy.stuff.CandyBox;

public class Lindt extends CandyBox {
    protected float lungime, latime, inaltime;

    public void printLindtDim(){
        System.out.println("Aceasta ciocolata are lungimea "+lungime + "latimea " + latime + " si inaltimea "+inaltime);
    }

    public Lindt(String origin, String flavour, float lungime, float latime, float inaltime) {
        super(origin, flavour);
        this.lungime = lungime;
        this.latime = latime;
        this.inaltime = inaltime;
    }
    public Lindt(Lindt other){
        super(other);
        this.inaltime = other.inaltime;
        this.latime = other.latime;
        this.inaltime = other.inaltime;
    }

    @Override
    public float getVolume() {
        return lungime * latime * inaltime;
    }
}
