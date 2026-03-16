import java.util.Scanner;

public class nQueens2 {
    public static boolean canSit(char arr[][], int row, int col){
        // Check top
        for(int i=row-1;i>=0;i--){
            if(arr[i][col]=='Q'){
                return false;
            }
        }

        // Check top-left diagonal
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(arr[i][j]=='Q'){
                return false;
            }
        }

         // Check top-right diagonal
        for(int i=row-1,j=col+1;i>=0 && j<arr.length;i--,j++){
            if(arr[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static boolean nQueens(char arr[][], int row){
        
        if(row == arr.length){
            printArr(arr);
            return true;
        }
        for(int col=0;col<arr.length;col++){
            if(canSit(arr, row, col)){
                arr[row][col] = 'Q';
                if(nQueens(arr, row+1)){
                    return true;
                };
                arr[row][col] = '.';
            }
        }
        return false;
    }

    public static void printArr(char arr[][]){
        System.out.println("----Chess board----");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the board:");
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        
        // Initialization
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = '.';      // It means it is empty
            }
        }
        if(nQueens(board, 0)){
            System.out.println("Solution is possible");
            printArr(board);
        }
        else{
            System.out.println("Solution is not possible");
        }
        
    }
}
