import java.util.ArrayList;
import java.util.*;

public class jobSequencing {

    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };
        ArrayList<Job> list = new ArrayList<>();

        for (int i = 0; i < jobInfo.length; i++) {
            list.add(new Job(i, jobInfo[i][0], jobInfo[i][1]));
        }

        Collections.sort(list, (a, b) -> b.profit - a.profit); // sort in descending order

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < list.size(); i++) {
            Job curr = list.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }
        System.out.println("max job " + seq.size());
        System.out.println(seq);
    }
}
