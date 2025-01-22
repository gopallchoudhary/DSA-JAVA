package Arrays;
import java.util.Scanner;

public class Arrays {

    //.Array change 
    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 342;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    //.Linear Search 
    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            } 
        }
        return -1;
    }

    //.key-menus 
    public static int menus(String menu[], String dish) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == dish) {
                return i;
            }
        }
        return -1;
    }

    //.largest
    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    //.smallest 
    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    //.Reverse an array 
    public static void reverse(int numbers[]) {
        int first = 0, last = numbers.length-1;
        while (first < last) {
            int swap = numbers[first];
            numbers[first] = numbers[last];
            numbers[last] = swap;
            first++;
            last--;
        }
        for(int i=0; i<numbers.length; i++) {
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
        
    }

    //.Array pairs 
    public static void printPairs(int numbers[]) {
        int size = numbers.length;
        int totalPairs = size*(size-1)/2;
        for(int i=0; i<size; i++) {
            for(int j=i+1; j<size; j++) {
                System.out.print("("+numbers[i]+","+numbers[j]+") ");
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+totalPairs);
    }

    //.subarray 
    public static void subarray(int numbers[]) {
        int size = numbers.length;
        int totalSubarray = size*(size+1)/2;
        int sumSubArray[] = new int[totalSubarray];
        int sum = 0;
        int index = 0;
        for(int i=0; i<=size-1; i++) {
            for(int j=i; j<=size-1; j++) {
                for(int k=i; k<=j; k++) { //print
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                
                System.out.println();
                //System.out.println("Sum of subArray: "+sum);
                //System.out.println(index);
                sumSubArray[index] = sum;
                //System.out.println("Inserted in array: "+sumSubArray[index]);
                index++;
                sum=0;
            }
            System.out.println();
        }
        System.out.println("Total subarray: "+totalSubarray);
        System.out.println("Smallest in the sum of sub array: "+getSmallest(sumSubArray));
        System.out.println("Largest in the sum of sub array: "+getLargest(sumSubArray));
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        
        //.Arrays Basic 
        //int marks[] = new int[50];
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();
        // System.out.println("phy: " + marks[0]);
        // System.out.println("chem: " + marks[1]);
        // System.out.println("maths: " + marks[2]);
        // int average = (marks[0] + marks[1] +  marks[2])/3;
        // System.out.println("Average: " + average);
        
        //.Array as function arguments 
        // int marks[] = {95, 96, 97};
        // int nonChangeable = 5;
        // update(marks, nonChangeable);
        // System.out.println(nonChangeable);
        // for(int i = 0; i<marks.length; i++){
        //     System.out.print(marks[i]+" ");
        // }
        
        //.Linear Search 
        // int numbers[] = {1,2,53,64,67,23,23,78,98,344,7456,234,765,34};
        // int key = 90;
        // int index = linearSearch(numbers, key);
        // if(index == -1){ 
        //     System.out.println("NOT FOUND");
        // } else {
        //     System.out.println("Key "+key+  " is at the index: "+index);
        // }

        //menu
        // String menu[] = {"dosa", "idli", "bada", "chhole bhature", "samosa", "Kachoudi"};
        // String dish = "lawdaPaw";
        // int ind = menus(menu, dish);
        // if(ind == -1) {
        //     System.out.println("NOT FOUND");
        // } else {
        //     System.out.println(dish + " is at the index: " + ind);
        // }
        
        // int numbers[] = {-23,5,6,7,23,44,23,75,86,12,34,98,34};
        // System.out.println("Largest value is: "+getLargest(numbers));
        // System.out.println("The smallest value is: "+getSmallest(numbers));
        // System.out.println(numbers.length);

        //.Reverse an Array 
        //time complexity = n
        //space complexity = 1
        //int numbers[] = {2,4,6,8,10,12,14};
        //reverse(numbers);

        //.Pairs in an array 
        //TC = Math.pow(n,2)
        // int numbers[] = {2,4,6,8,10};
        // printPairs(numbers);

        //.Subarrays 
        //continuous part of an array
        int numbers[] = {2,4,6,8,10};
        subarray(numbers);
        
        

        
        sc.close();
    }
    
}
