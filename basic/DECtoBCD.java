//15] Decimal to BCD
//N = 12 = 0001 0010
package basic;
import java.util.Scanner;

public class DECtoBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("0000");
        }
        int rev=0;
        while (num>0){
            //number reverse
            rev = rev*10 + (num%10);
            num = num/10;
        }
        while (rev>0) {
            //Find Binary for each digit using bitset
            String b = Integer.toBinaryString(rev % 10);
            System.out.print(b + " ");
            b = String.format("%04d", Integer.parseInt(b));
            System.out.print(b + " ");
            rev = rev / 10;
        }
    }
}
