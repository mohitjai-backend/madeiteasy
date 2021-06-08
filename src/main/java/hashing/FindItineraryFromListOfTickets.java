package main.java.hashing;

import java.util.HashMap;
import java.util.Map;

public class FindItineraryFromListOfTickets {
    public static void main(String[] args) {
        Map<String, String> hm = new HashMap<>();
        hm.put("Bhopal", "Sehore");
        hm.put("Delhi", "Bhopal");
        hm.put("Indore", "Hyderabad");
        hm.put("Sehore", "Indore");

        FindItineraryFromListOfTickets obj = new FindItineraryFromListOfTickets();
        obj.findItinerary(hm);
    }

    void findItinerary(Map<String, String> hm) {
        Map<String, String> reverseHm = new HashMap<>();

        for (Map.Entry entry : hm.entrySet()) {
            reverseHm.put((String) entry.getValue(), (String) entry.getKey());
        }

        String startCity = null;

        for (Map.Entry entry : hm.entrySet()) {
            if (!reverseHm.containsKey(entry.getKey())) {
                startCity = (String) entry.getKey();
                break;
            }
        }

        for (int i = 0; i < hm.size(); i++) {
            System.out.println(startCity + " --> " + hm.get(startCity));
            startCity = hm.get(startCity);
        }
    }
}

// https://www.geeksforgeeks.org/find-itinerary-from-a-given-list-of-tickets/