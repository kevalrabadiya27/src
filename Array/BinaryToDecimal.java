//26]WAP to convert a Binary to Decimal

package Array;
import java.util.Scanner;
public class BinaryToDecimal {
    static int CovertToDecimal(int num){
        int decimalnumber=0,i=0;
        long reminder;
        while (num!=0){
            reminder = num%10;
            decimalnumber +=reminder*Math.pow(2,i);
            num/=10;
            i++;
        }
        return decimalnumber;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Binary number:");
        int num = sc.nextInt();
        int decimal = CovertToDecimal(num);
        System.out.println("Coverted decimal number is:" +decimal);
    }
}
