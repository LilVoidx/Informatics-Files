import java.util.Scanner;

public class ReverseSequence {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sequence of numbers (input ends at 0): ");
        int n = sc.nextInt();
        reverse(n,sc);

    }

    public static void reverse(int n, Scanner sc) {

        if (n == 0) return;  // not to be infinte 

        reverse(sc.nextInt(), sc);
        System.out.println(n);
    }
}