/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */
bool sameNodes(struct TreeNode* root, struct TreeNode* subRoot){
    if(root==NULL || subRoot==NULL){
        return (root == NULL && subRoot == NULL);
    }else if(root->val == subRoot->val){
        return sameNodes(root->left, subRoot->left) && sameNodes(root->right, subRoot->right);
    }else{
        return false;
    }
}

bool isSubtree(struct TreeNode* root, struct TreeNode* subRoot){
    if(root == NULL && subRoot != NULL){
        return false; 
    }else if(sameNodes(root,subRoot)){
        return true;
    }else{
        return isSubtree(root->left, subRoot) || isSubtree(root->right, subRoot);
    }
}


