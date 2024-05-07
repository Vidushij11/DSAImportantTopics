package RecursionProblems;

public class sortedArray {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 41, 45, 10 };
        int size = arr.length;

        boolean ans = isSorted(arr, 0);
        if (ans) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

    public static boolean isSorted(int arr[], int idx) {
        if (arr.length == 0 || arr.length == 1 || idx == arr.length - 1)
            return true;
        if (arr[idx] > arr[idx + 1])
            return false;
        return isSorted(arr, idx + 1);
    }
}
