import java.util.Scanner;

// 4. Write a function that takes in the radius as input and returns the circumference of a circle.

public class Circle {

    // function to calculate circumference
    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the circle: ");
        double r = sc.nextDouble();

        double result = circumference(r);
        System.out.println("Circumference of the circle = " + result);
    }
}

