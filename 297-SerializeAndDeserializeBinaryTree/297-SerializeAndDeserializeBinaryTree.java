// Last updated: 17/07/2026, 15:11:14
public class Codec {
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        dfsSerialize(root, sb);
        return sb.toString();
    }
    private void dfsSerialize(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append("null,");
            return;
        }
        sb.append(node.val).append(",");
        dfsSerialize(node.left, sb);
        dfsSerialize(node.right, sb);
    }
    public TreeNode deserialize(String data) {
        Queue<String> queue =
                new LinkedList<>(Arrays.asList(data.split(",")));

        return dfsDeserialize(queue);
    }
    private TreeNode dfsDeserialize(Queue<String> queue) {
        String val = queue.poll();

        if (val.equals("null")) {
            return null;
        }
        TreeNode root = new TreeNode(Integer.parseInt(val));
        root.left = dfsDeserialize(queue);
        root.right = dfsDeserialize(queue);
        return root;
    }
}