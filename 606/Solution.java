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
    public String tree2str(TreeNode root) {
        
        if(root == null) return "";

        String ans = root.val + "";

        if(root.left == null && root.right == null) return ans;

        ans += "(" + tree2str(root.left) + ")";
        if(root.right != null) ans += "(" + tree2str(root.right) + ")";

        return ans;
    }
}