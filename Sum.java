public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(10));
    }

    public static int sum(int n){
        if(n==1 || n==0){
            return n;
        }
        else{
            return n+sum(n-1);
        }
    }
}
