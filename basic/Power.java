//20] power without multiply and pow function

package basic;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        System.out.println("Enter power");
        int b = sc.nextInt();

        if (b==0){
            System.out.println(0);
        }
        int answer = a;
        int increment = a;

        for(int i=1;i<b;i++){
            for(int j=1;j<a;j++){
                answer = answer + increment;
                //5 = 5+5
                //answer = 10
            }
            increment = answer;
            //increment = 25
        }
        System.out.println(answer);
    }
}
