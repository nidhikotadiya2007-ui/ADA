import java.util.*;
public class bubblesort
{
 public static void main(String args[])
 {
 int n, temp;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter value of n:");
 n = sc.nextInt();
 int a[] = new int[n];
 System.out.println("Enter elements:");
 for(int i = 0; i < n; i++)
 {
 a[i] = (int)(Math.random() * 100);
 }
 System.out.println("Original Array:");
 for(int i = 0; i < n; i++)
 {
 System.out.print(a[i] + " ");
 }
 long start = System.nanoTime();
 for(int i = 0; i < n; i++)
 {
 for(int j = 0; j < n - i - 1; j++)
 {
 if(a[j] > a[j + 1])
 {
 temp = a[j];
 a[j] = a[j + 1];
 a[j + 1] = temp;
 }
 }
 System.out.println("\nAfter loop " + (i + 1));
 for(int k = 0; k < n; k++)
 {
 System.out.print(a[k] + " ");
 }
 }
 long end = System.nanoTime();
 System.out.println("\nSorted Array:");
 for(int i = 0; i < n; i++)
 {
 System.out.print(a[i] + " ");
 }
 System.out.println("\nTotal time: " + (end - start));
 }
}
/*Enter value of n:
5
Enter elements:
Original Array:
64 21 87 12 45 

After loop 1
21 64 12 45 87 

After loop 2
21 12 45 64 87 

After loop 3
12 21 45 64 87 

After loop 4
12 21 45 64 87 

After loop 5
12 21 45 64 87 

Sorted Array:
12 21 45 64 87 
Total time: 148200*/
