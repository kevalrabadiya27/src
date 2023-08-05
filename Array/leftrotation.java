package Array;

import java.util.Scanner;

//left rotation
class leftrotation{
    public static void main(String[] args) {
        int[] arr1= new int[]{1,2,3,4,5,6,7};
        Scanner s = new Scanner(System.in);
        int n,first;
        // rotation given as n
        n = s.nextInt();
        for(int i=0;i<n;i++) {
            first = arr1[0];
            for (int j = 0; j< arr1.length-1; j++) {
                arr1[j] = arr1[j+1];
            }
            arr1[arr1.length-1] = first;
        }
        System.out.println("---after left rotation----");
        for (int i=0;i< arr1.length;i++){
            System.out.print(" "+arr1[i]);
        }
    }
}
