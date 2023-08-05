//36 WAP to sort an Array using Merge sort.
package sorting;

public class Merge {

    void merge(int arr[],int l,int m,int r){
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

//        merge two array
        int i=0 , j=0;
        // Initial index of merged subarray array
        int k=l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public void sort(int arr[],int l,int r){
        if(l<r){
//            find the middle point
            int mid = l + (r-l)/2;
// sort first & second halves
            sort(arr,l,mid);
            sort(arr,mid+1,r);

//            merge the sorted halves
            merge(arr,l,mid,r);
        }
    }
    static void printArr(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {7,9,11,5,4,20,12};

        System.out.println("Given array ");
         printArr(arr);

        Merge ob = new Merge();
        ob.sort(arr,0,arr.length-1);

        System.out.println("---");
        printArr(arr);
    }
}
