//66] Given an integer array, return the k-th smallest distance among all the pairs. The distance
//        of a pair (A, B) is defined as the absolute difference between A and B.
//        E.g.
//        nums = [1,3,1,2]
//        k = 3
//        (1,3) -> 2
//        (1,1) -> 0
//        (1,2) -> 1
//        (3,1) -> 2
//        (3,2) -> 1
//        (1,2) -> 1
//        Then the 3rd smallest distance pair is (1,3) and its distance is 2.

package Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
public class KthDistance {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        int[] arr = {1,6,1};
        int k = 3;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               set.add(Math.abs(arr[i]-arr[j]));
            }
        }
        System.out.println(set);
        ArrayList<Integer> ar = new ArrayList<>(set);
        Collections.sort(ar);

       if(k-1>=ar.size()){
           System.out.println(ar.get(ar.size()-1));
       }else{
           System.out.println(ar.get(k-1));
       }
    }
}
