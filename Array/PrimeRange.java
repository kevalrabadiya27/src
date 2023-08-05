package Array;

public class PrimeRange {
    public static boolean solve(int i){
        for(int j=2;j<=i/2;j++){
            if(i%j==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for(int i=3;i<=100;i++){
            boolean flag =solve(i);
            if(flag==true){
                System.out.println(i + "");
            }
        }
    }
}
