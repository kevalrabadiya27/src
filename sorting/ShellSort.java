//31] Shell sort
package sorting;
public class ShellSort {

    int sort(int arr[]){
        int n=arr.length;
        for (int gap = n/2; gap > 0; gap /= 2){
            for (int i = gap; i < n; i += 1){

                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];
                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
        return 0;
    }

    static void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 54, 2, 23,20};
        System.out.println("Array before sorting");
        printArray(arr);

        ShellSort ob = new ShellSort();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }
}
