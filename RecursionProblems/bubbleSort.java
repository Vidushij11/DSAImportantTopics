package RecursionProblems;

public class bubbleSort {
    public static void main(String[] args) {
        int arr[] = { 2, 41, 1, 52, 12, 5 };
        sortArray(arr, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArray(int arr[], int n) {
        if (n == 0 || n == 1)
            return;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        sortArray(arr, n - 1);
    }
}
