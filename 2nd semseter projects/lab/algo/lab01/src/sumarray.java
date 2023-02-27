public class sumarray {
    public static void main(String[] args) {

        int array[] = {23, 34, 78, 34, 68, 89, 45};

        int sum = Sum(array, array.length);
        
        System.out.println(sum);
    }

    public static int Sum(int array[], int n) {
        if (n == 0) {
            return 0;
        }
        return Sum(array, n-1 ) + array[n-1];
    }
}