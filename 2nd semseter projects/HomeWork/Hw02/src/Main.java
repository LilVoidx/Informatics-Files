public class Main{
    public static void main(String[] args) {
        
        MallardDuck mallard = new MallardDuck();
        mallard.display();
        mallard.swim();
        mallard.performQuack();
		mallard.performFly();
        System.out.println();
    
        ReadheadDuck readhead = new ReadheadDuck();
        readhead.display();
        readhead.swim();
        readhead.performQuack();
		readhead.performFly();
        System.out.println();

        RubberDuck rubber = new RubberDuck();
        rubber.display();
        rubber.swim();
        rubber.performQuack();
		rubber.performFly();
        System.out.println();

        DecoyDuck decoy = new DecoyDuck();
        decoy.display();
        decoy.swim();
        decoy.performFly();
        decoy.performQuack();
		decoy.setFlyBehavior(new FlyWithWings());
		decoy.setQuackBehavior(new Quack());
		decoy.performFly();
        decoy.performQuack();
        System.out.println();

    }
}