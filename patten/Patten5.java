//22-2
package patten;
import java.util.Scanner;
public class Patten5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(
                "Enter Number:"
        );
        int n = sc.nextInt();
        int space=0;
        for(int i=n;i>=1;i--){
            //for considering only Odd row
            if(i%2!=0){
                for(int j=0;j<space;j++){
                    System.out.print(" ");
                }
                space+=1;
                for(int k=1;k<=i;k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
