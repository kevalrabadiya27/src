package Recurssion;

import java.util.Scanner;

public class Sumdigit {
    public static int add(int n){
        int sum = n%10;
        if(n==0){
            return 0;
        }else{
            return sum + add(n/10);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans =  add(n);
        System.out.println(ans);
    }
}
