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
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lCount = maxDepth(root.left);
        int rCount = maxDepth(root.right);

        return Math.max(lCount,rCount)+1;
    }
    // int depth(TreeNode root,int lcount,int rcount){
    //     if(root.left!=null){
    //         return depth(root.left,lcount+1,0);
    //     }
    //     if(root.right!=null){
    //         return depth(root.right,0,rcount+1);
    //     }
    //     return lcount <= rcount ? lcount : rcount;
    // }
}