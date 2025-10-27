package ArrayList;

import java.util.ArrayList;

public class PairSum {

    public static boolean pairSum1(ArrayList<Integer> list, int target) {
        // for(int i=0; i<list.size(); i++) {
        //     for(int j=i+1; j<list.size(); j++) {
        //         if(list.get(i) + list.get(j) == target) {
        //             return true;
        //         }
        //     }
        // }

        //, 2 pointer approach O(n) 
        int i=0, j=list.size()-1;
        while(i<=j) {
            // case-1
            if(list.get(i) + list.get(j) == target) {
                return true;
            } else if(list.get(i) + list.get(j) > target) { 
                // case-2
                j--;
            } else {
                // case-3
                i++;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i<=6; i++) {
            list.add(i);
        }

        System.out.println(pairSum1(list, 5));

        
    }
}