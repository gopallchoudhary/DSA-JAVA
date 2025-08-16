package OOPS;

public class HierarchyConstructor {

    public static void main(String[] args) {
        Horse h = new Horse();
    }
}


class Animal {
    Animal () {
        System.out.println("Animal constructor is called..");
    }
}


class Horse extends Animal {
    Horse() {
        System.out.println("Horse constructor is called");
    }
}

class Mustang extends Horse{
    Mustang() {
        System.out.println("Mustang constructor is called");
    }
}