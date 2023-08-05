//47] WAP to Convert a Decimal to Hexa-decimal and vice versa.

package Array;

public class DecimalToHexa {
    public static void main(String[] args) {
//        decimal to hexadecimal
        int dec = 1508;
        System.out.println(Integer.toHexString(dec));
//        vice versa

        String hex="c";
        int decimal=Integer.parseInt(hex,16);
        System.out.println(decimal);
    }
}
