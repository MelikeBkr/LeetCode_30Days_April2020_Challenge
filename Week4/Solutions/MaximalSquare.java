class Solution {
    public int maximalSquare(char[][] matrix)
    {    
          if(matrix.length == 0)
          {
              return 0;
          }
          int m = matrix.length;
          int n = matrix[0].length;
          int result = 0;
        
          int[][] sum = new int[m+1][n+1];
    
          for (int i = 1 ; i <= m; i++) 
          {
            for (int j = 1; j <= n; j++) 
            {
                if(matrix[i-1][j-1] == '1') 
                {
                    sum[i][j] = Math.min(Math.min(sum[i][j-1] , sum[i-1][j-1]), sum[i-1][j]) + 1;
                    
                    if(sum[i][j]>result)
                    {
                        result = sum[i][j];
                    }
                }
            }
        }
    
        return result*result;

    }
}