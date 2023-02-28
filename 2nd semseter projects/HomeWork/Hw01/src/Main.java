package HomeWork.Hw01.src;
public class Main {
    public static void main(String[] args) {
        line line = new line(new Point2D(1,5),new Point2D(5,2));
        line.printall();
        System.out.println("===========================");

        regtangle rectangle = new regtangle(new Point2D(1,5), new Point2D(5,2));
        rectangle.printall();
        System.out.println("The rectangle's area = " + rectangle.getArea());
        System.out.println("===========================");

        ellipse ellipse = new ellipse(new Point2D(1,5), new Point2D(5,2));
        ellipse.printall();
        System.out.println("The area of the ellipse = "+ellipse.getArea());
        System.out.println("===========================");

        
        figure[] figures = {
                line,
                rectangle,
                new line(new Point2D(0, 0), new Point2D(5, 5)),
                new regtangle(new Point2D(2, 2), new Point2D(7, 5)),
                new ellipse(new Point2D(2, 2), new Point2D(7, 5)),
                new regtangle(new Point2D(6, 5), new Point2D(8, 4)),
                new line(new Point2D(0, 0), new Point2D(7, 7)),
        };


        for (figure figure : figures) {
            figure.printall();
            System.out.println();
            System.out.println("===========================");
        }

        double totalCLength = TotalCLength(figures);
        System.out.println("Total contour length: " + totalCLength);
        System.out.println("===========================");


        ((figure)getMaxAreaable(rectangle, new regtangle(new Point2D(2, 23), new Point2D(4,2)))).printall();
        System.out.println();

        System.out.println("Площадь наибольшей фигуры = " +
                getMaxAreaable(rectangle, new regtangle(new Point2D(2, 23), new Point2D(4,2))).getArea());


        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    
        figure m = rectangle;
        for(var f : figures) {
            if (f instanceof Areaable) {
                m = (figure) getMaxAreaable((Areaable) m, (Areaable) f);
            }
        }
        m.printall();
        System.out.println(((Areaable)m).getArea());

    }

    public static double TotalCLength(figure[] figures) {
        double totalLength = 0.0;
        for (figure figure : figures) {
            totalLength += figure.getcontour();
        }
        return totalLength;
    }

    public static Areaable getMaxAreaable(Areaable... fff){
        Areaable max = fff[0];
        for (int i = 1; i < fff.length ; i++) {
            if (fff[i].getArea() > max.getArea()) {
                max = fff[i];
            }
        }
        return max;
    }
}
