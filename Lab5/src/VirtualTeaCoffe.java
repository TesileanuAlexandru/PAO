public class VirtualTeaCoffe {

    public static void prepareCup(Cup cup){
        cup.wash();
    }

    //static polymophism
    //dynamic polymorphism
    public static void main(String[] args){
        Cup cup = new Cup();
        prepareCup(cup);

        Cup coffeCup = new CoffeCup();
        prepareCup(coffeCup);

        //dynamic polymorphism
        Cup teaCup = new TeaCup();
        prepareCup(teaCup);
    }
}
