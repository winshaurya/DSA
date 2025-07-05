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

    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        return (Math.abs(height(root.left) - height(root.right)) <= 1) && isBalanced(root.right) && isBalanced(root.left);
    }

    public int height(TreeNode t) {
        if (t == null) return 0;
        if (t.left == null && t.right == null) {
            return 1;
        } else return Math.max(height(t.left), height(t.right)) + 1;
    }
}
