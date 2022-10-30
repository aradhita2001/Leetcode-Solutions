import java.util.LinkedList;
import java.util.Queue;

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
    public TreeNode pruneTree(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(hasOne(root))queue.add(root);
        else return null;
        
        while(queue.peek() != null){
            TreeNode curr = queue.remove();
            
            if(curr.left != null && hasOne(curr.left))queue.add(curr.left);
            else curr.left = null;
            
            if(curr.right != null && hasOne(curr.right))queue.add(curr.right);
            else curr.right = null;
        }
        
        return root;
    }
    
    public Boolean hasOne(TreeNode root){
        
        if(root == null) return false;
        
        if(root.val == 1) return true;
        
        if(root.left == null && root.right == null)return false;
        
        return hasOne(root.left)||hasOne(root.right);
        
        
    }
}