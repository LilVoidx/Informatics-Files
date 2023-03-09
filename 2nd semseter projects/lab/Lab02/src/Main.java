import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Exception exception = new Exception();
        Scanner scs = new Scanner(System.in);

        System.out.print("Enter a value for x: ");
        double x = scs.nextDouble();

        try {
            double result = exception.func(x);
            System.out.println("func(" + x + ") = " + result);
        } catch (ArithmeticException e) {
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("An illegal argument exception occurred: " + e.getMessage());
        }
    }
}
