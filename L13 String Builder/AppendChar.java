public class AppendChar {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("C");
        sb.append("h"); //str = str + "h"
        sb.append("a");
        sb.append("n");
        sb.append("d");
        sb.append("n");
        sb.append("i");

        System.out.println(sb.length());
    }
}
