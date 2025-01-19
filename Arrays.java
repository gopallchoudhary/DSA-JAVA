import java.util.Scanner;

public class Arrays {

    public static void update(int marks[], int nonChangeable) {
        nonChangeable = 342;
        for(int i=0; i<marks.length; i++) {
            marks[i] = marks[i] + 2;
        }
    }

    public static int linearSearch(int numbers[], int key) {
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == key){
                return i;
            } 
        }
        return -1;
    }

    public static int menus(String menu[], String dish) {
        for(int i=0; i<menu.length; i++) {
            if(menu[i] == dish) {
                return i;
            }
        }
        return -1;
    }

    public static int getLargest(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static int getSmallest(int numbers[]) {
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
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
        
        int numbers[] = {-23,5,6,7,23,44,23,75,86,12,34,98,34};
        System.out.println("Largest value is: "+getLargest(numbers));
        System.out.println("The smallest value is: "+getSmallest(numbers));

        
        sc.close();
    }
    
}
