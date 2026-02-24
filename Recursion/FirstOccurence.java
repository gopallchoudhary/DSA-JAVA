package Recursion;

public class FirstOccurence {
    public static int firstOcc(int arr[], int i, int key) {
        if (arr[i] == key) {
            return i;
        } else if (arr.length == i)  {
            return -1;
        } else {
            return firstOcc(arr, i + 1, key);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 36, 23, 9, 3, 6, 200 };
        System.out.println(firstOcc(arr, 0, 200));
    }
}