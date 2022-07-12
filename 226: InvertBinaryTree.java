https://leetcode.com/problems/invert-binary-tree/submissions/
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        if(root.left == null){
            root.left = null;
        }
        if(root.right == null){
            root.right = null;
        }
        TreeNode node = root.left;
        root.left = root.right;
        root.right = node;
        this.invertTree(root.left);
        this.invertTree(root.right);
        return root;
    }
}
