//Mathod Overloading

class Student {
   String name;
   int age;
  
   public void printData(String name) {
       System.out.println(name);
    } 
    public void printData(int age) {
        System.out.println(age);
    }
    
    public void printData(String name, int age) {
        System.out.println(name + " " +age);
    }
}

   
public class FuncOver {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Ritik";
        s1.age = 15;

        s1.printData(s1.age);
    }
}
