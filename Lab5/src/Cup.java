public class Cup implements Washable{
    double volume;
    String color;

    public int getLevelOfFragility(){
        return Washable.FRAGILE;
    }

    @Override
    public boolean needsWashing(){
        return false;
    }

    @Override
    public void wash(){
        needsWashing();
        System.out.println("Washing a cup");
    }
}
