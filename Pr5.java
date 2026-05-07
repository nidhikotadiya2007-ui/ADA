import java.util.*;
public class quicksort
{
 static int pass = 1;
 static int partition(int a[], int low, int high)
 {
 int pivot = a[low];
 int i = low + 1;
 int j = high;
 while(i <= j)
 {
 while(i <= high && a[i] <= pivot)
 i++;
 while(a[j] > pivot)
 j--;
 if(i < j)
 {
 int temp = a[i];
 a[i] = a[j];
 a[j] = temp;
 }
 }
 int temp = a[low];
 a[low] = a[j];
 a[j] = temp;
 System.out.println("\nAfter pass " + (pass++));
 for(int x = 0; x < a.length; x++)
 {
 System.out.print(a[x] + " ");
 }
 return j;
 }
 static void quicksort(int a[], int low, int high)
 {
 if(low < high)
 {
 int p = partition(a, low, high);
 quicksort(a, low, p - 1);
 quicksort(a, p + 1, high);
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
 quicksort(a, 0, n - 1);
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

After pass 1
45 21 12 64 87 

After pass 2
12 21 45 64 87 

After pass 3
12 21 45 64 87 

Sorted Array:
12 21 45 64 87 
Total time: 174600*/
