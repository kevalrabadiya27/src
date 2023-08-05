//44] WAP to convert an Octal into hexa-decimal.

package basic;
import java.util.Scanner;
public class OctToHexaDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter octal number:");

//        first solution
        String octnum = sc.nextLine();
        int decnum = Integer.parseInt(octnum,8);
        String hexnum = Integer.toHexString(decnum).toUpperCase();
        System.out.println("Coverted decimal number is:" +hexnum);

//        second solution
//            int octal = sc.nextInt();
//            char[] hexadecimal = new char[20];
//            int decimal=0,i=0,rem;
//
////            octal to decimal
//            while(octal!=0){
//                rem = octal%10;
//                decimal = (int)(decimal+(rem*Math.pow(8,i)));
//                i++;
//                octal = octal/10;
//            }
////            decimal to hexadecimal
//
//        while (decimal!=0){
//             rem = decimal%16;
//            if(rem<10){
//                rem = rem+48;
//            }else{
//                rem = rem+55;
//            }
//            hexadecimal[i]=(char) rem;
//            i++;
//            decimal = decimal/16;
//        }
//
////        print
//
//        for(i=(i-1);i>=0;i--){
//            System.out.println(hexadecimal[i]);
//        }

    }
}
