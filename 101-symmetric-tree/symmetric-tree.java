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
    public boolean isSame(TreeNode a, TreeNode b){
        if (a==null && b==null)return true;
        if (a==null && b!=null)return false;
        if (a!=null && b==null)return false;
        return isSame(a.left, b.right )&& isSame(a.right, b.left)&& a.val==b.val;

    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true ;
        return isSame(root.left , root.right);
    }

}