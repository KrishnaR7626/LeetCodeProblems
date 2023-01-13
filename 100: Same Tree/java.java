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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean right = false;
        boolean left = false;
        if(p == null && q != null || p != null && q == null){
            return false;
        }else if(p == null && q == null){
            return true;
        }
        if(p.left != null && q.left!= null){
            left = isSameTree(p.left, q.left);
        }else if(p.left == null && q.left== null){
            left = true;
        }else{
            return false;
        }
        if(p.right != null && q.right!= null){
            right = isSameTree(p.right, q.right);
        }else if(p.right == null && q.right== null){
            right = true;
        }else{
            return false;
        }
        return p.val == q.val && left && right;
    }
}
