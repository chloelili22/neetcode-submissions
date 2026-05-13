/*
DFS(Depth - First Search): a traversal or search algorithm used for traversing or searching tree or graph data structures.
can be implemented using both recursion and an explicit stack.

Pre-order Traversal: Process the root, then recursively process the left subtree and right subtree.
In-order Traversal: Recursively process the left subtree, then process the root, and finally the right subtree.
Post-order Traversal: Recursively process the left subtree, then the right subtree, and finally the root.
*/

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
    public TreeNode invertTree(TreeNode root) {
        //base case: if the tree is empty, return null
        if(root == null){
            return null;
        }

        // swap the left and right subtree
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        // Recursively invert the left and right subtrees
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
