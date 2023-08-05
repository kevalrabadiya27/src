package patten;

public class patten2 {
    public static void main(String[] args) {
        int n=6;

        for(int i=n;i>=1;i--){
            for(int k=1;k<i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=n-i;j++){
//                if you are space in below line then create pyramide patten
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
