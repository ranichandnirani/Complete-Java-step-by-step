import java.util.Scanner;

// 3. Write a function which takes in 2 numbers and returns the greater of those two.

public class GreaterNum {

    // function to find greater number
    public static int max(int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        int greater = max(num1, num2);
        System.out.println("The greater number is: " + greater);
    }
}

