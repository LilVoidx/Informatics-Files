package HomeWork.Hw01.src;
public abstract class figure implements Comparable<figure> {

    protected Point2D p1;
    protected Point2D p2;


    public figure(){

    }

    public figure(Point2D p1,Point2D p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    //getter and setters===============
    public Point2D getP1() {
        return p1;
    }

    public void setP1(Point2D p1) {
        this.p1 = p1;
    }

    public Point2D getP2() {
        return p2;
    }

    public void setP2(Point2D p2) {
        this.p2 = p2;
    }
   

    public double getwidth(){
        return p2.x - p1.x;
    }

    public double getheight(){
        return p1.y - p2.y;
    }

    public double getsquare(){
        return getwidth() + getheight();
    }
    //================================
    
    public void printall(){
        draw();
        System.out.println("granitse: " + p1 + ", " + p2);
        System.out.println("peremiter = " + getcontour() );
    }

    public abstract void draw();

    public abstract double getcontour();

    public int compareTo(figure other) {
        double thisPerimeter = this.getcontour();
        double otherPerimeter = other.getcontour();
        if (thisPerimeter < otherPerimeter) {
            return -1;
        } else if (thisPerimeter > otherPerimeter) {
            return 1;
        } else {
            return 0;
        }
    }


    
}
