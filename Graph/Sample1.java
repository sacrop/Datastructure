import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Sample1 {
    class Edge{
        int src;
        int dest;
        Edge(int s,int d){
            this.src=s;
            this.dest=d;
        }
    }
    public void createGraph(ArrayList[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));
        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));
        graph[6].add(new Edge(6, 5));

    }
    public void getneighbour(int i,ArrayList<Edge>[] graph){
        for(int j=0;j<graph[i].size();j++){
            Edge e=graph[i].get(j);
            System.out.println(e.dest);
        }
    }

    public void bfs(ArrayList<Edge>[] graph,int v){
        Queue<Integer> que=new LinkedList<>();
        boolean[] visit=new boolean[v];
        que.add(0);
        while(!que.isEmpty()){
            int curr=que.remove();
            if(visit[curr]==false){
                System.out.print(curr+" ");
                visit[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                que.add(e.dest);
                }
            }        
        }
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        Sample1 smp=new Sample1();
        smp.createGraph(graph);
        smp.getneighbour(5, graph);
        smp.bfs(graph, V);
    }
}
