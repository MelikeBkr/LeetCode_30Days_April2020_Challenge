class Solution {
    public int numIslands(char[][] grid)
    {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int numOfRows= grid.length;
        int numOfColumns= grid[0].length;
        int numOfIslands = 0;

        for(int row=0; row<numOfRows; row++)
        {
            for(int column=0; column<numOfColumns; column++)
            {
                if(grid[row][column]=='1')
                {
                    numOfIslands+= DFS(grid,row, column);
                }
            }
        }
        return numOfIslands;
    }

    public int DFS(char[][]array, int rowIndex, int columnIndex)
    {
        if(rowIndex<0 || rowIndex >= array.length || columnIndex<0 || columnIndex >= array[rowIndex].length
                || array[rowIndex][columnIndex]!='1')
        {
            return 0;
        }
        array[rowIndex][columnIndex] = 'X';
        DFS(array, rowIndex+1, columnIndex);
        DFS(array, rowIndex-1, columnIndex);
        DFS(array, rowIndex, columnIndex+1);
        DFS(array, rowIndex, columnIndex-1);
        return 1;
    }
}