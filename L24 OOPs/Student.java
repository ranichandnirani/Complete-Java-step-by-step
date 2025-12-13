class  cStudent {
    String name;
    int age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class Student {
    public static void main(String[] args) {
        cStudent s1 = new cStudent();
        s1.name = "Ritik";
        s1.age = 15;

        s1.printInfo();
    }
}
