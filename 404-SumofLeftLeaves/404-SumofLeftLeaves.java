// Last updated: 04/08/2026, 10:30:35
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
17    public int sumOfLeftLeaves(TreeNode root) {
18        if (root == null) {
19            return 0;
20        }
21        
22        Queue<Pair<TreeNode, Boolean>> queue = new LinkedList<>();
23        queue.offer(new Pair<>(root, false));  // (node, is_left)
24        int totalSum = 0;
25        
26        while (!queue.isEmpty()) {
27            Pair<TreeNode, Boolean> pair = queue.poll();
28            TreeNode node = pair.getKey();
29            boolean isLeft = pair.getValue();
30            
31            if (isLeft && node.left == null && node.right == null) {
32                totalSum += node.val;
33            }
34            
35            if (node.left != null) {
36                queue.offer(new Pair<>(node.left, true));
37            }
38            if (node.right != null) {
39                queue.offer(new Pair<>(node.right, false));
40            }
41        }
42        
43        return totalSum;
44    }
45}