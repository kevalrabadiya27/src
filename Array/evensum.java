//1] sum of even number in 1d array
package Array;
import java.util.Scanner;
public class evensum {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arry:");
        int n = sc.nextInt();
        System.out.println("__________________");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for (int j=0;j<n;j++){
            if(arr[j]%2==0){
                sum = sum+arr[j];
            }
        }
        if(sum==0){
            System.out.println("Not Any Even number in Array!");
        }
        else{
            System.out.println("Sum of Even Number - " + sum);
        }

    }
}
