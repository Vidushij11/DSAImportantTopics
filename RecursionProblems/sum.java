package RecursionProblems;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int arr[] = { 1 };
        System.out.println(sum(arr, 0));
    }

    public static int sum(int arr[], int idx) {
        if (arr.length == 0)
            return 0;
        if (arr.length == 1 || idx == arr.length - 1)
            return arr[idx];
        int ans = arr[idx] + sum(arr, idx + 1);
        return ans;
    }
}
