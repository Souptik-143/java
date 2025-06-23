import java.util.ArrayList;
import java.util.Stack;

public class t {
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






public static void topSort(ArrayList<edge>graph[]){
        boolean vis[]=new boolean[graph.length];
    Stack<Integer>s=new Stack<>();
    for(int i=0;i<graph.length;i++){
        if(!vis[i]){
            topSortdfs(graph,vis,s,i);
        }
    }
    //print
    while(!s.isEmpty()){
        System.out.print(s.pop());
    }

}
    public static int topSortdfs(ArrayList<edge>graph[],boolean vis[],Stack<Integer>s,int cur){
        vis[cur]=true;
        for(int i=0;i<graph[cur].size();i++){
            edge e=graph[cur].get(i);
            if(!vis[e.dest]){
                topSortdfs(graph,vis,s,e.dest);//call for visit
            }
        }
return  s.push(cur);
    }

    public static void main(String[] args) {
        ArrayList<edge> graph[] = new ArrayList[5];
        createGraph(graph);
        topSort(graph);
    }
}
