package graph;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class khansalgo {
    static class edge {
    int src;
    int dest;
    int weight;

    edge(int s, int d, int w) {
        this.src = s;
        this.dest = d;
        this.weight = w;
    }
}

public static void createGraph(ArrayList<edge> graph[]) {
    for (int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }
    graph[0].add(new edge(0, 1, 10));
    graph[0].add(new edge(0, 2, 20));
    graph[1].add(new edge(1, 3, 30));
    graph[2].add(new edge(2, 3, 40));
    graph[3].add(new edge(3, 4, 50));
}  

public static void callculateIndegree(ArrayList<edge> graph[], int indegree[]) {
    for (int i = 0; i < graph.length; i++) {
        for (int j = 0; j < graph[i].size(); j++) {
            edge e = graph[i].get(j);
            indegree[e.dest]++; // Increment indegree of destination node
        }
    }
}


public static void topSort(ArrayList<edge> graph[]) {
int indegree[]=new int[graph.length];
callculateIndegree(graph,indegree);//call culate indgree
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<indegree.length;i++){//add in q if indegree value is o
            if(indegree[i]==0){
                q.add(i);
            }
        }
        // call bfs
        bfs(graph, indegree, q);
    }
    public static void bfs(ArrayList<edge> graph[], int indegree[], Queue<Integer> q) { 
            while(!q.isEmpty()){
            int cur=q.remove();
            System.out.print(cur);
            for(int i=0;i<graph[cur].size();i++){
                edge e=graph[cur].get(i);
                indegree[e.dest]--;
                if(indegree[e.dest]==0){
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<edge> graph[] = new ArrayList[5];
        createGraph(graph);
        topSort(graph);
    }
}
