package ArrayList;

import java.util.ArrayList;

public class PairSumTwo {
    public static boolean pairSumTwo(ArrayList<Integer> list, int target) {
        int n = list.size();
        int lp = 0, rp = 0;
        for(int i=0; i<n; i++) {
            if(list.get(i) > list.get(i+1)) {
                rp = i;
                lp = i+1;
                break;
            }
        }

        while(lp != rp) {
            int currentSum = list.get(lp) + list.get(rp);
            if(currentSum == target) {
                return true;
            } else if(currentSum > target) {
                rp = (rp+n-1) % n;
            } else {
                lp = (lp+1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10); 
        System.out.println(pairSumTwo(list, 17));
    }
}