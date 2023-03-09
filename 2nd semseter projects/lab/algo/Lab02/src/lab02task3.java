import java.util.Arrays;
import java.util.Random;

public class lab02task3 {
    public static void main(String[] args) {
        int n = 5;
        int m = 3;
        int[][] a = new int[n][m];
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = rand.nextInt(10);
            }
        }

        int changes = 0;
        for (int j = 0; j < m; j++) {
            changes += sortColumn(a, j);
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
        System.out.println("Index changes: " + changes);
    }

    public static int sortColumn(int[][] a, int j) {
        int changes = 0;
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int k = i + 1; k < a.length; k++) {
                if (a[k][j] < a[minIndex][j]) {
                    minIndex = k;
                }
            }
            if (i != minIndex) {
                int temp = a[i][j];
                a[i][j] = a[minIndex][j];
                a[minIndex][j] = temp;
                changes++;
            }
        }
        return changes;
    }
}
