public class Xpower {
    public static void main(String[] args) {
        System.out.println(xPowerN(3,4));
    }
    public static int xPowerN(int x, int n){
        // if(n==0){
        //     return 1;
        // }
        // return x*xPowerN(x,n-1);

        // OPTIMIZED   - O(log n);
        if(n==0){
            return 1;
        }
        int halfPower = xPowerN(x,n/2);
        if(n%2==0){
            // return xPowerN(x, n/2)*xPowerN(x,n/2);           // If I do this I have to call xPowerN func two times which makes it complexity of O(n)
            return halfPower*halfPower;
        }
        else{
            // return x*xPowerN(x, n/2)*xPowerN(x,n/2);         // If I do this I have to call xPowerN func two times which makes it complexity of O(n)
            return x*halfPower*halfPower;
        }
    }
}
