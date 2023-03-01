public class Main{
    public static void main(String[] args) {
        
        MallardDuck md = new MallardDuck();
        ReadheadDuck rd = new ReadheadDuck();
        RubberDuck Rd = new RubberDuck();
        DecoyDuck dd = new DecoyDuck();

        md.Doall();
        System.out.println();
        rd.Doall();
        System.out.println();
        Rd.Doall();
        System.out.println();
        dd.Doall();
    }
}