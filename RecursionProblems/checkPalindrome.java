package RecursionProblems;

import java.util.Scanner;

public class checkPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(checkPalindrome(s, 0, s.length() - 1));
    }

    public static boolean checkPalindrome(String st, int s, int e) {
        if (s > e)
            return true;
        if (st.charAt(s) != st.charAt(e))
            return false;
        return checkPalindrome(st, s + 1, e - 1);
    }
}
