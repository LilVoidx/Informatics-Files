import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] a = {5, 4, 1, 3, 2};
        int[] b = {23, 14, 5, 56, -7, 9, 18, 34, 0, 2};

        selectionSort(a);
        System.out.println(Arrays.toString(a));
        System.out.println();

        selectionSort(b);
        System.out.println(Arrays.toString(b));
        System.out.println();
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < array.length; j++){
                if (array[j] < array[index]){
                    index = j;
                }
            }
            
            int min = array[index];
            array[index] = array[i];
            array[i] = min;
        }
        return array;
    }
}
