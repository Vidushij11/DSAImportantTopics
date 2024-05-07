package RecursionProblems;

public class binarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int target = 7;
        if (binarySearch(arr, target, 0, arr.length - 1)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    public static boolean binarySearch(int arr[], int tar, int s, int e) {
        if (s > e)
            return false;
        int mid = (s + e) / 2;
        if (arr[mid] == tar)
            return true;
        if (tar > arr[mid]) {
            return binarySearch(arr, tar, mid + 1, e);
        }
        return binarySearch(arr, tar, s, mid - 1);
    }
}
