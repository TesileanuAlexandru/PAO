public interface Washable {
    // public static final
    public static final int IMPREVIOS = 0;
    static int RESISTANT = 1;
    final int FRAGILE = 2;
    public int EXPLOSIVE = 3;
    // ALL OF THE ABOVE ARE THE SAME, public static final

    // public abstract
    void wash();

    // public
    default boolean needsWashing(){
        System.out.println("By default, wash everything.");
        return true;
    }

}
