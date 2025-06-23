import java.util.ArrayList;

public class cycledetectiom {
 static class edge{
        int src;
        int dest;
        int weight;
    
        edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.weight = w;
        }       

 }


 public static void createGraph(ArrayList<edge>graph[]){
    for(int i = 0; i < graph.length; i++) {
        graph[i] = new ArrayList<>();
    }
    graph[0].add(new edge(0, 1, 10));
    graph[0].add(new edge(0, 2, 20));
    graph[1].add(new edge(1, 0, 10));
    graph[1].add(new edge(1, 3, 30));
    graph[2].add(new edge(2, 0, 20));
    graph[2].add(new edge(2, 3, 40));
    graph[3].add(new edge(3, 1, 30));
    graph[3].add(new edge(3, 2, 40));
    graph[3].add(new edge(3, 4, 50));
    graph[4].add(new edge(4, 3, 50));


 }
 public static boolean isCycledetectionutil(ArrayList<edge> graph[], int src, boolean visited[], int parent) {
  //case 1: if the node is already visited and it's not the parent of the current node, then a cycl
  for(int i=0;i<graph[parent].size();i++){
edge e=graph[parent].get(i);
if(visited[e.dest] && e.dest!=parent){
    return true; // Cycle detected
  }



  //case 2: if the node is not visited, then mark it as visited and continue the DFS
  if(!visited[e.dest]){
    visited[e.dest]=true;
    if(isCycledetectionutil(graph, e.dest, visited, src)){
        return true; // Cycle detected in the recursive call
    }
  }
 // No cycle detected

 }
   return false;
}



 public static boolean isCycledetection(ArrayList<edge> graph[]) {
  boolean visited[] = new boolean[graph.length];
  for(int i=0;i<graph.length;i++){
      if(!visited[i]){
          visited[i]=true;
          if(isCycledetectionutil(graph, i, visited, -1)){
              return true; // Cycle detected
          }
      }
  }
  return false; // No cycle detected    
}
  

 



    public static void main(String[] args) {
        ArrayList<edge>graph[]=new ArrayList[4];
createGraph(graph);
System.out.println(isCycledetection(graph)); // Output: true or false based on cycle detection
        // Test case
        ArrayList<edge> graph2[] = new ArrayList[4];
        createGraph(graph2);
        System.out.println(isCycledetection(graph2)); // Output: true or false based on cycle detection
        // Test case
        ArrayList<edge> graph3[] = new ArrayList[3];
        createGraph(graph3);
        System.out.println(isCycledetection(graph3)); // Output: true or false based on cycle detection
    }
}
