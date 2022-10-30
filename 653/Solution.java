import java.util.HashSet;
import java.util.Stack;

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
    public boolean findTarget(TreeNode root, int k) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        
       

        do{
            TreeNode currNode = stack.pop();
            int currVal = currNode.val;

            if(currNode.left != null) stack.push(currNode.left);
            if(currNode.right != null) stack.push(currNode.right);

            if(set.contains(currVal)) return true;

            set.add(k - currVal);
            
        }while(!stack.empty());

        return false;
    }
}