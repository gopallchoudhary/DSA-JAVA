package Arrays;

public class sumPrefix {

    public static void maxPrefixArray(int numbers[]) {
        int currentSum = 0;
        int prefixArr[] = new int[numbers.length];
        int maxSum = Integer.MIN_VALUE;

        //# calculate prefix array
        prefixArr[0] = numbers[0];
        for(int i=1; i<prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i-1] + numbers[i]; 
        }

        //? calculate sum
        for(int i=0; i<numbers.length; i++) {
            for(int j=i; j < numbers.length; j++) {
                currentSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];
                if(currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        System.out.println("Max Sum: "+ maxSum);
    }

    
    public static void main(String[] args) {
        int numbers[] = {1,-2,6,-1,3};
        maxPrefixArray(numbers);

    }
}
