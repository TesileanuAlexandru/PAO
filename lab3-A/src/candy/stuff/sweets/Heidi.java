package candy.stuff.sweets;

import candy.stuff.CandyBox;

public class Heidi extends CandyBox {
    protected float latura;

    @Override
    public float getVolume() {
        return latura*latura*latura;
    }
}
