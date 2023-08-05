// 43] Given an array of N integers, and an integer K, find the number of pairs of elements in the
//array whose sum is equal to K.
//e.g.
//Input:
//N = 4, K = 6
//arr[] = {1, 5, 7, 1}
//Output: 2
//Explanation:
//arr[0] + arr[1] = 1 + 5 = 6
//and arr[1] + arr[3] = 5 + 1 = 6

package Array;
public class SumEqualK {
    public static void main(String[] args) {
        int[] arr = {1,5,7,1,3};
        int k = 8;
        int count=0;

//        cal all subarray
        for(int i=0;i<arr.length-1;i++){
            int sum= 0;
            for(int j=i;j<arr.length;j++){
//     if subarray then  sum += arr[j];
                sum = arr[i]+arr[j];
                if(sum==k) count++;
                sum=0;
            }
        }
        System.out.println(count);
    }
}
