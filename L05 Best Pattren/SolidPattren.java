public class SolidPattren {
    public static void main(String[] args) {
        
        int m = 4;
        int n = 5;

        // Outer loop for number of rows
        for(int i=1; i<=m; i++) {
            // Inner loop for number of columns
            for(int j=1; j<=n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
