import java.util.Scanner;

//Q- Take an array as input from the user. Search for given number x and print the index at which it occurs.

public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        //Input
        for(int i=0; i<size; i++) {
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        //Output
        for(int i=0; i<number.length; i++) {
            if(number[i] == x) {
                System.out.println("x is foundat index=" + i);
            }
        }
    }
}
