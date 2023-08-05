package Array;
import java.util.Scanner;
public class copyarray{
        public static void main(String[] args) {
            int arr1[]= new int[5];
            Scanner s = new Scanner(System.in);
            for(int i=0;i<arr1.length;i++){
                arr1[i] = s.nextInt();
            }
            int arr2[] = new int[arr1.length];
            for(int i=0;i<arr1.length;i++){
                arr2[i] = arr1[i];
            }
            //display
            System.out.println("---copy array is------");
            for(int i=0;i<arr2.length;i++){
                System.out.print(" " + arr2[i]);
            }

        }
    }


