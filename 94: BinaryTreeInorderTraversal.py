# https://leetcode.com/problems/binary-tree-inorder-traversal/
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        arr = []
        if root is not None: 
            arr = self.inorderTraversal(root.left)
            r = self.inorderTraversal(root.right)
            arr.append(root.val)
            arr.extend(r)
        return arr
