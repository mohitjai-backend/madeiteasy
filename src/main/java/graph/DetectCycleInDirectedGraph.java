package main.java.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DetectCycleInDirectedGraph {

    private int                 v;
    private LinkedList<Integer> adj[];

    public DetectCycleInDirectedGraph(int v) {
        this.v = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        DetectCycleInDirectedGraph graph = new DetectCycleInDirectedGraph(4);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.addEdge(2, 3);
        graph.addEdge(3, 3);

        System.out.println(graph.isCycle());

        DetectCycleInDirectedGraph graph1 = new DetectCycleInDirectedGraph(4);
        graph1.addEdge(0, 1);
        graph1.addEdge(0, 2);
        graph1.addEdge(1, 2);
        graph1.addEdge(2, 3);

        System.out.println(graph1.isCycle());
    }

    void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }

    boolean isCycle() {
        boolean visited[] = new boolean[v];
        boolean recStack[] = new boolean[v];

        for (int i = 0; i < visited.length; i++) {
            if (DFSUtil(i, visited, recStack)) { // here also no need to check for visited, as if vertex already visited then DFSUtil will return false without proceeding further.
                return true;
            }
        }

        return false;
    }

    boolean DFSUtil(int v, boolean visited[], boolean recStack[]) {
        if (recStack[v])
            return true;
        // sequence matters, recStack condition needs to be before visited condition (imp)
        if (visited[v])
            return false;

        visited[v] = true;
        recStack[v] = true;

        Iterator iterator = adj[v].listIterator();
        while (iterator.hasNext()) {
            int n = (int) iterator.next();
            if (DFSUtil(n, visited, recStack)) { // here we can't check for visited[n], dry run 1st example
                return true;
            }
        }

        recStack[v] = false; // we started with v and if there was cycle then it should have been identified otherwise we remove this vertex from recStack.
        return false;
    }
}

// https://www.geeksforgeeks.org/detect-cycle-in-a-graph/

// Refer image - detectCycleReasonForRecStack.png

/*
visited array initially: 0 0 0 0

visit A: 1 0 0 0

visit B: 1 1 0 0

visit D: 1 1 0 1

Traceback D -> B -> A

visit C: 1 1 1 1

visit D: Now D has been visited before so the algorithm will declare the graph to be cylic, but the graph clearly is not cyclic.
 */
