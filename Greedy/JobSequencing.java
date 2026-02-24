package Greedy;

import java.util.*;

public class JobSequencing {

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
        int jobsInfo[][] = { { 4, 20 }, { 1, 20 }, { 1, 40 }, { 1, 30 } };

        List<Job> jobs = new ArrayList<>();
        
        for(int i=0; i<jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs, (a,b) -> b.profit - a.profit);

        List<Integer> seq = new ArrayList<>();

        int time = 0;
        for(int i=0; i<jobs.size(); i++)  {
            Job curr = jobs.get(i);
            if(curr.deadline > time) {
                time++;
                seq.add(curr.id);
            }
        }

        System.out.println(time);
        System.out.println(seq);
    }
}