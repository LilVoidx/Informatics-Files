import java.util.Scanner;

public class nsqrt {
    public static void main(String[] args) {
        Scanner scs = new Scanner(System.in);

        System.out.println("Enter an integer n");

        int n = scs.nextInt();

        double x = calculate(n);

        System.out.println("x(" + n +") = " + x);
    }

    public static double calculate(int n) {
        if (n == 0) return 0;
        if (n == 1) return Math.sqrt(2);
        return Math.sqrt(2 + calculate(n - 1));

    }
}