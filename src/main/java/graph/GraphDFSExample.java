package main.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphDFSExample {

    LinkedList<Integer> adj[];
    private int v;

    public GraphDFSExample(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        GraphDFSExample graph = new GraphDFSExample(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        graph.DFS();

    }

    void DFS() {
        boolean visited[] = new boolean[v];

        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                DFSUtil(i, visited);
            }
        }
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator iterator = adj[v].listIterator();
        while (iterator.hasNext()) {
            int n = (int) iterator.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
            }
        }
    }

    void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }
}

// https://www.geeksforgeeks.org/depth-first-search-or-dfs-for-a-graph/
