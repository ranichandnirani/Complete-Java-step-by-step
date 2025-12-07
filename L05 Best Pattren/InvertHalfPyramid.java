public class InvertHalfPyramid {
    public static void main(String[] args) {
        int n = 4;

        // Outer loop for number of rows
        for(int i=n; i>=1; i--) {
            //Inner loop for number of columns
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
