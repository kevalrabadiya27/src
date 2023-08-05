//3] facter using recursive
package basic;
import java.util.Scanner;
public class facterrecursen {
     public static void factor(int c,int i){
             if (i <= c) {
                 if (c % i == 0) {
                     System.out.print(i + " ");
                 }
             }
             //for next number
             factor(c, i + 1);

     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        factor(n,2);
    }
}
