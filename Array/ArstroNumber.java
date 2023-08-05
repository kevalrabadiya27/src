//58]Write a program to check weather number is happy number is not, happy number are those
//        number whose digit’s square summation eventually reaches to 1, if the sequence start
//        repeating then it is not a happy number, to store this sequence, use a dynamic data structure.
//        E.g., 49 is a happy number whose sequence is 49 97 130 10 1
//        E.g., 50 is not a happy number whose sequence is 50 25 29 85 89 145 42 20 4 16 37 58 89
//        it should stop when 89 is detected 2nd time and print 50 is not a happy number.

package Array;
import java.util.Scanner;

//1] iterative method
//public class ArstroNumber {
//    public static int ArstoLogic(int n){
//      int sum=0,rem=0;
//        while (n>0){
//             rem = n%10;
//             sum+=rem*rem;
//             n=n/10;
//        }
//        return sum;
//    }
//    public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//        System.out.println("Enter number:");
//        int n = sc.nextInt();
//        int ans = n;
//
//        while (ans!=1 && ans!=4){
//            ans = ArstoLogic(ans);
//        }
//if(ans==1){
//    System.out.println("happy number");
//}else if(ans==4){
//    System.out.println("not happy number");
//}
//    }
//}

//2] recursive method

public class ArstroNumber {
    public static int ArstoLogic(int n){
      int sum=0,rem=0;
      if(n<10){
          if(n==1 || n==7){
              return 1;
          }else{
              return 0;
          }
      }
        while (n>0){
             rem = n%10;
             sum+=rem*rem;
             n=n/10;
        }
       return ArstoLogic(sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        int result =ArstoLogic(n);
        System.out.println(result);
    }
}
