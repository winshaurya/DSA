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
    int t = 0;

    Set<TreeNode> h = new HashSet<>();

    public int minCameraCover(TreeNode root) {
        if (root == null) return 1;
        h.add(null);
        dfs(root, null);
        return t;
    }

    void dfs(TreeNode r , TreeNode b) {
        if (r == null) return;
        
        dfs(r.left,r);
        dfs(r.right,r);

        if (b==null&& !h.contains(r)||!h.contains(r.left)||!h.contains(r.right)){
            t++;
            h.add(r);
            h.add(b);
            h.add(r.left);
            h.add(r.right);


        }
    }

    
}
