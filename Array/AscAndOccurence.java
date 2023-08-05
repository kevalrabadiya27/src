//57 Write a Function that returns either 1 or 0 based on following condition if the array is in
//ascending order and occurrence of that number at least 3 then it should return 1 otherwise
//it should return 0.
//e.g.
//if A=[1,1,1,2,2] it should return 0
//if A=[1,1,1,3,3,3,3] it should return 1
//if A=[2,2,2,1,1,1] it should return 0
package Array;
import java.util.HashMap;
public class AscAndOccurence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2};
        HashMap<Integer,Integer>map = new HashMap<>();

          for(int ele:arr){
              map.put(ele,map.getOrDefault(ele,0)+1);
        }
//ascending check

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(0);
                return;
            }
        }
//        occurence check
        for(int ele:map.keySet())
        {
            if(map.get(ele)<3){
                System.out.println(0);
                return;
            }
        }

        System.out.println(1);
    }
}
