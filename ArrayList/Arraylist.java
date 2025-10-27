package ArrayList;

import java.util.ArrayList;

public class Arraylist {

    public static void reverse(ArrayList<Integer> list) {
        
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        

        // add an element ()
        for (int i = 2; i < 11; i += 2) {
            list.add(i);
        }
        System.out.println(list);

        // add element at index
        list.add(3, 80); // adds and shifts the current element to the next
        System.out.println(list);

        // get element ()
        System.out.println(list.get(4));

        // remove an element ()
        list.remove(3);
        System.out.println(list);

        // set element at index ()
        list.set(1, 44); // replaces the element at index
        System.out.println(list);

        // checks if element is exists or not ()
        System.out.println(list.contains(45));
        System.out.println(list.contains(10));

        // size
        System.out.println(list.size());

        // print arraylist
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}