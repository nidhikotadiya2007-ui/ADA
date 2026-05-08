import java.util.*;
public class lcs_dp
{
 public static void main(String args[])
 {
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter first string:");
 String s1 = sc.nextLine();
 System.out.println("Enter second string:");
 String s2 = sc.nextLine();
 int m = s1.length();
 int n = s2.length();
 int dp[][] = new int[m+1][n+1];
 for(int i = 1; i <= m; i++)
 {
 for(int j = 1; j <= n; j++)
 {
 if(s1.charAt(i-1) == s2.charAt(j-1))
 dp[i][j] = 1 + dp[i-1][j-1];
 else
 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
 }
 }
 System.out.println("\nDP Table:");
 for(int i = 0; i <= m; i++)
 {
 for(int j = 0; j <= n; j++)
 {
 System.out.print(dp[i][j] + " ");
 }
 System.out.println();
 }
 System.out.println("\nLCS Length: " + dp[m][n]);
 int i = m, j = n;
 String lcs = "";
 while(i > 0 && j > 0)
 {
 if(s1.charAt(i-1) == s2.charAt(j-1))
 {
 lcs = s1.charAt(i-1) + lcs;
 i--;
 j--;
 }
 else if(dp[i-1][j] > dp[i][j-1])
 {
 i--;
 }
 else
 {
 j--;
 }
 }
 System.out.println("LCS: " + lcs);
 }
}
/*Enter first string:
ABCBDAB

Enter second string:
BDCABA

DP Table:
0 0 0 0 0 0 0
0 0 0 0 1 1 1
0 1 1 1 1 2 2
0 1 1 2 2 2 2
0 1 1 2 2 3 3
0 1 2 2 2 3 3
0 1 2 2 3 3 4
0 1 2 2 3 4 4

LCS Length: 4
LCS: BCBA
  */
