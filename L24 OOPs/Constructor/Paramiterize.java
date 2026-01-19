package Constructor;

class Student {
   String name;
   int age;
  
   public void printInfo() {
    System.err.println(this.name);
    System.out.println(this.age);
   }
   Student(String name, int age) {   // Paramiterize constructors
       this.name = name;
       this.age = age;
   }
}
public class Paramiterize {
    public static void main(String[] args) {
        Student s1 = new Student("Ritik", 15);
        

        s1.printInfo();
    }
}
