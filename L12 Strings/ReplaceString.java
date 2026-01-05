
import java.util.Scanner;

//2.  Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 

public class ReplaceString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        String res = " ";

        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == 'e') {
                res += 'i';
            } else {
                res += str.charAt(i);
            }
        }
        System.out.println(res);
    }  
}
