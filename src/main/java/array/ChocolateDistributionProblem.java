package main.java.array;

import java.util.Arrays;

public class ChocolateDistributionProblem {

    public static void main(String[] args) {
        int choclatesInPackets[] = { 7, 3, 2, 4, 9, 12, 56 };
        int students = 3;

        ChocolateDistributionProblem obj = new ChocolateDistributionProblem();
        System.out.println("Min number of choclates: " + obj.minDiff(choclatesInPackets, students));

        int choclatesInPacketsExample2[] = {
                12, 4, 7, 9, 2, 23, 25, 41,
                30, 40, 28, 42, 30, 44, 48,
                43, 50 };
        int studentsExample2 = 7;
        System.out.println("Min number of choclates: " + obj.minDiff(choclatesInPacketsExample2, studentsExample2));
    }

    int minDiff(int chocolatesInPackets[], int students) {

        int diff = Integer.MAX_VALUE;

        Arrays.sort(chocolatesInPackets);
        for (int i = 0; i < chocolatesInPackets.length - students + 1; i++) {
            diff = Math.min(diff, chocolatesInPackets[i + students - 1] - chocolatesInPackets[i]);
        }

        return diff;
    }
}

//https://www.geeksforgeeks.org/chocolate-distribution-problem/
