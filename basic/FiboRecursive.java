package basic;

import java.util.Scanner;

public class FiboRecursive {
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int data = fibo(num);
        System.out.println(data);
    }
}
