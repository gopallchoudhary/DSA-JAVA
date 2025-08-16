package Collections.List.ArrayLList;

import java.util.*;

public class Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 1,2,3,4,5);

        System.out.println(arr);
        for(int i = arr.size()-1; i>=0; i--) { // TC -> O(n)
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        //> reverse an array
        int first = 0;
        int last = arr.size()-1;
        while(first < last) {
            int temp = arr.get(first);
            int lastElem = arr.get(last);
            arr.set(first, lastElem);
            arr.set(last, temp);
            first++;
            last--;
        }

        System.out.println(arr);

        
    }
}
