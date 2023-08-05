package basic;
import java.util.Scanner;

    public class prime {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number");
            int n = sc.nextInt();
            int flag=0;
            for (int i= 2;i<=n/2;i++){
                if (n%i==0){
                    System.out.println(" not prime");
                    flag=1;
                    break;
                }
            }
            if (flag==0){

                System.out.println("prime");
            }
        }
    }


