//42] WAP to implement a sliding window problem. You are given an array of integers nums,
//there is a sliding window of size k which is moving from the very left of the array to the
//very right. You can only see the k numbers in the window. Each time the sliding window
//moves right by one position.
//Input: nums = [1,3, -1, -3,5,3,6,7], k = 3
//Output: [3,3,5,5,6,7]

package Array;
import java.util.ArrayList;
public class SlidingWindow {
    public static void main(String[] args) {
        int [] arr = {1,3, -1, -3,5,3,6,7};
        int k = 3;
        int n = arr.length;
        int max;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<=n-k;i++){
             max = arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max = arr[i+j];
                }
            }
            list.add(max);

        }
        System.out.println(list);
    }
}
