package candy.stuff.sweets;

import candy.stuff.CandyBox;

public class Lindt extends CandyBox {
    protected float lungime, latime, inaltime;

    @Override
    public float getVolume() {
        return lungime * latime * inaltime;
    }
}
