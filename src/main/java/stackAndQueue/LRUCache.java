package main.java.stackAndQueue;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {

    Deque<Integer> deque;
    Set<Integer>   set;
    private int CACHE_SIZE;

    public LRUCache(int n) {
        this.CACHE_SIZE = n;
        deque = new LinkedList<>();
        set = new HashSet<>();
    }

    public static void main(String[] args) {
        LRUCache obj = new LRUCache(4);
        obj.refer(1);
        obj.refer(2);
        obj.refer(3);
        obj.refer(1);
        obj.refer(4);
        obj.refer(5);
        obj.refer(2);
        obj.refer(2);
        obj.refer(1);
        obj.display();
    }

    void refer(int i) {
        if (!set.contains(i)) {
            set.add(i);
            if (deque.size() == CACHE_SIZE) {
                int last = deque.removeLast();
                set.remove(last);
            }
            deque.push(i);
        } else {
            deque.remove(i);
            deque.push(i);
        }
    }

    void display() {
        for (Integer i : deque) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

// https://www.geeksforgeeks.org/lru-cache-implementation/
