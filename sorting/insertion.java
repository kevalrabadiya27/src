//17] Insertion Sort

package sorting;
import java.util.Scanner;
public class insertion {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of arry:");
        System.out.println("__________________");
        int n = sc.nextInt();
        System.out.println("__________________");
        int i;
        for (i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int j=1;j<n;j++){
            int key = a[j];
            i = j-1;
            while (i>=0 && a[i]>key){
                a[i+1] = a[i];
                i--;
            }
            a[i+1] = key;
        }
        System.out.println("__________________");
        for (i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }

    }

}
