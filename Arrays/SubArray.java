package Arrays;

public class SubArray {

    //.Largest 
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
        for(int i=0; i<numbers.length; i++){
            if(numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        return smallest;
    }

    //.subarray 
    public static void subArray(int numbers[]){
        int size = numbers.length;
        int totalSubarray = size*(size+1)/2;

        int sumSubArray[] = new int[totalSubarray];
        int sum = 0;
        int index = 0;
        
        for(int i=0; i<size; i++) {
            for(int j=i; j<size; j++) {
                for(int k=i; k<=j; k++) {
                    System.out.print(numbers[k]+" ");
                    sum+=numbers[k];
                }
                System.out.println();
                sumSubArray[index] = sum;
                sum=0;
                index++;
            }
            System.out.println();
        }
        System.out.println("Total no. of sub arrays are: "+totalSubarray);
        System.out.println(getLargest(sumSubArray));
        System.out.println(getSmallest(sumSubArray));
    }


    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        subArray(numbers);

        
    }
}
