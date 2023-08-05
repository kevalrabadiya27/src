//6]   1
//     1 2
//     1 2 3
package patten;
import java.util.Scanner;

public class patten3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Number:"
        );
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<i;j++){
//                if you are print i so pattern change like;
//                  1
//                  2 2
//                  3 3 3
                System.out.print(" "+j);
            }
            System.out.println("");
        }
    }
}
