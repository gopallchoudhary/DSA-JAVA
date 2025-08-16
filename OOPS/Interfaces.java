package OOPS;

public class Interfaces {

    public static void main(String[] args) {
        // Queen q = new Queen();
        // q.moves();

        // Rook r = new Rook();
        // r.moves();

        // Knight k = new Knight();
        // k.moves();

        Beer b = new Beer();
        b.eatsFlesh();
        b.eatsVeggie();


    }
}

interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("up down left right (all 4 directions)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("only straight moves in all directions");
    }
}

class Knight implements ChessPlayer {
    public void moves() {
        System.out.println("Dhaii kadam");
    }
}

// , multiple inheritence

interface Herbivore {
    void eatsFlesh();
}

interface Carnivore {
    void eatsVeggie();
}


class Beer implements Herbivore, Carnivore {
    public void eatsFlesh() {
        System.out.println("Eats flesh and meat");
    }

    public void eatsVeggie() {
        System.out.println("Eats green vegatables");
    }
}