abstract class Animal {
    abstract void walk();
}

class Horse extends Animal {
    public void walk() {
        System.out.println("Walk on for legs");
    }
}

class Chicken extends Animal {
    public void walk() {
        System.out.println("walk on 2 legs");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Horse horse = new Horse();
        Chicken chicken = new Chicken();

        horse.walk();
        chicken.walk();
    }
}

