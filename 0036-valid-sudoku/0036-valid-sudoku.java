class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
                    HashSet<Character> col=new HashSet<>();

            for(int j=0;j<9;j++){
                if(board[j][i]!='.'){
                    if(col.contains(board[j][i])){
                        return false;
                    }
                    else{
                        col.add(board[j][i]);
                    }
                }
            }
        }

        for(int i=0;i<9;i++){
            HashSet<Character> row=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(row.contains(board[i][j])){
                        return false;
                    }
                    else{
                        row.add(board[i][j]);
                    }
                }
            }
        }
        for (int row = 0; row < 9; row += 3) {
    for (int col = 0; col < 9; col += 3) {
        HashSet<Character> set = new HashSet<>();
        for (int i = row; i < row + 3; i++) {
    for (int j = col; j < col + 3; j++) {
        if (board[i][j] != '.') {
    if (set.contains(board[i][j])) {
        return false;
    }
    set.add(board[i][j]);
}

    }
}

    }
}
        return true;
    }
}