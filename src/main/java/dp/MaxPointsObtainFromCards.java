package main.java.dp;

public class MaxPointsObtainFromCards {
    public static void main(String[] args) {
        int cardPoints[] = { 1, 2, 3, 4, 5, 6, 1 };
        MaxPointsObtainFromCards obj = new MaxPointsObtainFromCards();
        System.out.println(obj.maxPoints(cardPoints, 3));
    }

    int maxPoints(int cardPoints[], int k) {
        int n = cardPoints.length;
        int frontSetOfCards[] = new int[k + 1];
        int rearSetOfCards[] = new int[k + 1];

        frontSetOfCards[0] = 0;
        rearSetOfCards[0] = 0;

        for (int i = 1; i < k + 1; i++) {
            frontSetOfCards[i] = frontSetOfCards[i - 1] + cardPoints[i - 1];
        }

        for (int i = 1; i < k + 1; i++) {
            rearSetOfCards[i] = rearSetOfCards[i - 1] + cardPoints[n - i];
        }

        int maxScore = 0;
        int currScore;

        for (int i = 0; i < k + 1; i++) {
            currScore = frontSetOfCards[i] + rearSetOfCards[k-i];
            maxScore = Math.max(maxScore, currScore);
        }

        return maxScore;
    }
}

// https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/
