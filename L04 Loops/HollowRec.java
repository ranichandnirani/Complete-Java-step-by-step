public class HollowRec {
    public static void main(String[] args) {
        
        int m = 4;
        int n = 5;

        // Outer loop for number of rows
        for(int i=1; i<=m; i++) {
            // Inner loop for number of columns
            for(int j=1; j<=n; j++) {
                // Print star for first and last row or first and last column
                if(i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
