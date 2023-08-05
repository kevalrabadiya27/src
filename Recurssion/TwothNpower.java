package Recurssion;

public class TwothNpower {
    static int nthpower(int n){
        if(n>=1){
            return 2*nthpower(n-1);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        int n = 0;
        int ans = nthpower(n);
        System.out.println(ans);
    }
}
