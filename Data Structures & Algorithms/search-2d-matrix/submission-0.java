class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int e = (rows * cols) - 1;
        int s = 0;
        
        while ( s <= e) {
            var m = s + (e-s)/2;
            var mValue = matrix[getRow(m, cols)][getCol(m, cols)];
            if(target > mValue) {
                s = m + 1;
            } else if ( target < mValue) {
                e = m - 1;
            } else {
                return true;
            }
        }
        return false;
        
    }

    public int getRow(int index, int totalCols) {
    return index / totalCols;
    }

    public  int getCol(int index, int totalCols) {
        return index % totalCols;
    }
}
