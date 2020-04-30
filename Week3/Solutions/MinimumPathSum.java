class Solution {
    public int minPathSum(int[][] grid)
    {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int[][] sumMatrix = new int[grid.length][grid[0].length];
        sumMatrix[0][0] =grid[0][0];
        for(int i=1; i<grid.length; i++)
        {
            sumMatrix[i][0] = sumMatrix[i-1][0] +grid[i][0];
        }
        for(int j=1; j<grid[0].length; j++)
        {
            sumMatrix[0][j]= sumMatrix[0][j-1] + grid[0][j];
        }
        for(int i=1; i<grid.length; i++)
        {
            for(int j=1; j<grid[0].length; j++)
            {
                sumMatrix[i][j]= Math.min(sumMatrix[i-1][j], sumMatrix[i][j-1]) + grid[i][j];
            }
        }
        return sumMatrix[grid.length-1][grid[0].length-1];
    }
}