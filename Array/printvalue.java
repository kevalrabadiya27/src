package Array;
import java.util.Scanner;

public class printvalue {

        public static void main(String[] args) {
            int[] arr = new int[5];
            Scanner sc = new Scanner(System.in);

            for (int i =0;i<5;i++){
                arr[i]= sc.nextInt();
            }
            for (int i =0;i<5;i++){
                System.out.print(arr[i]+"");
            }
        }
    }

