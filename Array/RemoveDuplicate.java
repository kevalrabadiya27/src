package Array;

import java.util.HashSet;
import java.util.Set;
//set demo
public class RemoveDuplicate {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(45);
        set.add(23);
        set.add(45);

        int[] ar = new int[set.size()];
        int i=0;

        for(int ele:set){
            ar[i++] = ele;
        }

        for(int j :ar){
            System.out.print(" "+ j);
        }
    }
}
