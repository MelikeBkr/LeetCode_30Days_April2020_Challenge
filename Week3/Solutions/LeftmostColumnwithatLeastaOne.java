/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface BinaryMatrix {
 *     public int get(int x, int y) {}
 *     public List<Integer> dimensions {}
 * };
 */

class Solution {
    public int leftMostColumnWithOne(BinaryMatrix binaryMatrix)
    {

        List<Integer> matrixSize = binaryMatrix.dimensions();
        int n = matrixSize.get(0);
        int m = matrixSize.get(1);
        int result = -1;

        int i = 0;
        int j = m-1;

        while (i < n && j >=0) {
            int p = binaryMatrix.get(i, j);
           
            if (p == 1) {
                result = j;
                j--;
             
            } else {
                i++;
            }

        }
        return result;
    }
}