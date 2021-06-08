package main.java.greedy;

import java.util.Arrays;
import java.util.Comparator;

public class NMeetingsInARoom {
    public static void main(String[] args) {
        int start[] = { 1, 3, 0, 5, 8, 5 };
        int end[] = { 2, 4, 6, 7, 9, 9 };

        Meeting[] meetings = new Meeting[start.length];
        for (int i = 0; i < start.length; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        NMeetingsInARoom obj = new NMeetingsInARoom();

        int numberOfMeetings = obj.findNumberOfMeetings(meetings);
        System.out.println(numberOfMeetings);
    }

    int findNumberOfMeetings(Meeting[] meetings) {
        MyComparator myComparator = new MyComparator();
        Arrays.sort(meetings, myComparator);

        int numberOfMeetings = 1;
        int i = 0;

        for (int j = 1; j < meetings.length; j++) {
            if (meetings[j].start >= meetings[i].end) {
                numberOfMeetings++;
                i = j;
            }
        }

        return numberOfMeetings;

    }
}

class Meeting {
    int start;
    int end;

    public Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class MyComparator implements Comparator<Meeting> {

    @Override public int compare(Meeting o1, Meeting o2) {
        return o1.end - o2.end;
    }
}

// https://practice.geeksforgeeks.org/problems/n-meetings-in-one-room-1587115620/1
// https://www.geeksforgeeks.org/activity-selection-problem-greedy-algo-1/ (Do it yourself)
