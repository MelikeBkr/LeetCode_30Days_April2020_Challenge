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
    public boolean isValidSequence(TreeNode root, int[] arr)
    {
        if(root==null)
        {
            return arr.length==0;
        }

        return isValidSeqHelper(root, arr,0);
    }
    public boolean isValidSeqHelper(TreeNode root, int[] arr, int index)
    {
        if(root==null)
        {
            return arr.length==0;
        }

        if((root.left==null && root.right==null) && (root.val==arr[index]
                && root.val==arr[arr.length-1]))
        {
            return true;
        }

        return (index<arr.length-1 && (root.val==arr[index] &&
                (isValidSeqHelper(root.left,arr,index+1) ||
                        isValidSeqHelper(root.right, arr, index+1))));
    }
}