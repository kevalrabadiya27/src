//19] Bucket Sort
package sorting;
import java.util.Scanner;

public class BucketSort {
   int getMax(int a[]) //function to get maximum element from the given
   {
       int n = a.length;
       int max = a[0];
       for (int i = 1; i < n; i++)
           if (a[i] > max)
               max = a[i];
       return max;
   }

   void bucket(int a[],int d) // implement bucket sort
   {
       int max = getMax(a);
       int bucket[] = new int[max+1];
       for (int i=0;i<=max;i++){
           bucket[i] = 0;
       }
       for (int i = 0; i < d; i++)
       {
           bucket[a[i]]++;
       }
       for (int i = 0, j = 0; i <= max; i++)
       {
           while (bucket[i] > 0)
           {
               a[j++] = i;
               bucket[i]--;
           }
       }
   }

   void printdata(int a[],int b){
       int i;
       for (i = 0; i < b; i++)
           System.out.print(a[i] + " ");
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        System.out.println("Enter Size of Array");
        int n = sc.nextInt();
        System.out.println("-----Enter the Data------");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("----------Your Data is--------");

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("");
        BucketSort B1 = new BucketSort();
        B1.bucket(arr,n);
        B1.printdata(arr,n);
    }
}
