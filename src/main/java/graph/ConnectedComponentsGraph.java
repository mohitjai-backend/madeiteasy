package main.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class ConnectedComponentsGraph {

    private int                 v;
    private LinkedList<Integer> adj[];

    public ConnectedComponentsGraph(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        ConnectedComponentsGraph graph = new ConnectedComponentsGraph(5);
        graph.addEdge(1, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.connectedComponents();

    }

    void addEdge(int v1, int v2) {
        adj[v1].add(v2);
        adj[v2].add(v1);
    }

    void connectedComponents() {
        boolean visited[] = new boolean[v];
        for (int i = 0; i < visited.length; i++) {
            if (!visited[i]) {
                DFSUtil(i, visited);
                System.out.println();
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
}

// https://www.geeksforgeeks.org/connected-components-in-an-undirected-graph/
// https://www.geeksforgeeks.org/program-to-count-number-of-connected-components-in-an-undirected-graph/