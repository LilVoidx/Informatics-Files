public class MaxArray {

  public static void main(String[] args) {
    
    int[] array = {6,-9,57,120,0,4,9,17,-4};
    System.out.println(array);

    //System.out.println(maxElement(array));
    
    //System.out.println(maxElement(array , array.length));
  }
  public static int Sum(int[] a, int n) {
    if (n == 1) return a[0];
    return a[n - 1] + Sum(a,n-1);
}
  
  public static int maxElement(int[] a, int l , int r) {
    if(l == r) return a[l];
    if(l == r - 1) return Math.max(a[l], a[r]);
    
    int m = (r + 1) / 2;
    
    return Math.max(maxElement(a, l ,m),maxElement(a, m+1 ,r));
  }
  
  public static int maxElement(int[] a,int n) {
    if(n == 1) return a[0];
    if(n == 2) return Math.max(a[0], a[1]);
    return Math.max(maxElement(a , n-1), a[n - 1]);

  }
  

  //public static int maxElement(int[] a) {
   //int max = a[0];
    //for (int i = 0; i < a.length; i++) {
     // if(a[i] > max)
       // max = a[i];
   // }
   // return max;
    }
