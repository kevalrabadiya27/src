//23]WAP to enter an element at specific position into array. (Do not take a new array)

package Array;
import java.util.Scanner;

public class SpecificPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[100];
        System.out.println("Enter size of arry:");
        int n = sc.nextInt();
        System.out.println("__________________");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter a Number ");
        int num = sc.nextInt();
        System.out.println("Enter position ");
        int pos = sc.nextInt();
        for(int i=n+1;i>=pos;i--){
            arr[i+1] = arr[i];
        }
        arr[pos] = num;
        for(int i=0;i<n+1;i++){
            System.out.println(arr[i]);
        }
    }
}
