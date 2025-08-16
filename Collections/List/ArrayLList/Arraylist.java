package Collections.List.ArrayLList;

import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        // add element
        Collections.addAll(nums, 38, 98, 89, 12, 23);
        System.out.println("size of list" + nums.size());
        System.out.println(nums);

        // get element
        System.out.println("at index 3: " + nums.get(3));

        // remove element
        nums.remove(2);
        System.out.println("Afer removing an element from index 2:");
        System.out.println(nums);

        // set element at index
        nums.set(2, 10);
        System.out.println("Array after adding an element at index 2: ");
        System.out.println(nums);

        // if array contains an element?
        System.out.println("does array contains 23 " + nums.contains(23)); // ture
        System.out.println("does array contains 92 " + nums.contains(92)); // false

        // size of an array list
        System.out.println("size " + nums.size());

        // loop to print all the values
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
    }
}
