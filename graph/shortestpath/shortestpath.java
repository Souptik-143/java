package graph.shortestpath;
import java.util.ArrayList;

public class shortestpath {

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
}
public static void shortestpath(ArrayList<Edge>[] graph, int src, int dest, String path) {
    if (src == dest) {
        System.out.println(path + dest);
        return;
    }
    for (int i = 0; i < graph[src].size(); i++) {
        Edge e = graph[src].get(i);
        shortestpath(graph, e.dest, dest, path + src + " ");
    }
}

    public static void main(String[] args) {
    
        ArrayList<Edge>[] graph = new ArrayList[5];
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        createGraph(graph);
        int src = 0;
        int dest = 4;
        shortestpath(graph, src, dest, "");
    }
}
