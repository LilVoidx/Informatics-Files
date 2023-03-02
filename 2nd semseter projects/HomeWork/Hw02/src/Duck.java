public abstract class Duck {

	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
	}

	public void setFlyBehavior(FlyBehavior flno) {
		flyBehavior = flno;
	}

	public void setQuackBehavior(QuackBehavior qkno) {
		quackBehavior = qkno;
	}

	public void performFly() {
		flyBehavior.fly();
	}

	public void performQuack() {
		quackBehavior.quack();
	}

    abstract void display();

	public abstract void swim();
}