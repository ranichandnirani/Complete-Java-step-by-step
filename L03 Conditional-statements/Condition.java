import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } 
        System.out.println("You are not eligible to vote.");
    }
}
