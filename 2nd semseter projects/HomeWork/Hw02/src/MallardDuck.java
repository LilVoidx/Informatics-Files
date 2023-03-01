public class MallardDuck extends Duck{

    @Override
    public void display() {
       System.out.println("Looks like a Mallard Duck");
    }

    @Override
    public void quack() {
        System.out.println("QUACK!");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming....*splash*");
    }

    @Override
    public void fly() {
        System.out.println("The duck is flying!!");
    }

    @Override
    public void Doall() {
        display();
        quack();
        swim();
        fly();
    }
    
}