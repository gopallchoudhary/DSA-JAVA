package Collections.List.Stack;

import java.util.*;

public class Stackk {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s);
    }
}
