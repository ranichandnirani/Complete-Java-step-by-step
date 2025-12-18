class Shape {
    public void area() {
        System.out.println("Displays area"); // Base class
    }
}
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h); // Derived Class
    }
}

class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        
    }
}
