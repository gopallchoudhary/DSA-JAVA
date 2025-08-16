package OOPS;

public class Abstraction {

    public static void main(String[] args) {
        Horse h = new Horse();
        h.eat();
        h.walk();
        h.changeColor();
        System.out.println(h.color);

        // Animal a = new Animal(); -> we cannot create the object of an abstract class
    }
}

abstract class Animal {
    String color;

    Animal() {
        color = "Brown";
    }

    void eat() {
        System.out.println("animal eats");
    }

    abstract void walk();
}

class Horse extends Animal {
    void walk() {
        System.out.println("horse walks on 4 legs");
    }

    void changeColor() {
        color = "dark brown";
    }
}

class Chicken extends Animal {
    void walk() {
        System.out.println("chicken walks on 2 legs");
    }

    void changeColor() {
        color = "yellow";
    }
}