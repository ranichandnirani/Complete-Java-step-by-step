package Inheritance;

class Animal {
    void eat() {
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}
class Puppy extends Dog {
    void weep() {
        System.out.println("Weep");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();
        p.bark();
        p.weep();
    }
}
