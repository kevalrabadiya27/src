//4] factorial using  resursive

package basic;
import java.util.Scanner;
public class factorialrecursen {
    static int factorial(int f){
       if(f>=1){
            return f*factorial(f-1);
        }
        else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        int data = factorial(n);
        System.out.println("Result is :"+data);
    }
}
