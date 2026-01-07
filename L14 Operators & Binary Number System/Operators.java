
//1. Using Basic Operators
public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Sum: " + (a + b));    // 15
        System.out.println("Diff: " + (a - b));  // 5
        System.out.println("Product: " + (a * b)); // 50
        System.out.println("Div: " + (a / b));    // 2
        System.out.println("Mod: " + (a % b));    // 0


        //2. Bitwise Operators
        
        int x = 5;      // binary 0101
        int y = 3;      // binary 0011

        System.out.println("x & y : " + (x & y)); // 1 (0001)
        System.out.println("x | y : " + (x | y)); // 7 (0111)
        System.out.println("x ^ y : " + (x ^ y)); // 6 (0110)
        System.out.println("~x : " + (~x));       // bitwise NOT
    

        //3. Shift Operators

        int num = 8;      // 00001000
        System.out.println("Left shift: " + (num << 1));  // 16
        System.out.println("Right shift: " + (num >> 2)); // 2 

        //4. Binary Conversion Utility
        
        int num2 = 13;
        String binary = Integer.toBinaryString(num2);
        System.out.println(num2 + " in binary = " + binary);
    }
}
