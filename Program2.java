import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        int standardWiseFee[] = new int[12];
        int standardOfStudent[] = new int[5];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter standard wise fee");
        for(int i=0;i<standardWiseFee.length;i++){
            standardWiseFee[i]=sc.nextInt();
        }
        System.out.println("Enter standard of student");
        for(int i=0;i<standardOfStudent.length;i++){
            standardOfStudent[i]=sc.nextInt();
        }

        System.out.println();
        double monthlyIncome = 0;
        for(int i=0;i<standardOfStudent.length;i++){
            monthlyIncome += standardWiseFee[standardOfStudent[i]];
        }
        System.out.print("Tushar's monthly income is:");
        System.out.print((String.format("%.2f",monthlyIncome/12)));

    }
}
