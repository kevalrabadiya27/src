package Recurssion;

public class Factorial {
    static int factorial(int n){
        if(n<=1){
            return 1;
        }else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        int n = 5;
        int ans = factorial(n);
        System.out.println(ans);
    }
}
