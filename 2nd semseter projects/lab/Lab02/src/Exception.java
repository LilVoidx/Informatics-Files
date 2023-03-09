import java.util.Random;

public class Exception {

    private double a;

    public Exception() {
        Random rand = new Random();
        a = rand.nextInt(101) - 50;
    }

    public double func(double x) throws ArithmeticException {
        if (x < 0) {
            return x + Math.pow(Math.sin((1 / (x - a)) + 4), 2);
        } else if (x >= 0) {
            if (a * a - x * x < 0) {
                throw new ArithmeticException("Invalid argument for sqrt()");
            } else {
                return a * x / (Math.sqrt(a * a - x * x));
            }
        } else {
            throw new IllegalArgumentException("x cannot be NaN");
        }
    }
}
