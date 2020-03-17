package candy.stuff;

public abstract class CandyBox {
    private String flavour;
    private String origin;

    public CandyBox() {
        this.flavour = "Default Flavour";
        this.origin = "Default Origin";
    }

    public CandyBox(String origin, String flavour) {
        this.origin = origin;
        this.flavour = flavour;
    }

    public float getVolume(){
        return 0;
    }

    @Override
    public String toString() {
        return "CandyBox{" +
                "flavour='" + flavour + '\'' +
                ", origin='" + origin + '\'' +
                '}';
    }
}
