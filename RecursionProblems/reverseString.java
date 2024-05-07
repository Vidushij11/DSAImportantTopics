package RecursionProblems;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        reverseString(s, s.length() - 1);
    }

    public static void reverseString(String s, int idx) {
        System.out.println(s);
        if (idx == -1)
            return;

        System.out.print(s.charAt(idx));
        reverseString(s, idx - 1);
    }
}
