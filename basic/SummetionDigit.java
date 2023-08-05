//5]sum of digit itretion
package basic;
import java.util.Scanner;

public class SummetionDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        int sum=0,rev;
        while (n>0) {
            rev = n % 10;
            sum = sum + rev;
            n = n / 10;
        }
        System.out.println("Sum of Your Enter number:" + sum);
    }
}
