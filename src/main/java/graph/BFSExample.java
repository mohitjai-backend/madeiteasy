package main.java.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFSExample {

    int                 v;
    LinkedList<Integer> adj[];

    public BFSExample(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        BFSExample graph = new BFSExample(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.BFS(2);
    }

    void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }

    void BFS(int startVertex) {
        boolean visited[] = new boolean[v];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            Iterator iterator = adj[node].listIterator();
            while (iterator.hasNext()) {
                int temp = (int) iterator.next();
                if (!visited[temp]) {
                    queue.add(temp);
                    visited[temp] = true;
                }
            }
        }
    }
}

// https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
/*
Time Complexity: O(V+E) where V is number of vertices in the graph and E is number of edges in the graph.
 */
