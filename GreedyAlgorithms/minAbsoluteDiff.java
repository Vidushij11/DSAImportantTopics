import java.util.*;

public class minAbsoluteDiff {
    public static void main(String[] args) {
        int arr1[] = { 1, 3, 2 };
        int arr2[] = { 2, 1, 3 };
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += Math.abs(arr1[i] - arr2[i]);
        }

        System.out.println(sum);

    }
}
