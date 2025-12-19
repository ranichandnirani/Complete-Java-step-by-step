// NonParamiterized constructor

class Student {
   String name;
   int age;
  
   public void pritInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
   }
   Student() {
       System.out.println("Constructor called");
   }
}

public class NonPara {
    public static void main(String[] args) {
         
        Student s1 = new Student();
        s1.name = "Chandni";
        s1.age = 21;

        s1.pritInfo();
    }
}
