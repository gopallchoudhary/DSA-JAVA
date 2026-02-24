package Arrays;

public class Majority {
    public static int majorityElement(int[] nums) {
        int l = nums.length;
        int result = nums[0];
        int count = 1;
        for (int i = 1; i < l; i++) {
            if (result == nums[i]) {
                count++;
            } else {
                count--;
                if (count == 0) {
                    result = nums[i];
                    count = 1;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int matrix[] = { 1, 1, 2, 3, 4 };
        System.out.println(majorityElement(matrix));
    }
}
