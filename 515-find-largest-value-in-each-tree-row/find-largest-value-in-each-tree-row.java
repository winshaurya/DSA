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
    List<List<Integer>> l = new ArrayList<>();

    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        fill(root, 0);
        for (int i = 0; i < l.size(); i++) {
            int m = Integer.MIN_VALUE;
            for (Integer j : l.get(i)) {
                m = Math.max(j, m);
            }
             ans.add(m);
        }
        return ans;
    }

    void fill(TreeNode t, int h) {
        if (t == null) return;
        List<Integer> a = new ArrayList<>();
        a.add(t.val);
        if (l.size() <= h) {
            l.add(h, a);
        } else {
            l.get(h).addAll(a);
        }

        fill(t.left, h + 1);
        fill(t.right, h + 1);
        return;
    }
}
