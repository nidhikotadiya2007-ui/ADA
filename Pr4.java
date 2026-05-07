import java.util.*;
public class mergesort
{
 static int pass = 1;
 static void merge(int a[], int low, int mid, int high)
 {
 int i = low, j = mid + 1, k = 0;
 int temp[] = new int[high - low + 1];
 while(i <= mid && j <= high)
 {
 if(a[i] < a[j])
 {
 temp[k++] = a[i++];
 }
 else
 {
 temp[k++] = a[j++];
 }
 }
 while(i <= mid)
 {
 temp[k++] = a[i++];
 }
 while(j <= high)
 {
 temp[k++] = a[j++];
 }
 for(i = low, k = 0; i <= high; i++, k++)
 {
 a[i] = temp[k];
 }
 System.out.println("\nAfter merge pass " + (pass++));
 for(int x = 0; x < a.length; x++)
 {
 System.out.print(a[x] + " ");
 }
 }
 static void mergesort(int a[], int low, int high)
 {
 if(low < high)
 {
 int mid = (low + high) / 2;
 mergesort(a, low, mid);
 mergesort(a, mid + 1, high);
 merge(a, low, mid, high);
 }
 }
 public static void main(String args[])
 {
 int n;
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter value of n:");
 n = sc.nextInt();
 int a[] = new int[n];
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
 mergesort(a, 0, n - 1);
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
Original Array:
64 21 87 12 45 

After merge pass 1
21 64 87 12 45 

After merge pass 2
21 64 87 12 45 

After merge pass 3
21 64 87 12 45 

After merge pass 4
12 21 45 64 87 

Sorted Array:
12 21 45 64 87 
Total time: 186500*/
