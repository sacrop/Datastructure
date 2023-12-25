import java.util.ArrayList;

public class Sample{

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
        graph[0].add(new Edge(0, 2));
        graph[1].add(new Edge(1, 2));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 3));
        graph[2].add(new Edge(2, 1));
        graph[3].add(new Edge(3, 2));
        graph[3].add(new Edge(3, 1)); 
    }
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge>[] graph=new ArrayList[v];
        Sample smp=new Sample();
        smp.createGraph(graph);
        for(int i=0;i<graph[3].size();i++){
            Edge e=graph[3].get(i);
            System.out.println(e.dest);
        }
    }
}