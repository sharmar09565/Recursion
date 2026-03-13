public class MergeSortOnStr {
    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury"};
        mergerSort(arr, 0, arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void mergerSort(String arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int mid = si + (ei-si)/2;
        mergerSort(arr, si, mid);
        mergerSort(arr, mid+1, ei);

        merge(arr, si, mid, ei);
    }
    public static void merge(String arr[],int si, int mid, int ei){
        String temp[] = new String[ei-si+1];
        int i=si;   // idx for left part
        int j=mid+1;    // idx for right part
        int k=0;    // idx for temp arr

        // Loop to compare the left sorted part and the right sorted part 
        while (i<=mid && j<=ei) {
            if(arr[i].compareToIgnoreCase(arr[j])<0){
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // For leftover el of left part
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
        // For leftover el of right part
        while (j<=ei) {
            temp[k++] = arr[j++];
        }

        // Copy the value of temp in the original arr
        for(k=0,i=si;k<temp.length;k++,i++){
            arr[i] = temp[k];
        }
    }
}
