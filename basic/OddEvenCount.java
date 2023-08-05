//8]odd even count

package basic;

import java.util.Scanner;

public class OddEvenCount {
    public static void main(String[] args) {
        int[] arr = new int[100];
        int even=0,odd=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arry:");
        int n = sc.nextInt();
        System.out.println("__________________");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("Odd number is:" +odd + "||Even number is:"+even);
    }
}
