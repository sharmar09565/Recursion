public class ConvertToString {
    public static void main(String[] args) {
        // System.out.println(toString(2015, new StringBuilder()));
        toString(2014);
    }
    // public static StringBuilder toString(int n, StringBuilder sb){
    //     if(n==0){
    //         return sb;
    //     }
    //     int rem = n%10;
    //     if(rem==0){
    //         sb.insert(0, "zero ");
    //     }
    //     else if(rem==1){
    //         sb.insert(0, "one ");
    //     }
    //     else if(rem==2){
    //         sb.insert(0, "two ");
    //     }
    //     else if(rem==3){
    //         sb.insert(0, "three ");
    //     }
    //     else if(rem==4){
    //         sb.insert(0, "four ");
    //     }
    //     else if(rem==5){
    //         sb.insert(0, "five ");
    //     }
    //     else if(rem==6){
    //         sb.insert(0, "six ");
    //     }
    //     else if(rem==7){
    //         sb.insert(0, "seven ");
    //     }
    //     else if(rem==8){
    //         sb.insert(0, "eight ");
    //     }
    //     else if(rem==9){
    //         sb.insert(0, "nine ");
    //     }
    //     return toString(n/10, sb);
    // }

    // OPTIMIZED

    public static void toString(int n){
        String arr[] = {"zero", "one","two","three", "four", "five","six" , "seven", "eight","nine"};
        if(n==0){
            return;
        }
        int rem = n%10;
        toString(n/10);
        System.out.print(arr[rem]+" ");

    }

}
