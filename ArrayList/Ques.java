package ArrayList;
import java.util.*;
public class Ques {

    //. Reverse 
    public static void reverseArrayList(ArrayList<Integer> list) {
        int first = 0;
        int last = list.size()-1;
        while(first<=last) {
            int temp = list.get(first);
            list.set(first, list.get(last));
            list.set(last, temp);
            first++;
            last--;
        }
    }

    //. Maximum 
    public static int maximum(ArrayList<Integer> list) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++) {
            // if(list.get(i) > max) {
            //     max = list.get(i);
            // }
            max = Math.max(max, list.get(i));
        }

        return max;
    }

    public static void swap(ArrayList<Integer> list) {
        int temp = list.get(1);
        list.set(1, list.get(3));
        list.set(3, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(23);
        list.add(1);
        list.add(34);
        list.add(55);

        Collections.sort(list);
        //System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        //System.out.println(list);

        ArrayList<String> names = new ArrayList<>();
        names.add("Gopal");
        names.add("Raman");
        names.add("Digesh");
        names.add("Kona");
        names.add("Amina");
        names.add("HB");

        Collections.sort(names, Collections.reverseOrder());
        System.out.println(names);
    }
}