package Arrays;

public class RemoveDuplicates {
    public static int remdup(int arr[]) {
        int k = 1;
        // int removed = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[k] = arr[i];
                k++;
            } 
        }
        return k;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2};
        System.out.println(remdup(arr));
    }
}