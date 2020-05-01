/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int maxSoFar = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root)
    {
        maxPathSumHelper(root,0,0);
        return maxSoFar;
    }

    public int maxPathSumHelper(TreeNode root, int leftVal, int rightVal)
    {
        int maxCurrent = Integer.MIN_VALUE;
        if (root == null)
        {
            return 0;
        }
        
        leftVal = maxPathSumHelper(root.left, leftVal, rightVal);
        rightVal = maxPathSumHelper(root.right, leftVal, rightVal);
        
        maxCurrent = root.val + leftVal + rightVal;
        
        if(maxSoFar<= maxCurrent)
        {
            maxSoFar = maxCurrent;
        }
        
        maxCurrent = Math.max(Math.max(leftVal+ root.val, rightVal+root.val), root.val);

        if(maxSoFar<= maxCurrent)
        {
            maxSoFar = maxCurrent;
        }
        
        return maxCurrent;
    }
}