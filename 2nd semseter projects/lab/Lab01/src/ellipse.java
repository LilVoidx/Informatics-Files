package lab.Lab01.src;
public class ellipse extends figure implements Areaable{

    public ellipse() {}

    public ellipse(Point2D P1, Point2D P2) {
        super(P1,P2);
    }
    @Override
    public void draw() {
        System.out.println("0");

    }

    @Override
    public double getcontour() {
        return 2.0 * (Math.PI * getwidth() * getwidth() + (Math.pow(getwidth()-getheight(),2))/(getwidth()+getheight()));
    }


    @Override
    public double getArea() {
        return (Math.PI * (getheight()*getwidth())/4.0);
    }
}
