package Array;

public class MoveZeroFirst {
    public static void main(String[] args) {
        int [] arr = {1,3,0,6,0,3};
        int arrIndex = 0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i;j>arrIndex;j--){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                arrIndex++;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }

}
