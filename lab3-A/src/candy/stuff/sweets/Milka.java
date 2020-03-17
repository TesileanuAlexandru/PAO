package candy.stuff.sweets;

import candy.stuff.CandyBox;

public  class Milka extends CandyBox {
    protected float inaltime, raza;

    @Override
    public float getVolume() {
        return raza * raza * 3.14 * inaltime;
    }
}
