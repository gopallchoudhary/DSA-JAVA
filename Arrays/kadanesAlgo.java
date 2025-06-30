package Arrays;

public class kadanesAlgo {

    public static void maxSumArray(int numbers[]) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        System.out.print("Current Sum: ");
        for(int i=0; i<numbers.length; i++) {
            currentSum+=numbers[i];
            
            if(currentSum < 0) {
                currentSum = 0;
            }
            
            System.out.print(currentSum+", ");

            maxSum = Math.max(maxSum, currentSum);
        }
        System.out.println();
        System.out.println("Max sum: "+ maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = { 1, -2, 6, -1, 3 };
        maxSumArray(numbers);

    }
}
