package Collections.Queue;

import java.util.*;

public class Que {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);

        // while (!q.isEmpty()) {
        //     System.out.println(q.poll());
        // }

        // . Deque 

        Deque<Integer> de = new LinkedList<>();
        de.addFirst(1);
        de.addFirst(2);
        de.addLast(3);
        System.out.println(de.getFirst());
        System.out.println(de.getLast());
        System.out.println(de);
    }
}
