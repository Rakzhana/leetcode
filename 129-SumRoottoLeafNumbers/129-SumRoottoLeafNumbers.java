// Last updated: 24/07/2026, 09:55:08
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int sum = 0;
18
19    public int sumNumbers(TreeNode root) {
20        helper(root, 0);
21        return sum;
22    }
23
24    void helper(TreeNode node, int path) {
25        if (node == null) return;
26        path = path * 10 + node.val;
27        if (node.left == null && node.right == null) {
28            sum += path;
29        }
30        helper(node.left, path);
31        helper(node.right, path);
32    }
33}