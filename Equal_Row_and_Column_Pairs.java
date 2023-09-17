class Solution {
    public  int[] getColumn(int[][] matrix, int columnIndex) {
        int rows = matrix.length;
        int[] column = new int[rows];
        for (int i = 0; i < rows; i++) {
            column[i] = matrix[i][columnIndex];
        }

        return column;
    }
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (Arrays.equals(grid[i], getColumn(grid, j))) {
                    count++;
                }
            }
        }

        return count;
    }


}
