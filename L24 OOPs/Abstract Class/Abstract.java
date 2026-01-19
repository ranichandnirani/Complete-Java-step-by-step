
// Abstract class

abstract class Animal {
    abstract void sound();  // abstract method

    void eat() {            // concrete method
        System.out.println("This animal eats food");
    }
}

// Subclass extends abstract class
class Dog extends Animal {
    
    @Override
    void sound() {          // implementing abstract method
        System.out.println("Dog barks");
    }
}

public class Abstract {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // cannot instantiate abstract class directly
        myDog.sound();             // Dog barks
        myDog.eat();               // This animal eats food
    }
}
