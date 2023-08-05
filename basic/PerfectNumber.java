package basic;

public class PerfectNumber {
    public static void main(String[] args) {
        int num = 28;
//        int sum=0;
//        for(int i=1;i<=num/2;i++){
//            if(num%i==0){
//                sum+=i;
//            }
//        }
//        leetcode ans
        int sum=1;
        for(int i=2;i*i<=num;i++){
         if(num%i==0){
                sum+=i+num/i;
            }
        }
        if(sum==num){
            System.out.println("Yes");
        }else{
            System.out.println("No");

        }
    }
}
