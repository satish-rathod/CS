public class numberofislands {

    public int dfs(int[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] != 1) {
            return 0;
        }
        grid[i][j] = 0;
        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);

        // dfs(grid,i-1,j-1);
        // dfs(grid,i-1,j+1);
        // dfs(grid,i+1,j-1);
        // dfs(grid,i+1,j+1);
        
        return 1;
    }
    public int number_of_islands(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count += dfs(grid, i, j);
            }
        }
        return count;
    }
}
