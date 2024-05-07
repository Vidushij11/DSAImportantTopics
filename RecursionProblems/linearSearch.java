package RecursionProblems;

public class linearSearch {
    public static void main(String[] args) {
        int arr[] = { 2, 34, 51, 1, 3 };
        int target = 39;
        if (linearSearch(arr, target, 0)) {
            System.out.println("found");
        } else {
            System.out.println("not found");
        }
    }

    public static boolean linearSearch(int arr[], int tar, int idx) {
        if (idx == arr.length)
            return false;
        if (arr[idx] == tar)
            return true;
        return linearSearch(arr, tar, idx + 1);
    }
}
