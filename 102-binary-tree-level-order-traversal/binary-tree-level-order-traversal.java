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
    public List<List<Integer>> levelOrder(TreeNode root) {
    List <List < Integer>> l = new ArrayList<>();

        LO(root, 0 , l);
        return l;
        
    }
    void LO(TreeNode t , int lvl , List<List<Integer>> l ){
    if (t == null ) return ;
    List <Integer> newList = new ArrayList<>();
    newList.add(t.val);
    if (l.size() > lvl){
        l.get(lvl).addAll(newList);

    }else {
        l.add( lvl , newList);
    }
    LO(t.left , lvl+1,l );
    LO(t.right , lvl+1,  l );
    return ;
    }
}