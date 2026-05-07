import java.util.*;
public class selectionsort
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
 for(int i = 0; i < n - 1; i++)
 {
 int min = i;
 for(int j = i + 1; j < n; j++)
 {
 if(a[j] < a[min])
 {
 min = j;
 }
 }
 temp = a[i];
 a[i] = a[min];
 a[min] = temp;
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
12 21 87 64 45 

After loop 2
12 21 87 64 45 

After loop 3
12 21 45 64 87 

After loop 4
12 21 45 64 87 

Sorted Array:
12 21 45 64 87 
Total time: 154300*/
