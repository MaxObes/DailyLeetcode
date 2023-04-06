class ClosedIslands {
    int m, n;
    public int closedIsland(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

        // make top and bottom edges visited since they can't form island
        for (int i = 0; i < n; i++) {
            dfs(grid, 0, i);
            dfs(grid, m-1, i);
        }

        // make side edges visited since they can't form island
        for (int i = 0; i < m; i++) {
            dfs(grid, i, 0);
            dfs(grid, i, n-1);
        }

        int result = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {
                    // since we altered edges, if we find a 0, it will be land locked
                    // so we must use DFS to alter any connected 0s before continuing
                    result++;
                    dfs(grid, i, j);
                }
            }
        }
        
        return result;
    }

    void dfs(int[][] grid, int row, int col) {
        // need to stop from searching beyond grid while changing edges to -1
        // also need to create base case while recursively DFS through 0
        // if 'node' is 1 or -1, we don't investigate
        if (row < 0 || col < 0 || row >= m || col >= n || grid[row][col] != 0) {
            return;
        }

        // direction vectors for moving DFS across rows and columns
        int[] drow = {1, -1, 0, 0};
        int[] dcol = {0, 0, 1, -1};
        
        // make 'node' visited
        grid[row][col] = -1;

        // look above, below, right and left for 0
        for (int i = 0; i < 4; i++) {
            int x = row + drow[i];
            int y = col + dcol[i];
            dfs(grid, x, y);
        }
    }
}
