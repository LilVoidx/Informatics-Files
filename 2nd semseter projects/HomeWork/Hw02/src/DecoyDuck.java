public class DecoyDuck extends Duck{

    @Override
    public void Doall() {
        display();
        swim();
    }

    @Override
    public void display() {
        System.out.println("its a decoy");
    }

    @Override
    public void swim() {
        System.out.println("decoys dont swim or swim idk");
    }
}