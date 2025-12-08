public class HalfPyramidNum {
    public static void main(String[] args) {
        
        int n = 5;

        // Outer loop for number of rows
        for(int i=1; i<=n; i++) {
            // Inner loop for numbers
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
