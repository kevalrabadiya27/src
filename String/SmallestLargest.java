package String;

public class SmallestLargest {
    public static void solve(String name){
        String[] arr=name.split(" ");
        int maxlength,minlength;
        maxlength=Integer.MIN_VALUE;
        minlength=Integer.MAX_VALUE;
        String Largest,smallest;
        Largest = smallest = "";

        for(int i=0;i<arr.length;i++){
            if(arr[i].length() < minlength){
                smallest=arr[i];
                minlength=arr[i].length();
            }
            if(arr[i].length() > maxlength) {
                Largest=arr[i];
                maxlength=arr[i].length();
            }
        }
        System.out.println(Largest + " "+smallest);
    }
    public static void main(String[] args) {
        String name = "i am a student and iam kevalrabadiya";
        solve(name);
    }
}
