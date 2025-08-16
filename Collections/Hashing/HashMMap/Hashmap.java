package Collections.Hashing.HashMMap;

import java.util.*;

public class Hashmap {

    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();

        // insert
        hm.put("China", 150);
        hm.put("India", 100);
        hm.put("US", 50);

        // > Iterate
        // for (Map.Entry<String, Integer> cv : hm.entrySet()) {
        // System.out.println(cv);
        // }
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for(String k: keys) {
            System.out.println(k +"=" + hm.get(k));
        }


        // get
        int populationIndia = hm.get("India");
        System.out.println(populationIndia);
        System.out.println(hm.get("South Korea"));

        // containsKey
        System.out.println(hm.containsKey("India")); // true
        System.out.println(hm.containsKey("Japan")); // true

        // remove
        System.out.println(hm);
        hm.remove("China");
        System.out.println(hm);

        // size
        System.out.println(hm.size());

        // isEmpty
        hm.clear();
        System.out.println(hm.isEmpty());
        System.out.println(hm);

    }
}