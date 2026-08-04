// Last updated: 04/08/2026, 15:18:19
1class Solution {
2    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
3        if (root == null || root == p || root == q) {
4            return root;
5        }
6
7        TreeNode left = lowestCommonAncestor(root.left, p, q);
8        TreeNode right = lowestCommonAncestor(root.right, p, q);
9
10        if (left != null && right != null) {
11            return root;
12        }
13
14        return left != null ? left : right;        
15    }
16}