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
public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> nm=new ArrayList<>();
    if(root==null)
        return nm;
    Stack<TreeNode> kk=new Stack<>();
    kk.push(root);
    while(!(kk.isEmpty()))
    {
        root=kk.pop();
        nm.add(root.val);
        if(root.right!=null)
            kk.push(root.right);
        if(root.left!=null)
            kk.push(root.left);
    }
    return nm;

}
}