public class Main{
    public static void main(String[] args) {
        
        MallardDuck md = new MallardDuck();
        ReadheadDuck rd = new ReadheadDuck();
        RubberDuck Rd = new RubberDuck();

        md.Doall();
        System.out.println();
        rd.Doall();
        System.out.println();
        Rd.Doall();
    }
}