package Arrays;

public class maxSubArray {

    public static void maaxSubArray(int numbers[]) {
        int size = numbers.length;
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        System.out.print("Current Sum: ");

        for(int i=0; i<size; i++) {
            for(int j=i; j<size; j++) {
                currentSum = 0;
                for(int k=i; k<=j; k++) {
                    //System.out.print(numbers[k]+" ");
                    currentSum+=numbers[k];
                }
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    
                }

                if(currentSum < minSum) {
                    minSum = currentSum;
                }
                System.out.print(currentSum+", ");
            }

        }
        System.out.println();
        System.out.println("Maximum sub array is: "+ maxSum);
        System.out.println("Minimum sub array is: "+ minSum);

    }
    public static void main(String[] args) {
        int numbers[] = {-2,1,-3,4,-1,2,1,-5,4};
        maaxSubArray(numbers);

    }
}
