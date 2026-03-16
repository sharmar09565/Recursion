public class GridWays {
    public static int gridWays(int i,int j,int n, int m){
        // base case
        if(i==n-1 && j==m-1){       // Condition for last cell 
            return 1;
        }
        else if(i==n || j==m){      // Condition for boundary cross
            return 0;
        }
        int ways1 = gridWays(i, j+1, n, m);
        int ways2 = gridWays(i+1, j, n, m);
        return ways1+ways2;
    }
    public static void main(String[] args) {
        System.out.println(gridWays(0, 0, 3, 4));
    }
}
