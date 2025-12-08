import java.util.Scanner;

public class TwoNameAndAge {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = sc.next();

        System.out.print("Enter last name: ");
        String lastName = sc.next();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        // Displaying the results
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);   
        System.out.println("Age: " + age);

        sc.close();
        
    }
}
