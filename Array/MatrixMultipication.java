
//13] matrix multipications
package Array;
import java.util.Scanner;

public class MatrixMultipication {
    public static void main(String[] args) {
        int row,col,row2,col2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a First about matrix");
        System.out.println("Enter size Of Row ");
         row = sc.nextInt();
        System.out.println("Enter size Of Column ");
         col = sc.nextInt();
//first
        int a[][] = new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j] = sc.nextInt();
            }
        }
//        second
        System.out.println("----------------");
        System.out.println("Enter a Second about matrix");
        System.out.println("Enter size Of Row ");
         row2 = sc.nextInt();
        System.out.println("Enter size Of Column ");
         col2 = sc.nextInt();
        int b[][] = new int[row2][col2];
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        int c[][] = new int[row][col2];
//        print first
        System.out.println("----------Your First Matrix Are----------------");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
//print second
        System.out.println("----------Your Second Matrix Are----------------");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(b[i][j]+" ");
            }
            System.out.println(" ");
        }


        System.out.println("-------Your Multiplication Matrix------");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                // Initialize the element C(i,j) with zero
                c[i][j] = 0;

                // Dot product calculation
                for (int k = 0; k < col; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

    }
}
