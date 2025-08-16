package Collections.List.ArrayLList;

import java.util.*;

public class Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1,2,3,4,5);

        int max = Integer.MIN_VALUE;
        System.out.println(max);

        for(int i = 0; i<arr.size(); i++) {
            if(arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        System.out.println(max);
    }
}
