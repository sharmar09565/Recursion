public class Occurrences {
    public static void main(String[] args) {
        int arr[] = {2,5,8,2,4,2,7,6};
        allIndices(arr, 2, 0);
    }

    public static void allIndices(int arr[], int key, int i){
        if(i==arr.length){
            return ;
        }
        if(arr[i]==key){
            System.out.print(i+" ");
        }
        allIndices(arr, key, i+1);
    }
}
