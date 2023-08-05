//24] deleted specific position in array

package Array;
import java.util.Scanner;
public class SpecificDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter size of arry:");
        int n = sc.nextInt();
        System.out.println("__________________");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        System.out.println("Enter position");
        int pos= sc.nextInt();

         for (int i=pos;i<n;i++){
           arr[i] = arr[i+1];
        }
        for (int i=0;i<n-1;i++){
            System.out.println(arr[i]);
        }

    }
}
