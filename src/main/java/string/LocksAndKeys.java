package main.java.string;

import java.util.HashMap;
import java.util.Map;

public class LocksAndKeys {
    public static void main(String[] args) {
        char locks[] = { '@', '#', '$', '%', '^', '&' };
        char keys[] = { '$', '%', '&', '^', '@', '#' };

        LocksAndKeys obj = new LocksAndKeys();
        obj.locksAndKeysMatch(locks, keys);
    }

    void locksAndKeysMatch(char locks[], char keys[]) {
        if (locks.length != keys.length)
            return;

        Map<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < locks.length; i++) {
            if (hm.containsKey(locks[i])) {
                hm.put(locks[i], hm.get(locks[i]) + 1);
            } else {
                hm.put(locks[i], 1);
            }
        }

        for (int i = 0; i < keys.length; i++) {
            if (hm.containsKey(keys[i])) {
                locks[i] = keys[i];
            }
        }

        for (char l : locks) {
            System.out.print(l + " ");
        }

        System.out.println();

        for (char k : keys) {
            System.out.print(k + " ");
        }
    }
}

// https://www.geeksforgeeks.org/nuts-bolts-problem-lock-key-problem-set-2-hashmap/