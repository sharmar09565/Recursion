public class Sudoku {

    public static boolean isSafe(int arr[][], int row, int col, int num){
        // row
        for(int i=0;i<9;i++){
            if(arr[i][col]==num){
                return false;
            }
        }
        // col
        for(int j=0;j<9;j++){
            if(arr[row][j]==num){
                return false;
            }
        }
        // house
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if (arr[i][j]==num) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSOlver(int arr[][], int row, int col){
        if(row==9 && col==0){
            return true;
        }
        else if(row==9){
            return false;
        }

        int nextRow = row, nextCol = col+1;
        if(col+1==9){
            nextRow++;
            nextCol=0;
        }
        if(arr[row][col]!=0){
            return sudokuSOlver(arr, nextRow, nextCol);
        }
        for(int digit=1;digit<=9;digit++){
            if(isSafe(arr, row, col, digit)){
                arr[row][col] = digit;
                if(sudokuSOlver(arr, nextRow, nextCol)){
                    return true;
                }
                arr[row][col] = 0;
            }
        }
        return false;
    }
    public static void printArr(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][] = {{0,0,8,0,0,0,0,0,0},
        {4,9,0,1,5,7,0,0,2},
        {0,0,3,0,0,4,1,9,0},
        {1,8,5,0,6,0,0,2,0},
        {0,0,0,0,2,0,0,6,0},
        {9,6,0,4,0,5,3,0,0},
        {0,3,0,0,7,2,0,0,4},
        {0,4,9,0,3,0,0,5,7},
        {8,2,7,0,0,9,0,1,3}
        };

        if(sudokuSOlver(arr, 0, 0)){
            System.out.println("Solution exist");
            printArr(arr);
        }
        else{
            System.out.println("Solution does not exist");
        }
    }
    
}
