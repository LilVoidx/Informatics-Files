public class DecoyDuck extends Duck {

    public DecoyDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    public void display() {
        System.out.println("This is a Decoy Duck");
    }

    @Override
	public void swim() {
		System.out.println("I dont swim");
	}
}