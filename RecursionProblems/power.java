package RecursionProblems;

import java.util.Scanner;

public class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(power(a, b));
    }

    public static int power(int a, int b) {
        if (b == 0)
            return 1;
        if (b == 1)
            return a;

        int ans = power(a, b / 2);

        if (b % 2 == 0)
            return ans * ans;
        return a * ans * ans;
    }
}
