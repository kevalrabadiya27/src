//39] rotate the array to the right by k steps, where k is non-negative.
package Array;
import java.util.Scanner;
public class RightRotation {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("Enter number of time to be rotated:");
        Scanner sc = new Scanner(System.in);
        int step = sc.nextInt();

        for(int i=0;i<step;i++){
           int last =  arr[arr.length-1];
            for(int j= arr.length-1;j>0;j--){
                arr[j] = arr[j-1];
            }
            arr[0] = last;
        }
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
