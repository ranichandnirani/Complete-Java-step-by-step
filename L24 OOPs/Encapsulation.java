class Student {
    // private data members
    private String name;
    private int age;

    // public getter
    public String getName() {
        return name;
    }

    // public setter
    public void setName(String name) {
        this.name = name;
    }

    // public getter
    public int getAge() {
        return age;
    }

    // public setter
    public void setAge(int age) {
        if (age > 0) {   // validation
            this.age = age;
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();

        s.setName("Chandni");
        s.setAge(20);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
