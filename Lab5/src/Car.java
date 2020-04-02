public class Car implements Soakable{

    @Override
    public void wash(){
        System.out.println("Washing a car.");
    }

    @Override
    public void soak(){
        System.out.println("Saoking a car.");
    }
}
