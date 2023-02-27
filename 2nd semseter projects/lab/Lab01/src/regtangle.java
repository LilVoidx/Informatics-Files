package lab.Lab01.src;
public class regtangle extends figure implements Areaable {

    public regtangle(){

    }
    
    public regtangle(Point2D p1, Point2D p2) {
        super(p1, p2);
    }

    public double getArea(){
        return getwidth() * getwidth();
    }

    public double getcontour(){
        return 2.0 * (getwidth() + getheight());
    }

    public void draw(){
        System.out.println("____________");
        System.out.println("____________");
        System.out.println("||        ||");
        System.out.println("||        ||");
        System.out.println("||        ||");
        System.out.println("||        ||");
        System.out.println("||        ||");
        System.out.println("||        ||");
        System.out.println("____________");
        System.out.println("____________");
        
    }
}
