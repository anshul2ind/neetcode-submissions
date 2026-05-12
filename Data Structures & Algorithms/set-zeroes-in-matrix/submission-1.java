class Solution {
    public void setZeroes(int[][] matrix) {
        List<Integer[]> zeroElements = new ArrayList<Integer[]>();
        int rows = matrix.length;
        int cols = matrix[0].length;
        for(int i = 0 ; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 0) {
                    zeroElements.add(new Integer[] {i, j});
                }
            }
        }

        zeroElements.stream().forEach(element -> {
            for(int i = 0; i < cols; i++) {
                matrix[element[0]][i] = 0;
            }
            for(int i = 0; i < rows; i++) {
                matrix[i][element[1]] = 0;
            }
        });
        
    }
}
