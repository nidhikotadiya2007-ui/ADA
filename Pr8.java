import java.util.*;
public class kruskal_notebook
{
 static final int INF = 99;
 static int find(int parent[], int i)
 {
 while(parent[i] != i)
 i = parent[i];
 return i;
 }
 static void union(int parent[], int i, int j)
 {
 int a = find(parent, i);
 int b = find(parent, j);
 parent[a] = b;
 }
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter no. of nodes:");
 int n = sc.nextInt();
 int cost[][] = new int[n][n];
 System.out.println("Enter matrix:");
 for(int i = 0; i < n; i++)
 {
 for(int j = 0; j < n; j++)
 {
 cost[i][j] = sc.nextInt();
 if(cost[i][j] == 0)
 cost[i][j] = INF;
 }
 }
 int parent[] = new int[n];
 for(int i = 0; i < n; i++)
 parent[i] = i;
 int edges = 0;
 int minCost = 0;
 System.out.println();
 while(edges < n - 1)
 {
 int min = INF;
 int u = -1, v = -1;
 for(int i = 0; i < n; i++)
 {
 for(int j = 0; j < n; j++)
 {
 if(cost[i][j] < min)
 {
 min = cost[i][j];
   u = i;
 v = j;
 }
 }
 }
 int setU = find(parent, u);
 int setV = find(parent, v);
 if(setU != setV)
 {
 union(parent, setU, setV);
 System.out.println((u+1) + " + " + (v+1) + " -> " + min);
 minCost += min;
 edges++;
 }
 cost[u][v] = cost[v][u] = INF;
 }
 System.out.println("total is: " + minCost);
 }
}
/*Enter no. of nodes:
4
Enter matrix:
0 10 15 30
10 0 35 25
15 35 0 20
30 25 20 0
1 + 2 -> 10
1 + 3 -> 15
3 + 4 -> 20
total is: 45*/
