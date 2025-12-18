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

class EquilateralTriangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h); //Derived class
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        
    }
}
