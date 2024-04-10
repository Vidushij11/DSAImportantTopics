import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };
        int maxAct = 0;
        ArrayList<Integer> list = new ArrayList<>();
        maxAct = 1;
        list.add(0);
        int lastEnd = end[0];
        for (int i = 1; i < start.length; i++) {
            if (start[i] >= lastEnd) {
                maxAct++;
                list.add(i);
                lastEnd = end[i];
            }
        }

        System.out.println("max activities = " + maxAct);
        for (int i : list) {
            System.out.print("A" + i + " ");
        }

    }
}
