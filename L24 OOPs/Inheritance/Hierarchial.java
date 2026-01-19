package Inheritance;

class Animal {
    void eat(){
        System.out.println("Animal eats food.");
    }
}
class Cat extends Animal {
    void meow(){
        System.out.println("Meow");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("Bark");
    }
}
public class Hierarchial {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
