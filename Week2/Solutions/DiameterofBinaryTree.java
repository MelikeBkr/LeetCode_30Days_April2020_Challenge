/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
     int soFarMax = 0;
     public int diameterOfBinaryTree(TreeNode root)
    {
        int result = 0;
        if(root==null)
        {
            return 0;
        }

        height(root);

        return soFarMax-1;
    }
    int height(TreeNode node)
    {
        if (node == null)
        {
            return 0;
        }
        
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        soFarMax = Math.max(soFarMax, (leftHeight + rightHeight+1));
        return (1 + Math.max(leftHeight, rightHeight));
    }
}