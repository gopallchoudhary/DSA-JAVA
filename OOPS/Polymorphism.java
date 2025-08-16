package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        //> overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(2, 3));
        System.out.println(calc.sum(2.3f, 3.8f));
        System.out.println(calc.sum(2, 3, 7));

        //> overriding
        Deer d = new Deer();
        d.eat(); // same functon name in parent & child but the one in child will run
    }
}

// > method overloading
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

// > method overriding
class Animal {
    void eat() {
        System.out.println("eats anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("eats grass");
    }
}
