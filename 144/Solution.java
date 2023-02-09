import java.util.ArrayList;
import java.util.List;

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
        
        ArrayList<Integer> answer = new ArrayList<>();

        if(root == null) return answer;
        answer.add(root.val);
        if(root.left != null) answer.addAll(preorderTraversal(root.left));
        if(root.right != null) answer.addAll(preorderTraversal(root.right));

        return answer;
     }
}