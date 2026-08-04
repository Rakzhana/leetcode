// Last updated: 04/08/2026, 09:15:33
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        int small = Math.min(p.val, q.val);
4        int large = Math.max(p.val, q.val);
5        while (root != null) {
6            if (root.val > large) // p, q belong to the left subtree
7                root = root.left;
8            else if (root.val < small) // p, q belong to the right subtree
9                root = root.right;
10            else // Now, small <= root.val <= large -> This root is the LCA between p and q
11                return root;
12        }
13        return null;
14    }
15}