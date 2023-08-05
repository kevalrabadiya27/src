//16] BubbleSort

package sorting;
import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new  int[100];
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
        System.out.println("------------After sorting ----------");

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
