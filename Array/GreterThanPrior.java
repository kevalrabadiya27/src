package Array;

public class GreterThanPrior {
    public static void main(String[] args) {
        int [] arr = {7,4,8,2,9,10,14};
        int count=0;
        int max= Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
           int curr=arr[i];
           if(curr>max){
               max = curr;
               count++;
           }
        }
        System.out.println(count);
    }
}
