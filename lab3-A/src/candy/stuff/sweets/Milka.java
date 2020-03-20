package candy.stuff.sweets;

import candy.stuff.CandyBox;

public  class Milka extends CandyBox {
    protected float inaltime, raza;


    public void printMilkaDim(){
        System.out.println("Aceasta ciocolata are inaltimea " + inaltime + " si raza " + raza);
    }
    public Milka(String origin, String flavour, float inaltime, float raza) {
        super(origin, flavour);
        this.inaltime = inaltime;
        this.raza = raza;
    }
    public  Milka(Milka other){
        super(other);
        this.inaltime = other.inaltime;
        this.raza = other.raza;
    }

    @Override
    public float getVolume() {
        return raza * raza * 3.14F * inaltime;
    }
}
