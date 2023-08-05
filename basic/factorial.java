//4] factorial itretive
package basic;
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = s.nextInt();
        int fac=1;
        for(int i=1;i<=n;i++){
            fac = fac*i;
        }
        System.out.println(fac);
    }
}
