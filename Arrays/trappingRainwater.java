package Arrays;

public class trappingRainwater {

    /// leftMaxBoundary 
    /* public static int[] leftMaxBoundary(int height[]) {
        int n = height.length;
        int result[] = new int[n];
        int leftMax = 0;
        for(int i = 0; i<n; i++) {
            if(height[i] > leftMax) {
                leftMax = height[i];
            }
            result[i] = leftMax;
        }
        return result;
    } */

    ///rightMaxBoundary 
    /* public static int[] rightMaxBoundary(int height[]) {
        int n = height.length;
        int result[] = new int[n];
        int rightMax = 0;
        for(int i = n-1; i>=0; i--) {
            if(height[i] > rightMax) {
                rightMax = height[i];
            }
            result[i] = rightMax;
        }
        return result;
    } */

    //. Trap 
    /* public static int trappedRainwater(int height[]) {
        int leftMax[] = leftMaxBoundary(height);
        int rightMax[] = rightMaxBoundary(height);
        int totalTrappedWater = 0;

        int arrSize = height.length;
        
        for(int i=0; i<height.length; i++) {
            if(arrSize == 1 && arrSize == 2) {
                totalTrappedWater = 0;
            } else {

                int waterLever = Math.min(leftMax[i], rightMax[i]);
                totalTrappedWater += waterLever - height[i];
                
            }
        }
        return totalTrappedWater;
    } */

    //. Trap (optimized)
    public static int trappedRainwater(int height[]) {
        int n = height.length;

        //rightMax
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }
        

        //rightMax
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }
        


        //trappedWater
        int trappedWater = 0;
        
        //loop
        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater+=waterLevel - height[i];
        }
        
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedRainwater(height));
    }
}
