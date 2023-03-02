public class ReadheadDuck extends Duck {

    public ReadheadDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("This is a Readhead Duck");
    }

    @Override
	public void swim() {
		System.out.println("I am Swimming");
	}
    
}