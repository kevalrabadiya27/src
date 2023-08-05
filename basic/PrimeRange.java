//10] prime between range
package basic;
import java.util.Scanner;
public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First Number");
        int n1 = sc.nextInt();
        System.out.println("Enter a Second  Number");
        int n2 = sc.nextInt();
        int isPrime;

        for(int i=n1;i<=n2;i++){

            if(i==0 || i==1){
                continue;
            }
            isPrime=0;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    isPrime=1;
                    break;
                }
            }
            if(isPrime==0){
                System.out.print(" "+i);
            }
        }

    }
}
