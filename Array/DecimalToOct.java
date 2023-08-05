//46] WAP to Convert a Decimal to Octal and Vice versa.
package Array;

public class DecimalToOct {
    public static void main(String[] args) {
    //to convert decimal value into octal
        System.out.println(Integer.toOctalString(8));

//        octal to decimal
        //Declaring an octal number
        String octalString="121";
//Converting octal number into decimal
        int decimal=Integer.parseInt(octalString,8);
//Printing converted decimal number
        System.out.println(decimal);
    }
}
