import java.util.*;
public class knapsack_dp
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of items:");
 int n = sc.nextInt();
 int wt[] = new int[n];
 int val[] = new int[n];
 System.out.println("Enter weights:");
 for(int i = 0; i < n; i++)
 wt[i] = sc.nextInt();
 System.out.println("Enter values:");
 for(int i = 0; i < n; i++)
 val[i] = sc.nextInt();
 System.out.println("Enter capacity:");
 int W = sc.nextInt();
 int dp[][] = new int[n+1][W+1];
 for(int i = 1; i <= n; i++)
 {
 for(int w = 0; w <= W; w++)
 {
 if(wt[i-1] <= w)
 {
 dp[i][w] = Math.max(dp[i-1][w], val[i-1] + dp[i-1][w - 
wt[i-1]]);
 }
 else
 {
 dp[i][w] = dp[i-1][w];
 }
 }
 }
 System.out.print("\nCapacity → ");
 for(int w = 0; w <= W; w++)
 System.out.print(w + " ");
 System.out.println();
 for(int i = 1; i <= n; i++)
 {
 System.out.print("Item " + i + " → ");
 for(int w = 0; w <= W; w++)
 {
 System.out.print(dp[i][w] + " ");
 }
 System.out.println();
 }
 System.out.println("\nMaximum Profit: " + dp[n][W]);
 System.out.print("Items selected: ");
 int i = n, w = W;
   while(i > 0 && w > 0)
 {
 if(dp[i][w] != dp[i-1][w])
 {
 System.out.print(i + " ");
 w = w - wt[i-1];
 }
 i--;
 }
 }
}
/*Enter number of items:
4

Enter weights:
1 3 4 5

Enter values:
1 4 5 7

Enter capacity:
7
Capacity → 0 1 2 3 4 5 6 7

Item 1 → 0 1 1 1 1 1 1 1
Item 2 → 0 1 1 4 5 5 5 5
Item 3 → 0 1 1 4 5 6 6 9
Item 4 → 0 1 1 4 5 7 8 9

Maximum Profit: 9
Items selected: 3 2*/
