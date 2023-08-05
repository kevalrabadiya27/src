//30] WAP to convert a Decimal to Binary

package Array;

import java.util.Scanner;
public class DecimalToBinary {
    static void toBinary(int decimal){
        int index = 0;
        int binary[] = new int[40];

        while (decimal>0){
            binary[index] = decimal%2;
            decimal = decimal/2;
            index++;
        }

        for(int i = index-1;i>=0;i--){
            System.out.print(binary[i]+" ");
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter Decimal Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        toBinary(num);
    }
}
