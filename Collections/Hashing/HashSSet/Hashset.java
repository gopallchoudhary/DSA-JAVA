package Collections.Hashing.HashSSet;

import java.util.*;

public class Hashset {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(1);
        set.add(20);
        set.add(32);
        set.add(45);
        set.add(50);
        set.add(12);
        set.add(1);
        // System.out.println(set);

        // System.out.println(set.contains(2)); // true
        // System.out.println(set.contains(8)); // false

        // set.remove(2);
        // System.out.println(set);

        // System.out.println(set.contains(2));

        // //size
        // System.out.println(set.size());

        // // clear
        // set.clear();
        // System.out.println(set.size());
        // System.out.println(set.isEmpty());

        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        cities.add("Hyderbad");

        // Iterator<String> it = cities.iterator();
        
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // for(String ct: cities) {
        //     System.out.println(ct);
        // }

        System.out.println(cities);
    }
}