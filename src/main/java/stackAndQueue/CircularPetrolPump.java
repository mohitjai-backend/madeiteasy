package main.java.stackAndQueue;

public class CircularPetrolPump {
    public static void main(String[] args) {
        int petrol[] = { 1, 2, 3, 4, 5 };
        int distance[] = { 3, 4, 5, 1, 2 };

        CircularPetrolPump obj = new CircularPetrolPump();
        int start = obj.findPosition(petrol, distance);

        if (start == -1) {
            System.out.println("Not possible to visit all petrol pumps");
        } else {
            System.out.println(start);
        }
    }

    int findPosition(int petrol[], int distance[]) {
        int total_petrol = 0;
        int curr_petrol = 0;

        int start_position = 0;

        for (int i = 0; i < petrol.length; i++) {
            total_petrol = total_petrol + petrol[i] - distance[i];
            curr_petrol = curr_petrol + petrol[i] - distance[i];

            if (curr_petrol < 0) {
                start_position = i + 1;
                curr_petrol = 0;
            }
        }

        return total_petrol >= 0 ? start_position : -1;
    }
}

// https://leetcode.com/problems/gas-station/
// https://www.geeksforgeeks.org/find-a-tour-that-visits-all-stations/
