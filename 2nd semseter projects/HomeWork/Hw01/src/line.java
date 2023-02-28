package HomeWork.Hw01.src;
public class line extends figure{

    public line(){
        p1 = new Point2D();
        p2 = new Point2D();
    }

    public line(Point2D p1, Point2D p2){
        super(p1,p2);
    }

    @Override
    public double getcontour(){
        return Math.sqrt(getwidth() * getwidth() + getheight() * getheight() );
    }

    @Override
    public void draw(){
        System.out.println("----------------------");
    }
}