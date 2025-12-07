public class FloyedTriangle {
    public static void main(String[] args) {
        
        int n = 5;
        int number = 1;

        // Outer loop for number of rows
        for(int i=1; i<=n; i++) {
            // Inner loop for numbers
            for(int j=1; j<=i; j++) {
                System.out.print(number +" ");
                number++;
            }
            System.out.println();
        }
    }
}
