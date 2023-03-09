import java.util.Scanner;

public class Hw01Q06{
    public static void main(String[] args) {
        
    System.out.println("Enter the number you want to change to binary: ");
    Scanner scs = new Scanner(System.in);
    int n = scs.nextInt();
    scs.close();

    Binary(n);
    
    }

    private static void Binary(int n) {
        if (n > 1)
        Binary(n / 2);
        System.out.print(n % 2);
    }
}