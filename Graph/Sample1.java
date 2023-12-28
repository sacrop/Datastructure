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
        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));
        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));
        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));
        graph[4].add(new Edge(4, 2));
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

    public void bfs(ArrayList<Edge>[] graph,int start,boolean[] visit){
        Queue<Integer> que=new LinkedList<>();
        que.add(start);
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
    public void dfs(ArrayList<Edge>[] graph,int curr,boolean[] vst){
            System.out.print(curr+" ");
            vst[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                if(vst[e.dest]==false)
                dfs(graph, e.dest, vst);
            }
    }

    public static void main(String[] args) {
        int V=7;
        ArrayList<Edge>[] graph=new ArrayList[V];
        Sample1 smp=new Sample1();
        smp.createGraph(graph);
        boolean[] visit=new boolean[V];
        for(int i=0;i<V;i++){
            if(visit[i]==false){
                smp.bfs(graph, i,visit);
            }
        }
        System.out.println();
        // dfs
        boolean[] vst=new boolean[V];
        for(int i=0;i<V;i++){
            if(vst[i]==false){
                smp.dfs(graph,i,vst);
            }
        }
    }
}
