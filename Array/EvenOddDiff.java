//Given a maximum of 100 digit numbers as input, find the difference between
// the sum of odd and even position digits.

package Array;
import java.util.Scanner;
public class EvenOddDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        String num = sc.nextLine();
        int oddSum=0,EvenSum=0,Diff=0;
        char[] arr = num.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                EvenSum+=Integer.parseInt(String.valueOf(arr[i]));
            }else {
                oddSum+=Integer.parseInt(String.valueOf(arr[i]));
            }
        }
        Diff = Math.abs(oddSum-EvenSum);
        System.out.println(Diff);
    }
}
