package RecursionProblems;

import java.util.HashMap;
import java.util.Scanner;

public class sayDigits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] d = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

        sayDigits(n, d);
    }

    public static void sayDigits(int n, String[] d) {
        if (n == 0) {
            return;
        }

        int c = n % 10;
        n = n / 10;
        sayDigits(n, d);
        System.out.print(d[c] + " ");
    }
}
