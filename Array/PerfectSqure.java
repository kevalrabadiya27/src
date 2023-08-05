//68] Given an integer n, return the least number of perfect square numbers that sum to n.
//Input: n = 12
//Output: 3
//Explanation: 12 = 4 + 4 + 4

package Array;
public class PerfectSqure {
    public static int getSqure(int n){
            if(n<=3){
                return n;
            }
            int res = n;
            for(int x=1;x<=n;x++){
                int temp = x*x;
                if(temp>n){
                    break;
                }else{
                    res = Math.min(res,1+getSqure(n-temp));
                }
            }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(getSqure(13));
    }
}

