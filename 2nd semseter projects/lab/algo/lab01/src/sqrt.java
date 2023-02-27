public class sqrt {
    public static void main(String[] args) {

        sqrtt(5);
    }
     public static void sqrtt(int n){

        if (n == 0) return;

        sqrtt(n-1);
        System.out.println(n + "  " + Math.pow(n, 2));

     }
}
