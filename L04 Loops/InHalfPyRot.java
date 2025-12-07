public class InHalfPyRot {
    public static void main(String[] args) {
        
        int n = 4;
        // Outer loop for number of rows

        for(int i=1; i<=n; i++) {
            //Inner loop for spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // Inner loop for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
