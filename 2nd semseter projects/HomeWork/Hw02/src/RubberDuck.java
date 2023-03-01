public class RubberDuck extends Duck implements Quackable{

    @Override
    public void display() {
       System.out.println("Looks like a Rubber Duck");
    }

    @Override
    public void quack() {
        System.out.println("Squeek!");
    }

    @Override
    public void swim() {
        System.out.println("The duck is swimming....*splash*");
    }

    @Override
    public void Doall() {
        display();
        quack();
        swim();
    }
    
}