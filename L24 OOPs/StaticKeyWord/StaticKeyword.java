package StaticKeyWord;

class Student {

    static String college = "ABC University"; // static variable
    int rollNo;
    String name;

    Student(int r, String n) {
        rollNo = r;
        name = n;
    }

    static void changeCollege() { // static method
        college = "XYZ University";
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student.changeCollege(); // calling static method

        Student s1 = new Student(1, "Chandni");
        Student s2 = new Student(2, "Aman");

        s1.display();
        s2.display();
    }
}

