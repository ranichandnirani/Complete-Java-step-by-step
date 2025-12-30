import java.util.Scanner;

public class UserDefine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[] = new int[size];

        //For input
        for(int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }

        // Output
        for(int i=0; i<size; i++) {

            System.out.println(number[i]);
        } 
    }
}
