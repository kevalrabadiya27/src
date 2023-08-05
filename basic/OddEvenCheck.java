//9]number is Odd or Even without using a %

package basic;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        int result = n;
       if((n/2)*2==result){
           System.out.println("Number is even");
       }
       else {
           System.out.println("Number is Odd ");
       }
    }
}
