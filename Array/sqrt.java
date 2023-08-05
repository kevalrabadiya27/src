//52 Given a non-negative integer x, compute and return the square root of x.
//Since the return type is an integer, the decimal digits are truncated, and only the integer part
//of the result is returned.
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x,
//0.5) or x ** 0.5.

package Array;
import java.util.Scanner;
public class sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s=0;
        int e = n;
         int mid = s+(e-s)/2;
         int ans = -1;
        while(s<=e){
            int sq = mid*mid;
            if(sq == n){
                System.out.println(mid);
            }
            if(sq <n){
//                ans = mid;
                s = mid+1;
            }
            else{
                e = mid-1;
            }
            mid = s+(e-s)/2;
        }

    }
}
