package main.java.array;

public class CheckIfXCanGiveChangeToEveryPersonInQueue {

    public static void main(String[] args) {
        int customerCoins[] = { 5, 5, 5, 10, 20 };
        CheckIfXCanGiveChangeToEveryPersonInQueue obj = new CheckIfXCanGiveChangeToEveryPersonInQueue();
        if (obj.CheckIfXCanGiveChangeToEveryPersonInQueue(customerCoins) == 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    int CheckIfXCanGiveChangeToEveryPersonInQueue(int customerCoins[]) {
        int fiveCount = 0, tenCount = 0;

        for (int i = 0; i < customerCoins.length; i++) {
            if (customerCoins[i] == 5) {
                fiveCount++;
            } else if (customerCoins[i] == 10) {
                if (fiveCount > 0) {
                    fiveCount--;
                    tenCount++;
                } else
                    return 0;
            } else {
                if (fiveCount > 0 && tenCount > 0) {
                    fiveCount--;
                    tenCount--;
                } else if (fiveCount > 3) {
                    fiveCount = fiveCount - 3;
                } else
                    return 0;
            }
        }

        return 1;
    }
}

//https://www.geeksforgeeks.org/check-if-x-can-give-change-to-every-person-in-the-queue/
