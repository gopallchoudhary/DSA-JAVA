package Arrays;

public class SubArray {
    public static void subArray(int numbers[]){
        int size = numbers.length;
        int totalSubarray = size*(size+1)/2;
        
        for(int i=0; i<size; i++) {
            for(int j=i; j<size; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total no. of sub arrays are: "+totalSubarray);
    }
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        subArray(numbers);
    }
}
