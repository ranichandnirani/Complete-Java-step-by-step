public class StringInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        sb.insert(2, "n"); //insert
        System.out.println(sb);

        //delete the n
        sb.delete(2, 4);
        System.out.println(sb);
    }
}
