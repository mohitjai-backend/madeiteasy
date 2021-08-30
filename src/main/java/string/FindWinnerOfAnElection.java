package main.java.string;

import java.util.HashMap;
import java.util.Map;

public class FindWinnerOfAnElection {
    public static void main(String[] args) {
        String names[] = {
                "john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john" };

        FindWinnerOfAnElection obj = new FindWinnerOfAnElection();
        System.out.println(obj.findWinner(names));
    }

    String findWinner(String names[]) {
        Map<String, Integer> mp = new HashMap<>();
        for (int i = 0; i < names.length; i++) {
            if (mp.containsKey(names[i])) {
                mp.put(names[i], mp.get(names[i]) + 1);
            } else {
                mp.put(names[i], 1);
            }
        }

        String winner = "";
        Integer maxVotes = 0;
        for (Map.Entry<String, Integer> entry : mp.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            if (value > maxVotes) {
                winner = key;
                maxVotes = value;
            } else if (value == maxVotes) {
                if (winner.compareTo(key) > 0) {
                    winner = key;
                }
            }
        }

        return winner;
    }
}

// https://www.geeksforgeeks.org/find-winner-election-votes-represented-candidate-names/
