import java.util.Scanner;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        double[] array = new double[10];

        
        inputArray(array, 3, 7);
        System.out.println("Array after inputArray() method:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }

       
        fillArray(array, 3, 7);
        System.out.println("Array after fillArray() method:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ": " + array[i]);
        }
    }

    public static void inputArray(double[] array, int k1, int k2) {
        Scanner scanner = new Scanner(System.in);
        for (int i = k1; i <= k2; i++) {
            System.out.print("Enter element " + i + ": ");
            array[i] = scanner.nextDouble();
        }
        scanner.close();
    }

    public static void fillArray(double[] array, int k1, int k2) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            if (i >= k1 && i <= k2) {
                array[i] = rand.nextDouble();
            }
        }
    }
}
