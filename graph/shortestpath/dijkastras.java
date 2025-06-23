package graph.shortestpath;
import java.util.ArrayList;
public class dijkastras {
public static class pair implements Comparable<pair> {
    int n;
    int path;
    
    pair(int n, int path) {
        this.n = n;
        this.path = path;
    }
    @Override
    public int compareTo(pair o) {
        return this.path - o.path; // Compare based on path weight
    }   
}
public static class Edge {
    int src;
    int dest;
    int weight;

    Edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.weight = w;
    }
}

public static void createGraph(ArrayList<Edge>[] graph) {
    graph[0].add(new Edge(0, 1, 10));
    graph[0].add(new Edge(0, 2, 20));
    graph[1].add(new Edge(1, 3, 30));
    graph[2].add(new Edge(2, 3, 40));
    graph[3].add(new Edge(3, 4, 50));
    graph[1].add(new Edge(1, 4, 60));
    graph[2].add(new Edge(2, 4, 70));

}

public static void dijkstra(ArrayList<Edge>[] graph, int src) {
    // Implementation of Dijkstra's algorithm will go here
    // This is a placeholder for the Dijkstra's algorithm logic
    System.out.println("Dijkstra's algorithm implementation is pending.");
    int[] dist = new int[graph.length];
    boolean[] visited = new boolean[graph.length];
    
    for (int i = 0; i < dist.length; i++) {
        dist[i] = Integer.MAX_VALUE; // Initialize distances to infinity
    }
    dist[src] = 0; // Distance from source to itself is 0

    // Priority queue to select the node with the smallest distance
    java.util.PriorityQueue<pair> pq = new java.util.PriorityQueue<>();
    pq.add(new pair(src, 0));

    while (!pq.isEmpty()) {
        pair current = pq.poll();
        int currentNode = current.n;

        if (visited[currentNode]) continue; // Skip if already visited
        visited[currentNode] = true;

        for (Edge edge : graph[currentNode]) {
            if (!visited[edge.dest]) {
                int newDist = dist[currentNode] + edge.weight;
                if (newDist < dist[edge.dest]) {
                    dist[edge.dest] = newDist;
                    pq.add(new pair(edge.dest, newDist));
                }
            }
        }
    }

    // Print the shortest distances from the source
    for (int i = 0; i < dist.length; i++) {
        System.out.println("Distance from " + src + " to " + i + " is " + dist[i]);
    }
}

public static void main(String[] args) {
    int V = 5; // Number of vertices
    ArrayList<Edge>[] graph = new ArrayList[V];
    for (int i = 0; i < V; i++) {
        graph[i] = new ArrayList<>();
    }
    createGraph(graph);
    dijkstra(graph, 0);
}
     
}
