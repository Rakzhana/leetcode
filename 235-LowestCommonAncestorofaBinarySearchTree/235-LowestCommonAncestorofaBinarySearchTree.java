// Last updated: 04/08/2026, 09:16:49
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
17
18    // Stores all root-to-leaf paths
19    public List<String> result = new ArrayList<>();
20
21    public List<String> binaryTreePaths(TreeNode root) {
22        helperFunc(new StringBuilder(), root);
23        return result;
24    }
25
26    private void helperFunc(StringBuilder path, TreeNode root) {
27
28        // Base case
29        if (root == null) {
30            return;
31        }
32
33        // Save the current length for backtracking
34        int len = path.length();
35
36        // Append separator if this is not the first node
37        if (len != 0) {
38            path.append("->");
39        }
40
41        // Append the current node's value
42        path.append(root.val);
43
44        // If it's a leaf node, store the path
45        if (root.left == null && root.right == null) {
46            result.add(path.toString());
47        } else {
48            // Explore left and right subtrees
49            helperFunc(path, root.left);
50            helperFunc(path, root.right);
51        }
52
53        // Backtrack to restore the previous path
54        path.setLength(len);
55    }
56}