public class SrchInSortedRotatedArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 7, 0, arr.length-1));
    }
    public static int search(int arr[], int key, int si, int ei){

        if(si>ei){
            return -1;
        }

        int mid = si+(ei-si)/2;
        if(arr[mid]==key){
            return mid;
        }

        if(arr[mid]>=arr[si]){
            if(arr[si]<=key && key<arr[mid]){
                return search(arr, key, si, mid-1);
            }
            else{
                return search(arr, key, mid+1, ei);
            }
        }
        else{
            if(arr[ei]>=key && key>arr[mid]){
                return search(arr, key, mid+1, ei);
            }
            else{
                return search(arr, key, si, mid-1);
            }
        }
        
    }
}
