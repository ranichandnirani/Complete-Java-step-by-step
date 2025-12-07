public class InverthalfPyNum {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop for number of rows
        for(int i=1; i<=n; i++) {
            // Inner loop for numbers
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
