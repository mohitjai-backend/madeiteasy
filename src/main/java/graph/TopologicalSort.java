package main.java.graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class TopologicalSort {
    LinkedList<Integer> adj[];
    int                 v;

    public TopologicalSort(int v) {
        this.v = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        TopologicalSort graph = new TopologicalSort(6);
        graph.addEdge(5, 2);
        graph.addEdge(5, 0);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);

        graph.topologicalSort();

    }

    void topologicalSort() {
        Stack<Integer> stack = new Stack<>();
        boolean visited[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }

    void topologicalSortUtil(int v, boolean visited[], Stack<Integer> stack) {
        visited[v] = true;

        Iterator iterator = adj[v].listIterator();
        while (iterator.hasNext()) {
            int n = (int) iterator.next();
            if (!visited[n]) {
                topologicalSortUtil(n, visited, stack);
            }
        }

        stack.push(v);
    }

    void addEdge(int v1, int v2) {
        adj[v1].add(v2);
    }
}

/*
Topological sorting for Directed Acyclic Graph (DAG) is a linear ordering of vertices such that for every directed edge u v, vertex u comes before v in the ordering.
Topological Sorting for a graph is not possible if the graph is not a DAG.

For example, a topological sorting of the following graph is “5 4 2 3 1 0”.
There can be more than one topological sorting for a graph.
For example, another topological sorting of the following graph is “4 5 2 3 1 0”.
The first vertex in topological sorting is always a vertex with in-degree as 0 (a vertex with no incoming edges).
 */

// https://www.geeksforgeeks.org/topological-sorting/
