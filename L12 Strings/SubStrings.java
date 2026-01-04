public class SubStrings {
    public static void main(String[] args) {
        String sentence = "My name is Chandni";
      
        String name = sentence.substring(11, sentence.length());
        System.out.println(name);

        //Strings are immutable(we can't change)
    }
}
