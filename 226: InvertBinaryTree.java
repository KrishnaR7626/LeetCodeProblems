// https://leetcode.com/problems/invert-binary-tree/submissions/
class Solution {
    public TreeNode invertTree(TreeNode root) {
//         checks if current node is null
        if(root == null){
            return null;
        }
//          copies the left node into a temporary object 
        TreeNode node = root.left;
//         puts right node in left
        root.left = root.right;
//         puts the left node copy in right node
        root.right = node;
//         recursively calls the inversion on the child nodes.
        this.invertTree(root.left);
        this.invertTree(root.right);
//         returns the root node
        return root;
    }
}
