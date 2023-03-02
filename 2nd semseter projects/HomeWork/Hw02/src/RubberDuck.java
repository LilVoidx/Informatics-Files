public class RubberDuck extends Duck {

    public RubberDuck() {
        quackBehavior = new Squeak();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("This is a Rubber Duck");
    }

    @Override
	public void swim() {
		System.out.println("I am Floating");
	}
}