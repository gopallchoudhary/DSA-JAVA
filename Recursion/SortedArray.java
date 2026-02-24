package Recursion;

public class SortedArray {
    public static boolean isSorted(int arr[], int i) {
        if(arr.length-1 == i) {
            return true;
        } else if(arr[i] > arr[i+1]) {
            return false;
        } else {
            return isSorted(arr, i+1);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,3,38,5,6,9,10};
        System.out.println(isSorted(arr, 0));
    }
}