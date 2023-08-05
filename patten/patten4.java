//21] 1 AB 234 CDEF

package patten;
import java.util.Scanner;
public class patten4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Number:"
        );
        int n = sc.nextInt();
        char str = 'A';
        int sum = 1;
        for(int i=1;i<=n;i++){
          for(int j=1;j<=i;j++){
              if(i%2==0) {
                  System.out.print(" "+str);
                  str++;
              }
              else
              System.out.print(" "+sum);
              sum++;
          }
            System.out.println("");
        }
    }
}
