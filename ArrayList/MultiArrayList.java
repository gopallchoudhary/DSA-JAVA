package ArrayList;

import java.util.ArrayList;

public class MultiArrayList {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<6; i++) {
            list.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
        list2.remove(2);
        list2.remove(3);

        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer> currentList = mainList.get(i);

            for(int n: currentList) {
                System.out.print(n+" ");

            }
            System.out.println();
        }
    }
}