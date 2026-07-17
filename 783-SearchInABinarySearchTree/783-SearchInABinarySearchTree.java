// Last updated: 17/07/2026, 15:10:23
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root!=null)
        {
            if(root.val==val)
            return root;
        else if(val<root.val)
        {
            root=root.left;
        }
        else{
            root=root.right;
        }
        
    }
    return null;
}
}