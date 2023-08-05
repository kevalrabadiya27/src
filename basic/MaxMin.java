//12] Max,Min,Sum,Average without Array
package basic;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int limit,i;
        float a,sum=0,max=0,min=0;
        System.out.print("Enter Limit: ");
        limit = sc.nextInt();

        for (i=0;i<limit;i++){
            a = sc.nextFloat();
            if(i==0)
            {
                /* use the first value as the initial value of max and min */
                max=a;
                min=a;
            }
            else
            {
                if(a>max)
                {
                    max=a;
                }
                if(a<min)
                {
                    min=a;
                }
            }
            sum=sum+a;
        }
        System.out.println("Min:"+min);
        System.out.println("Max:"+max);
        System.out.println("Sum:"+sum);
        System.out.println("Average:"+sum/limit);

    }
}
