package RecursionProblems;

public class mergeSort {
    public static void main(String[] args) {
        int arr[] = { 2, 32, 13, 1, 5, 31, 89 };
        mergeSort2(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void merge(int arr[], int s, int e) {

        int mid = (s + e) / 2;
        int len1 = mid - s + 1;
        int len2 = e - mid;

        int first[] = new int[len1];
        int second[] = new int[len2];

        int k = s;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[k++];
        }

        k = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[k++];
        }

        int idx1 = 0;
        int idx2 = 0;

        k = s;
        while (idx1 < len1 && idx2 < len2) {
            if (first[idx1] < second[idx2]) {
                arr[k++] = first[idx1++];
            } else {
                arr[k++] = second[idx2++];
            }
        }

        while (idx1 < len1) {
            arr[k++] = first[idx1++];
        }
        while (idx2 < len2) {
            arr[k++] = second[idx2++];
        }
    }

    public static void mergeSort2(int arr[], int s, int e) {

        if (s >= e)
            return;
        int mid = (s + e) / 2; // int range 10^9 if s and e are of same range then the range will get double.
        // System.out.println("hello");
        mergeSort2(arr, s, mid);
        mergeSort2(arr, mid + 1, e);
        merge(arr, s, e);
    }

}
