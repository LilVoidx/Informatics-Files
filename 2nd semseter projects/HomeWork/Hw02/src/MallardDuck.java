public class MallardDuck extends Duck {

	public MallardDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyWithWings();
	}

	public void display() {
		System.out.println("This is a Mallard duck");
	}

	@Override
	public void swim() {
		System.out.println("I am Swimming");
	}
}