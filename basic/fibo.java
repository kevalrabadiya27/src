//7] fibonacci itretive
package basic;
import java.util.Scanner;

class fibo {
        public static void main(String[] args) {
            System.out.println("Enter the number:");
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            int n1 = 0;
            int n2 = 1;
            int count= 2;

            while (count<=num){
                int temp = n2;
                n2 = n2+n1;
                n1 = temp;
                count++;
            }
            System.out.println(n2);
        }
    }


