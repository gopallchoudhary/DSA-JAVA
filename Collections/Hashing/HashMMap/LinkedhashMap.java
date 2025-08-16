package Collections.Hashing.HashMMap;

import java.util.*;

public class LinkedhashMap {

    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);

        // . treemap
        TreeMap<String, Integer> trm = new TreeMap<>();
        trm.put("India", 100);
        trm.put("China", 150);
        trm.put("US", 50);
        System.out.println(trm);

    }
}