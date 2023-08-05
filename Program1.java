import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Light;

//        Input taken
        System.out.println("Enter space seperated value ");
//        System.out.println("Enter Initial Temperture:");
        int IT = sc.nextInt();
//        System.out.println("Enter Temperture:");
        int T = sc.nextInt();
//        System.out.println("Enter Average Minite:");
        int AM = sc.nextInt();

//        Light Selection
        if(IT>=10 && IT<=20){
             Light = "green";
        }
        else if(IT>=21 && IT<=50 ){
            Light = "Yellow";
        }
        else if(IT>=51 && IT<=70){
            Light = "Red";
        }else {
            Light = "None";
        }
        int difference = Math.abs(IT - T); //Differenece between T and IT is
        int time = difference * AM;
        System.out.println(Light+ " " + time);
    }
}
