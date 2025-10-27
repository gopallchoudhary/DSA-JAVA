package ArrayList;

import java.util.*;

public class MaxWater {
    public static int maximumWater(ArrayList<Integer> list) {
        int maxWater = 0;
        // for(int i=0; i<list.size(); i++) {
        //     int currentWater = 0;
        //     for(int j=i+1; j<list.size(); j++) {
        //         int height = Math.min(list.get(i), list.get(j));
        //         int width = j-i;
        //         currentWater = height*width;
        //         maxWater = Math.max(currentWater, maxWater);
        //     }
        // }

        //, 2 pointer approach 
        int i=0, j=list.size()-1;
        while(i<=j) {
            int currentWater = 0;
            int height = Math.min(list.get(i), list.get(j));
            int width = j-i;
            currentWater = height*width;
            maxWater = Math.max(maxWater, currentWater);
            if(list.get(i) < list.get(j)) {
                i++;
            } else if(list.get(i) == list.get(j)){
                i++;
                j--;
            } else {
                j--;
            }
        }
        return maxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        System.out.println(maximumWater(list));
    }
}