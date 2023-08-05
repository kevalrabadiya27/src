//18] Selection Sort

package sorting;
import java.util.Scanner;
public class selection {
        public static void main(String[] args) {
//            int a[] = {4,16,7,19,11,10};
            int[] a = new int[10];
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of arry:");
            System.out.println("__________________");
            int n = sc.nextInt();

            for(int i=0;i<n;i++){
              a[i] = sc.nextInt();
            }
            for (int i=0;i<n;i++) {
                int min_index = i;
                for (int j = i + 1; j < n; j++) {
                   if(a[min_index]>a[j]){
                       min_index = j;
                   }
                }
                int temp = a[min_index];
                a[min_index] = a[i];
                a[i] = temp;
            }
            System.out.println("------after sorted----- ");
            for (int i=0;i<n;i++){
                System.out.print(a[i]+ " ");
            }

        }
    }



