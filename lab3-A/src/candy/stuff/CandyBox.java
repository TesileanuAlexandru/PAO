package candy.stuff;

import java.util.Objects;

public class CandyBox {
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
    public CandyBox(CandyBox other){
        this.origin = other.origin;
        this.flavour = other.flavour;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CandyBox candyBox = (CandyBox) o;
        return (flavour.toLowerCase() == candyBox.flavour.toLowerCase()) &&
                (origin.toLowerCase() == candyBox.origin.toLowerCase());
        // Flavour and Origin should not be case sensitive
    }

    public String getFlavour() {
        return flavour;
    }

    public String getOrigin() {
        return origin;
    }
}
