package RecursionProblems;

public class quickSort {
    public static void main(String[] args) {
        int arr[] = { 10, 80, 50, 90, 40, 70 };
        QuickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int partition(int arr[], int s, int e) {
        int pivot = arr[s];
        int c = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[i] <= pivot)
                c++;
        }
        System.out.println(c + " " + s);
        int pivotIdx = s + c;
        int temp = arr[s];
        arr[s] = arr[pivotIdx];
        arr[pivotIdx] = temp;

        int i = s, j = e;

        while (i < pivotIdx && j > pivotIdx) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotIdx && j > pivotIdx) {
                int k = arr[i];
                arr[i] = arr[j];
                arr[j] = k;
                i++;
                j--;
            }
        }
        return pivotIdx;
    }

    public static void QuickSort(int arr[], int s, int e) {
        if (s >= e)
            return;
        int p = partition(arr, s, e);
        QuickSort(arr, s, p - 1);
        QuickSort(arr, p + 1, e);
    }
}
