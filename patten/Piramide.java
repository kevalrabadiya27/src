package patten;
//      *
//     * *
//    * * *
public class Piramide {
    public static void main(String[] args) {
//        reverse piramide
        for(int i=1;i<=5;i++){
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            for(int j=5;j>=i;j--){
                System.out.print("*");
            }
            for(int l=4;l>=i;l--){
                System.out.print("*");
            }
            System.out.println("");

//            piramide
//            for(int k=5;k>=i;k--){
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            for(int l=2;l<=i;l++){
//                System.out.print("*");
//            }
//            System.out.println("");
        }
    }

}
