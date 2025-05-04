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
        if(root==null)return 0;
        if(root.left==null && root.right==null)return 1;
        int lh=0;
        if(root.left!=null){
            lh=maxDepth(root.left);
        }
        int rh=0;
        if(root.right!=null){
            rh=maxDepth(root.right);
        }
        // if(rh>lh){
        //     return rh+1;
        // }
        // else{
        //     return lh+1;
        // }
        return 1+Math.max(lh,rh);
    }
}