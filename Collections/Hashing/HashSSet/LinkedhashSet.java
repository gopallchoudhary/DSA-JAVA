package Collections.Hashing.HashSSet;

import java.util.*;

public class LinkedhashSet {

    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Noida");
        lhs.add("Bengaluru");
        lhs.add("Hyderbad");

        
        System.out.println(lhs);
    }
}