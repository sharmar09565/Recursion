public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }

    public static int fibonacci(int n){
        if(n==0||n==1){
            return n;
        }
        return fibonacci(n-2)+fibonacci(n-1);
        
    }
}
