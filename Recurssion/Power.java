package Recurssion;

public class Power {
    static int powerRec(int a,int b){
        if(b==0){
            return 1;
        }
        if(b==1){
            return a;
        }
//        RECURSIVE CALL
        int ans = powerRec(a,b/2);

        if(b%2==0){
//            b is even
//              a^(b/2)*a^(b/2)
            return ans *ans;
        }else{
//            b is odd
//            a* a^(b/2)*a^(b/2)
            return a * ans*ans;
        }
    }
    public static void main(String[] args) {
        int a=2,b=10;
        int ans = powerRec(a,b);
        System.out.println(ans);
    }
}
