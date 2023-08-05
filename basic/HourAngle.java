//14] Angle from Hour to Minute hand
package basic;
import java.util.Scanner;

public class HourAngle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hour:");
        int x = sc.nextInt();
        System.out.println("Enter Miniute:");
        int y = sc.nextInt();
       double angle = Math.abs((11*y-60*x)*0.5);
        System.out.println("--Angle from minute to hour hand--");
        System.out.println(angle+" Degree");
        System.out.println("--Angle from Hour to Minute hand--");
        int data = 30 * x;
        double angle2 = Math.abs(360 - data) ;
        System.out.println(angle2+" Degree");
    }
}
