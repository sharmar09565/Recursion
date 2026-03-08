public class LastOccurrence {
    public static void main(String[] args) {
        int arr[] = {2,4,5,8,14,8,6};
        System.out.println(find(arr, 8, arr.length-1));
    }
    public static int find(int arr[], int n, int i){
        if(arr[i] == n ){
            return i;
        }
        else if(i==0){
            return -1;
        }
        return find(arr, n, i-1);
    }
}
