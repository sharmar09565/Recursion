public class Tiling {
    public static void main(String[] args) {
        System.out.println(tiling(2));
    }

    public static int tiling(int n){
        if(n== 0 || n==1){
            return 1;
        }
        // int horizontalTiling = tiling(n-2);
        // int verticalTilling = tiling(n-1);

        // int totalWays = horizontalTiling + verticalTilling;
        // return totalWays;

        return tiling(n-1)+tiling(n-2);
    }
}
