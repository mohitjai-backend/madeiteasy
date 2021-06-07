package main.java.hashing;

import java.util.HashMap;
import java.util.Map;

public class EmployeeUnderEveryManager {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("A", "C");
        hm.put("B", "C");
        hm.put("C", "F");
        hm.put("D", "E");
        hm.put("E", "F");
        hm.put("F", "F");

        EmployeeUnderEveryManager obj = new EmployeeUnderEveryManager();
        obj.printEmployeeUnderEveryManager(hm);
    }

    void printEmployeeUnderEveryManager(Map<String, String> hm) {
        Map<String, Integer> resultHashMap = new HashMap<String, Integer>();
        for (Map.Entry entry : hm.entrySet()) {
            resultHashMap.put((String) entry.getKey(), 0);
        }

        for (Map.Entry entry : hm.entrySet()) {
            if (entry.getKey() != entry.getValue()) {
                resultHashMap.put((String) entry.getValue(), resultHashMap.get(entry.getKey()) + resultHashMap.get(entry.getValue()) + 1);
            }
        }

        for (Map.Entry entry : resultHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

// https://www.geeksforgeeks.org/find-number-of-employees-under-every-manager/
