class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>>ans=new ArrayList<>();
        char[][]board=new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        solve(0,board,ans);
        return ans;
    }
    public void solve(int col,char[][]board,List<List<String>>ans){
        if(col==board.length){
            ans.add(construct(board));
            return;
        }
        for(int row=0;row<board.length;row++){
            if(validate(board,row,col)){
                board[row][col]='Q';
                solve(col+1,board,ans);
                board[row][col]='.';
            }
        }
    }

    private static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    private boolean validate(char[][]board,int row,int col){
        int duprow=row;
        int dupcol=col;
        // check left lower digonal
        while(row>=0&&col>=0){
            if(board[row][col]=='Q')return false;
            row--;
            col--;
        }
        row=duprow;
        col=dupcol;
        // check left column
        while(col>=0){
            if(board[row][col]=='Q')return false;
            col--;
        }
        col=dupcol;
        // check right upper digonal
        while(col>=0 && row<board.length){
            if(board[row][col]=='Q')return false;
            col--;
            row++;
        }
        return true;
    }
}