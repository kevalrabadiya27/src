package Array;

public class MIssingNumber {
    public static void main(String[] args) {

        int [] arr = {1,2,3,5,6};
        int Arraysize = 6;
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        int formula = Arraysize*(Arraysize+1)/2;
        System.out.println("Missing number is a: " + (formula-sum));
    }
}
