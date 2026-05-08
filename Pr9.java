import java.util.*;
public class coinchange_row_format
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter number of coins (n):");
 int n = sc.nextInt();
 System.out.println("Enter amount (N):");
 int amount = sc.nextInt();
 int coins[] = new int[n];
 System.out.println("Enter coin denominations:");
 for(int i = 0; i < n; i++)
 coins[i] = sc.nextInt();
 int dp[][] = new int[n][amount + 1];
 for(int i = 0; i < n; i++)
 {
 for(int j = 1; j <= amount; j++)
 {
 if(i == 0)
 {
 dp[i][j] = j; 
 }
 else if(coins[i] <= j)
 {
 dp[i][j] = Math.min(dp[i-1][j], 1 + dp[i][j - coins[i]]);
 }
 else
 {
 dp[i][j] = dp[i-1][j];
 }
 }
 }
 System.out.print("\nAmount → ");
 for(int i = 1; i <= amount; i++)
 System.out.print(i + " ");
 System.out.println();
 for(int i = 0; i < n; i++)
 {
 System.out.print("Coin " + coins[i] + " → ");
 for(int j = 1; j <= amount; j++)
 {
 System.out.print(dp[i][j] + " ");
 }
 System.out.println();
 }
 System.out.println("\nMinimum coins required: " + dp[n-1][amount]);
 System.out.print("Coins used: ");
 int i = n - 1;
 int j = amount;
 while(j > 0 && i >= 0)
 {
 if(i == 0)
 {
 System.out.print(coins[i] + " ");
 j = j - coins[i];
 }
 else if(dp[i][j] == dp[i-1][j])
 {
 i--; 
 }
 else
 {
 System.out.print(coins[i] + " ");
 j = j - coins[i];
 }
 }
 }
}
/*Enter number of coins (n):
3
Enter amount (N):
6
Enter coin denominations:
1 3 4
Amount → 1 2 3 4 5 6

Coin 1 → 1 2 3 4 5 6
Coin 3 → 1 2 1 2 3 2
Coin 4 → 1 2 1 1 2 2

Minimum coins required: 2
Coins used: 3 3*/
