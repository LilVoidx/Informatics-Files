import java.util.Arrays;

public class lab02task2 {
    public static void main(String[] args) {
        int[] a = {5, 2, 9, 1, 5, 6,};
        int changes = selectionSort(a);
        System.out.println("=================================");
        System.out.println("Sorted array: " + Arrays.toString(a));
        System.out.println("---------------------------------");
        System.out.println("Number of changes: " +"["+changes+"]");
        System.out.println("=================================");
    }

    public static int findMinIndex(int[] arr, int start, int end) {
        int minIndex = start;
        for (int i = start + 1; i <= end; i++) {
            if (arr[i] < arr[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    public static int selectionSort(int[] a) {
        int changes = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = findMinIndex(a, i, a.length - 1);
            if (i != minIndex) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
                changes++;
            }
        }
        return changes;
    }
}
