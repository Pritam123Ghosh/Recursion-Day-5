// Check if an array is sorted (Strickly increasing)
// {1,2,3,4,5}
public class SortedArray {
    public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length - 1) {
            return true;
        }
        if (arr[idx] < arr[idx + 1]) {
            return isSorted(arr, idx + 1);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 3, 4 };
        System.out.println(isSorted(arr, 0));
    }
}