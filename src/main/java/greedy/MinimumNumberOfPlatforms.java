package main.java.greedy;

import java.util.Arrays;

public class MinimumNumberOfPlatforms {
    public static void main(String[] args) {
        int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
        int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
        MinimumNumberOfPlatforms obj = new MinimumNumberOfPlatforms();
        System.out.println(obj.minNumberOfPlatforms(arr, dep));
    }

    int minNumberOfPlatforms(int arr[], int dep[]) {
        int n = arr.length;
        if (n == 0)
            return 0;

        Arrays.sort(arr);
        Arrays.sort(dep);

        int i = 1;
        int j = 0;
        int platforms_needed_curr = 1;
        int ans = 1;

        while (i < n && j < n) {
            if (arr[i] < dep[j]) {
                platforms_needed_curr++;
                i++;
            } else {
                platforms_needed_curr--;
                j++;
            }

            ans = Math.max(ans, platforms_needed_curr);
        }

        return ans;
    }
}

// https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
// https://leetcode.com/problems/meeting-rooms-ii/solution/


/*
A meeting is defined by its start and end times. However, for this specific algorithm, we need to
treat the start and end times individually. This might not make sense right away because a
meeting is defined by its start and end times. If we separate the two and treat them individually,
then the identity of a meeting goes away. This is fine because:

When we encounter an ending event, that means that some meeting that started earlier has
ended now. We are not really concerned with which meeting has ended. All we need is that
some meeting ended thus making a room available.
 */
