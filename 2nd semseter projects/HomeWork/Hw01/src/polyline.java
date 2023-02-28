package HomeWork.Hw01.src;
public class polyline extends figure{

    private Point2D[] points;

    public polyline(Point2D[] points) {
        super(points[0], points[points.length - 1]);
        this.points = points.clone();
    }


    @Override
    public void draw() {
        System.out.println("This is a PolyLine : _____/////------/////______");
    }

    @Override
    public double getcontour() {
        double length = 0;
        for (int i = 0; i < points.length - 1; i++) {
            length += points[i].distance(points[i+1]);
        }
        return length;
    }
}
