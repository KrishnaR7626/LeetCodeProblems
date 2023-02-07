/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
int maxDepth(struct TreeNode* root){
    if(root == NULL){
        return 0;
    }else{
        int left = maxDepth(root->left);
        int right = maxDepth(root->right);
        if(right>left){
            return 1+right;
        }else{
            return 1+left;
        }
    }
}
