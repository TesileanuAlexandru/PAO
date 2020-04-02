public class Dog extends Animal implements BubbleBathable{

    @Override
    public void wash(){
        System.out.println("Washing a dog.");
    }

    @Override
    public boolean needsWashing() {
        return false;
    }

    @Override
    public void takeBubbleBath() {
        System.out.println("Doesen't need bubble bath.");
    }

    @Override
    public void soak() {

    }

    @Override
    public void scrub() {
        System.out.println("Soft scrub");
    }
}
