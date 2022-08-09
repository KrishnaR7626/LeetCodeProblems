class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int MaxArea = 0;
        int currentMaxArea = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 1){
                    currentMaxArea = checkAround(i, j, grid);
                    if(currentMaxArea > MaxArea){
                        MaxArea = currentMaxArea;
                        currentMaxArea = 0;
                    }
                }
            }    
        }
        return MaxArea;
    }
    public int checkAround(int row, int col, int [][] grid){
        int max = 1;
        grid[row][col] = 0;
        if((row+1 < grid.length) && (grid[row+1][col] == 1)){
                max += checkAround(row+1, col, grid);
        }
        if((row > 0) && (grid[row-1][col] == 1)){
                max += checkAround(row-1, col, grid);
        }
        if((col+1 < grid[0].length) && (grid[row][col+1] == 1)){
                max += checkAround(row, col+1, grid);
        }
        if((col > 0) && (grid[row][col-1] == 1)){
                max += checkAround(row, col-1, grid);
        }
        return max;
    }
}
