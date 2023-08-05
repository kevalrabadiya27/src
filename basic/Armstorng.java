//11] armstrong number

package basic;
import java.util.Scanner;
public class Armstorng {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        int temp = num;
        int sum = 0;

        while (num>0){
            int last = num%10;
            sum = sum+last*last*last;
            num = num/10;
        }
        if (sum==temp){
            System.out.println("Yes! number is armstrong 😊");
        }
        else {
            System.out.println("No! Not armstrong number 🙂");
        }
    }
}
