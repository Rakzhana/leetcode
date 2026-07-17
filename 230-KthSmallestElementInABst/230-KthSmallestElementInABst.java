// Last updated: 17/07/2026, 15:11:30
class Solution {
    private int count;
    private int answer;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inorder(root);
        return answer;
    }
    private void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        count--;
        if (count == 0) {
            answer = node.val;
            return;
        }
        inorder(node.right);
    }
}