import java.util.Scanner;

// 2. Write a function to print the sum of all odd numbers from 1 to n.
public class SumOfOddNum {

    // function to calculate sum of odd numbers
    public static int sumOdd(int n) {
        int sum = 0;
        for(int i=1; i<=n; i++) {  // increment by 2 for odd numbers
          if(i % 2 != 0) {  // check if i is odd
                sum += i;
            } 
        }   
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = sumOdd(n);
        System.out.println("Sum of odd numbers from 1 to " + n + " = " + result);
    }
}
