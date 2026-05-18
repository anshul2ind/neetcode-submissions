class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<String>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                var row = "r" + i + board[i][j];
                var col = "c" + j + board[i][j];
                var box = "b" + getSubBox(i, j) + board[i][j];
                if (set.contains(row) || set.contains(col) || set.contains(box)) {
                    return false;
                }
                set.add(row);
                set.add(col);
                set.add(box);
            }
        }
        return true;
    }

    private String getSubBox(int i, int j) {
        var row = (i / 3) * 3;
        var col = j / 3;
        return "" + (row + col);
    }
}
