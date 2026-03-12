public class QuickSort {
    public static void main(String[] args) {
        int arr[] = {5,8,4,6,1,4};
        quickSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void quickSort(int arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int pivotIdx = partition(arr, si, ei);  // to get the idx of pivot el
        quickSort(arr, si, pivotIdx - 1);   // left part of the pivot el 
        quickSort(arr, pivotIdx + 1, ei);   // right part of the pivot el
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei]; // we can take any el as pivot el but here we have taken last el as pivot el
        int i = si - 1;     // to make an extra space for the el smaller than pivot

        for (int j = si; j < ei; j++) {
            if (arr[j] < pivot) {
                i++;
                // swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        //Swap the pivot el and place it at the right place
        // int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = pivot;

        return i;
    }
}
