import java.util.*;

public class longestchain {
    public static void main(String[] args) {
        int chain[][] = { { 5, 24 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };

        Arrays.sort(chain, Comparator.comparingDouble(o -> o[1]));

        int chainLen = 1;
        int lastPair = chain[0][1];
        for (int i = 1; i < chain.length; i++) {
            if (lastPair < chain[i][0]) {
                chainLen++;
                lastPair = chain[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
