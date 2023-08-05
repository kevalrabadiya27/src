//48] WAP to implement a BFS traversal technique in a Graph.

package Graph;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    private int vertex;
    private LinkedList<Integer> adj[];
    private Queue<Integer>que;

    BFS(int v){
        vertex = v;
        adj = new LinkedList[vertex];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
        que = new LinkedList<Integer>();
    }

    void insertEdge(int v,int w)
    {
        adj[v].add(w);
    }

    void BFSTraversal(int n){
        boolean nodes[] = new boolean[vertex];       /* initialize boolean array for holding the data */
        int a = 0;
        nodes[n]=true;
        que.add(n);       /* root node is added to the top of the queue */

        while (que.size() != 0)
        {
            n = que.poll();        /* remove the top element of the queue */
            System.out.print(n+" ");    /* print the top element of the queue */
            for (int i = 0; i < adj[n].size(); i++)  /* iterate through the linked list and push all neighbors into queue */
            {
                a = adj[n].get(i);
                if (!nodes[a])      /* only insert nodes into queue if they have not been explored already */
                {
                    nodes[a] = true;
                    que.add(a);
                }
            }
        }
    }

    public static void main(String[] args) {
        BFS graph = new BFS(10);
        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(0, 3);
        graph.insertEdge(1, 3);
        graph.insertEdge(2, 4);
        graph.insertEdge(3, 5);
        graph.insertEdge(3, 6);
        graph.insertEdge(4, 7);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 2);
        graph.insertEdge(6, 5);
        graph.insertEdge(7, 5);
        graph.insertEdge(7, 8);
        graph.BFSTraversal(2);
    }
}
