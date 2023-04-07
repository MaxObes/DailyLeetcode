class NumEnclaves {
    int n, m;
    public int numEnclaves(int[][] grid) {
        n = grid.length;
        m = grid[0].length;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i == 0 || j == 0 || i == n-1 || j == m-1) && grid[i][j] == 1) {
                    dfs(grid,i, j);
                }
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                result += grid[i][j];
            }
        }
        return result;
    }
    public void dfs(int[][] grid, int row, int col){
        if (row < 0 || col < 0 || row >= n || col >= m || grid[row][col] == 0) {
            return;
        }

        grid[row][col] = 0;

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}
