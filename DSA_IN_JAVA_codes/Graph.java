import java.util.LinkedList;
import java.util.Scanner;
public class Graph {
    private LinkedList<Integer> adjacency[];
    public Graph(int v)
    {
       adjacency = new LinkedList[v];
       for(int i=0;i<v;i++)
       {
         adjacency[i] = new LinkedList<Integer>();
       }
    }

    public void insertedge(int s,int d)
    {
        adjacency[s].add(d);
        adjacency[d].add(s);
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the no of Vertices and Edges :");
       int v = sc.nextInt();
       int e = sc.nextInt();

       Graph g = new Graph(v);
       System.out.println("Enter Edges:");
       for(int i=0;i<e;i++)
       {
        int s=sc.nextInt();
        int d=sc.nextInt();
        g.insertedge(s,d);

       }
        
    }
    
}
