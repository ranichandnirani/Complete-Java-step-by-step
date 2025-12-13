

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing somthing");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void penType() {
        System.out.println(this.type);
    }
}

public class OOPs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ballpen";

        
        
        pen1.printColor();
        pen2.printColor();
        pen1.penType();
        pen2.penType();

    }
}
