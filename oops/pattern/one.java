package pattern;


public class one {
   
    public static void pattern1(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalCol = i > n ? 2 * n - i : i;
    
            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // star pattern
       public static void pattern2(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalCol = i > n ? 2 * n - i : i;
    
            int totalNoOfSpaces = n - totalCol;
            for(int k = 1;  k <= totalNoOfSpaces; k++){
                System.out.print(" ");
            }
            for (int j = 1; j <= totalCol; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
  public static void pattern3(int n) {
        for (int i = 1; i <=n; i++) {
    
            int totalNoOfSpaces = n - i;
            for(int k = 1;  k <= totalNoOfSpaces; k++){
                System.out.print(" ");
            }
           for(int col = i; col >= 1; col--){
                System.out.print(col);
           }
           for(int col = 2; col <= i; col++){
                System.out.print(col);
           }
            System.out.println();
        }
    }
      public static void pattern4(int n) {
        for (int i = 1; i <= 2 * n; i++) {
            int totalCol = i > n ? 2 * n - i : i;
            int totalNoOfSpaces = n - totalCol;
            
            for(int k = 1;  k <= totalNoOfSpaces; k++){
                System.out.print(" ");
            }
           for(int col = totalCol; col >= 1; col--){
                System.out.print(col);
           }
           for(int col = 2; col <= totalCol; col++){
                System.out.print(col);
           }
            System.out.println();
        }
    }
    public static void pattern5(int n ){
         n = n * 2;
         for(int i = 0; i < n; i++){
             for(int j = 0; j < n; j++){
                 int indexVal = Math.min(Math.min(i, j), Math.min(n-1, n-j));
                 System.out.print(indexVal +" ");
             }
              System.out.println();

         }
    }
    public static void pattern6(int n ){
        int originalN = n;
         n = 2 * n;
         for(int i = 0; i <= n; i++){
             for(int j = 0; j <= n; j++){
                 int indexVal = originalN - Math.min(Math.min(i, j), Math.min(n-i, n-j));
                 System.out.print(indexVal + " ");
             }
              System.out.println();

         }
    }
    public static void main(String[] args) {
        int n = 4;
        pattern2(n);

    }
}
