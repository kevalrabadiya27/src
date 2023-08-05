//3] facter iteretive

package basic;
import java.util.Scanner;

public class facter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(" "+i);
            }
        }
    }
}
