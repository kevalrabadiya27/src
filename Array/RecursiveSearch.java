//25]WAP to check weather number is present in array or not (using recursion only)
package Array;
import java.util.Scanner;
public class RecursiveSearch {
    static int binarysearch(int arr[],int m,int l,int r){
        if(r<l){
            return -1;
        }
        if(arr[l]==m){
            return l;
        }
       if(arr[r]==m){
           return r;
       }
       return binarysearch(arr,m,l+1,r-1);
    }
    public static void main(String[] args) {
        int arr[] = {4,8,9,10,77,55,76};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a search element");
        int m = sc.nextInt();
        int l = 0;
        int r = arr.length-1;
        int getdata = binarysearch(arr,m,l,r);
        if(getdata!=-1){
            System.out.println("Element found at "+(getdata+1)+" position");
        }
        else {
            System.out.println("Element are not found in array");
        }
    }
}
