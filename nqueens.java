import java.util.ArrayList;
public class nqueens {
    
public static boolean isSafe(char n[][],int row,int clm){
//vertical
for(int i=row-1;i>=0;i++){
    if(n[i][clm]=='Q'){
        return false;
    }
}


//diogonal
//right
for(int i=row-1,j=clm+1;i>=0 && j<n.length;i--,j++){
    if(n[i][j]=='Q'){
        return false;
    }
}
//left
for(int i=row-1,j=clm-1;i>=0 && j>=0;i--,j--){
    if(n[i][j]=='Q'){
        return false;
    }
}
return true;

}

    public static void nQuenns(char board[][], int row) {
        //base case
        if (row ==board.length) {
            return;
        }
        for (int col = 0; col <board.length; col++) {
            if (isSafe(board, row,col)) {
                //all possible pair
                board[row][col] = 'Q';
                nQuenns(board, row + 1);//recursion
                board[row][col] = 'X';//backtrack
            }else{

            }
        }
    }
    public static void printBoard(char board[][]){
for(int i=0;i<board.length;i++){
    for(int j=0;j<board.length;j++){
        System.out.println(board[i][j]);
    }
    System.out.println();
}
    }
    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char board[][]=new char[n][n];
        //initialise the board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        nQuenns(board,0);
        return ans;
    }
    public static void main(String[] args) {
        int n=2;
        char board[][]=new char[n][n];
        //initialise the board
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='X';
            }
        }
        nQuenns(board,0);
        printBoard(board);
        //print the board
        //print the board
        //test the isSafe function
        //System.out.println(isSafe(board,0,0));        
        
    }
}
