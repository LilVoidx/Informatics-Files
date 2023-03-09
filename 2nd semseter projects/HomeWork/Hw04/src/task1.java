import java.util.Random;

public class task1 {
    public static void main(String[] args) {
       
        System.out.println(calculate(-5.0)); 
        System.out.println(calculate(5.0));
        System.out.println(calculate(Double.NaN));
        System.out.println(calculate(Double.POSITIVE_INFINITY));
    }

    public static double calculate(double x) {
        try {
            if (Double.isNaN(x)) {
                throw new IllegalArgumentException("Input is not a number (NaN)");
            }
            if (Double.isInfinite(x)) {
                throw new IllegalArgumentException("Input is infinite");
            }

            Random rand = new Random();
            int a = rand.nextInt(101) - 50;

            if (x < 0) {
                return x + Math.pow(Math.sin(1/(x-a) + 4), 2);
            } else {
                return (a*x)/(Math.sqrt(Math.pow(a, 2) - Math.pow(x, 2)));
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return Double.NaN;
        }
    }
}
