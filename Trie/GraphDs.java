import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
public class GraphDs {
    class Edge{
        int src;
        int dest;
        Edge(int src,int dest){
            this.src=src;
            this.dest=dest;
        }
    }

    private ArrayList<Edge>[] graph;
    
    public void createGraph(int arr[][],int vertex){
        graph=new ArrayList[vertex];
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<arr.length;i++){
            int src=arr[i][0];
            int dest=arr[i][1];
            graph[src].add(new Edge(src, dest));
        }
    }
    private void display(){
        for(int i=0;i<graph.length;i++){
            System.out.print("edges from node "+i+" : ");
            for(Edge e:graph[i]){
                System.out.print("("+e.src+","+e.dest+")");
            }
            System.out.println();
        }
    }

    private void bfs(){
        Queue<Integer> que=new LinkedList<>();
        boolean[] visit=new boolean[graph.length];
        que.add(0);
        while (!que.isEmpty()) {
            int curr=que.remove();
            if(visit[curr]==false){
                System.out.print(curr+" ");
                visit[curr]=true;
            }
            for(int i=0;i<graph[curr].size();i++){
               Edge e=graph[curr].get(i);
                que.add(e.dest);
            }
        }
    }
    public static void main(String[] args) {
        GraphDs graphDs=new GraphDs();
        int vertex=7;
        int[][] arr=new int[][]{{0,1},{0,2},{1,0},{1,3},{2,0},{2,4},{4,2},{4,3},{4,5},{3,1},{3,5},{5,3},{5,4},{5,6},{6,5}};
        graphDs.createGraph(arr,vertex);  
        graphDs.display();
        graphDs.bfs();
    }
}
