package main.java.graph;

import java.util.LinkedList;
import java.util.Queue;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int n = 30;
        int moves[] = new int[n];

        for (int i = 0; i < n; i++) {
            moves[i] = -1;
        }

        // Ladders
        moves[2] = 21;
        moves[4] = 7;
        moves[10] = 25;
        moves[19] = 28;

        // Snakes
        moves[26] = 0;
        moves[20] = 8;
        moves[16] = 3;
        moves[18] = 6;

        SnakeAndLadder obj = new SnakeAndLadder();

        System.out.println(obj.minDiceThrows(moves, n));
    }

    int minDiceThrows(int moves[], int n) {
        Queue<VertexAndDistance> queue = new LinkedList<>();
        boolean visited[] = new boolean[n];

        VertexAndDistance temp = new VertexAndDistance(0, 0);

        queue.add(temp);
        visited[0] = true;

        while (!queue.isEmpty()) {
            temp = queue.poll();

            if (temp.vertex == n - 1)
                break;

            for (int i = temp.vertex + 1; i <= (temp.vertex + 6) && i < n; i++) {
                if (!visited[i]) {
                    int newlyAddedNodeVertex = moves[i] == -1 ? i : moves[i];
                    int newlyAddedNodeDistance = temp.distance + 1;
                    VertexAndDistance newlyAddedNode = new VertexAndDistance(newlyAddedNodeVertex, newlyAddedNodeDistance);
                    queue.add(newlyAddedNode);
                    visited[i] = true;
                }
            }
        }

        return temp.distance;
    }
}

class VertexAndDistance {
    int vertex;
    int distance;

    public VertexAndDistance(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }
}

// https://www.geeksforgeeks.org/snake-ladder-problem-2/
/*
The idea is to consider the given snake and ladder board as a directed graph with number of vertices equal to the number of cells in the board.
The problem reduces to finding the shortest path in a graph.
Every vertex of the graph has an edge to next six vertices if next 6 vertices do not have a snake or ladder.
If any of the next six vertices has a snake or ladder, then the edge from current vertex goes to the top of the ladder or tail of the snake.
Since all edges are of equal weight, we can efficiently find shortest path using Breadth First Search of the graph.
 */
