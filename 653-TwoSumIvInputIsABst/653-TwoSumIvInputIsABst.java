// Last updated: 17/07/2026, 15:10:30
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

    public boolean findTarget(TreeNode root, int k) {
        return dfs(root, root, k);
    }

    private boolean dfs(TreeNode root, TreeNode node, int k) {
        if (node == null) {
            return false;
        }

        if (search(root, node, k - node.val)) {
            return true;
        }

        return dfs(root, node.left, k) ||
               dfs(root, node.right, k);
    }

    private boolean search(TreeNode root, TreeNode skip, int target) {
        if (root == null) return false;

        if (root.val == target && root != skip) {
            return true;
        }

        if (target < root.val) {
            return search(root.left, skip, target);
        } else {
            return search(root.right, skip, target);
        }
    }
}