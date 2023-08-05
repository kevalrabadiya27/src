//5]sum of digit recursion
package basic;
import java.util.Scanner;

public class SumDigitRecursive {
    static int Digitsum(int num){
        return num==0?0:num%10+Digitsum(num/10);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        int data = Digitsum(n);
        System.out.println(data);
    }
}
