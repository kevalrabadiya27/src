//Pattrn-3
package patten;
import java.util.Scanner;
public class Patten6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Number:"
        );
        int n = sc.nextInt();
        for(int i=0;i<=n-1;i++){
            //left side
            for(int j=n-1;j>=i;j--){
                System.out.print("*");
            }
            //middle space
            for(int k=1;k<=i*1;k++){
                System.out.print("  ");
            }
            //right side
            for (int l = n-1; l >= i; l--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

