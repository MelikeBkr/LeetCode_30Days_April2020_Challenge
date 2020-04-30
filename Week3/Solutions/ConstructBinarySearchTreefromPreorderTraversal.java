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
    int index = 0;
  public TreeNode bstFromPreorder(int[] preorder)
    {
        int maxBound = Integer.MAX_VALUE;
        return  bstFromPreorder(preorder, maxBound);
    }

    public TreeNode bstFromPreorder(int[] preorder, int maxBound)
    {
        if(index >= preorder.length || preorder[index] > maxBound)
        {
            return null;
        }
        TreeNode node = new TreeNode(preorder[index]);
        index++;
        node.left = bstFromPreorder(preorder,node.val);
        node.right = bstFromPreorder(preorder, maxBound);

        return node;
    }

}