package OOPS;

class Inheritence {

    public static void main(String[] args) {
        Dog kutta = new Dog();
        kutta.eats();
    }
}

// parent/base class
class Animal {
    String color;

    void eats() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// derived/child class
// class Fish extends Animal {
// int fins;

// void swmims() {
// System.out.println("Fishes swims");
// }
// }

// class Mammal extends Animal {
// int legs;
// }

class Dog extends Mammal {
    String breed;
}

// , Hirarchial inheritence
class Mammal extends Animal {
    void walk() {
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swims() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void fly() {
        System.out.println("Fly...");
    }
}

// , Multiple Inheritence
interface A {
    void methodA();
}

interface B {
    void mehtodB();
}

class Hybrid implements A, B {
    public void methodA() {
        System.out.println("mehtod a");
    }

    public void mehtodB() {
        System.out.println();
    }
}

//, Hybrid Inheritence -> combination of everyone (kuch bhi chal raha hai)