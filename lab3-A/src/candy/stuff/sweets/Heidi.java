package candy.stuff.sweets;

import candy.stuff.CandyBox;

public class Heidi extends CandyBox {
    protected float latura;


    public void printHeidiDim(){
        System.out.println("Aceasta ciocolata are latura " + latura);
    }
    public Heidi(String origin, String flavour, float latura) {
        super(origin, flavour);
        this.latura = latura;
    }
    public Heidi(Heidi other){
        super(other);
        this.latura = other.latura;
    }

    @Override
    public float getVolume() {
        return latura*latura*latura;
    }
}
