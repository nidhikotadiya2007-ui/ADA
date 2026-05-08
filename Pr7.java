import java.util.*;
public class prims_notebook
{
 static final int INF = 99;
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
 }
 }
 boolean visited[] = new boolean[n];
 visited[0] = true;
 int edges = 0;
 int minCost = 0;
 System.out.println();
 while(edges < n - 1)
 {
 int min = INF;
 int u = -1, v = -1;
 for(int i = 0; i < n; i++)
 {
 if(visited[i])
 {
 for(int j = 0; j < n; j++)
 {
 if(!visited[j] && cost[i][j] < min)
 {
 min = cost[i][j];
 u = i;
 v = j;
 }
 }
 }
 }
 visited[v] = true;
 System.out.println((u+1) + " + " + (v+1) + " -> " + min);
 minCost += min;
 edges++;
 }
 System.out.println("total is: " + minCost);
 }
}
/*Enter no. of nodes:
4
Enter matrix:
99 10 15 30
10 99 35 25
15 35 99 20
30 25 20 99
  1 + 2 -> 10
1 + 3 -> 15
3 + 4 -> 20
total is: 45*/
