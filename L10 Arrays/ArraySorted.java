import java.util.Scanner;

//Q-4:Take an array of numbers as input and check if it is an array sorted in ascending order.(1, 2, 3, 4, 5)ascending order. (8, 4, 9, 6, 0) not ascending order.

public class ArraySorted {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int size = sc.nextInt();
      int numbers[] = new int[size];


      //input
      for(int i=0; i<size; i++) {
          numbers[i] = sc.nextInt();
      }


      boolean isAscending = true;
     
       for(int i=0; i<numbers.length-1; i++) { // NOTICE numbers.length - 1 as termination condition
           if(numbers[i] > numbers[i+1]) { // This is the condition for descending order
               isAscending = false;
           }
       }


       if(isAscending) {
           System.out.println("The array is sorted in ascending order");
       } else {
           System.out.println("The array is not sorted in ascending order");
       }
      
   }

}
