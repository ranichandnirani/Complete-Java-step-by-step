import java.util.Scanner;

public class MarkCal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter English Marks: ");
        int english = sc.nextInt();

        System.out.print("Enter Maths Marks: ");
        int math = sc.nextInt();

        System.out.print("Enter Science Marks: ");
        int science = sc.nextInt();

        int total = english + math + science;
        double average = total / 3.0;

        // Displaying the results

        System.out.println("Student Marks Report");
        System.out.println("Student Name: " + name);
        System.out.println("English Marks: " + english);
        System.out.println("Maths Marks: " + math);
        System.out.println("Science Marks: " + science);
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Marks: %.2f%n", average);
        
        sc.close();
    }
}