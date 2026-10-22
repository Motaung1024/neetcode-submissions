/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */

class Solution {
public:
    int maxDepth(TreeNode* root) {
        int level = 0;
        int max = 0;
        int* plevel = &level;
        int* pmax = &max;

        // Helper function
        findDepth(root, plevel, pmax);

        std::cout << max << endl;

        return max;

    }

    void findDepth(TreeNode* curr, int* level, int* max)    {

        if (curr == nullptr)    {
            return;
        }

        ++(*level);

        if (*level >= *max) {
            *max = *level;
        }

        findDepth(curr->left, level, max); //
        findDepth(curr->right, level, max);

        --(*level);

    }
};
