package Greedy;
import java.util.*;

public class Coins {

    public static void main(String[] args) {
        int deno[] = { 1, 2, 5, 10, 20, 50, 100, 500,2000};
        int amt = 124;
        List<Integer> result = new ArrayList<>();

        for(int i=deno.length-1; i>=0; i--){
            while (amt >=  deno[i]) {
                amt -= deno[i];
                result.add(deno[i]);
            }
        }
        int sum = 0;
        for(Integer n: result) {
            sum+=n;
        }
        System.out.println(result);
        System.out.println(sum);
    }
}