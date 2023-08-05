package String;

import java.util.Scanner;

public class RevStringRecurssion {
    static String solve(String s){
        if(s.length()==1){
            return s;
        }
        char curr = s.charAt(0);
        String next = solve(s.substring(1));
        return next + curr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String s = sc.next();
        String ans = solve(s);
        System.out.println(ans);
    }
}
