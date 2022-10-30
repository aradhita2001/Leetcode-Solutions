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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        ArrayList<List<Integer>> ans = new ArrayList<List<Integer>>();

        if(root == null) return ans;

        ArrayList<Integer> currAns = new ArrayList<Integer>();
        int currTarget = targetSum - root.val;
        currAns.add(root.val);

        if(root.left == null && root.right == null && currTarget == 0){
            ans.add(currAns);
        }

        List<List<Integer>> leftAns = pathSum(root.left, currTarget);
        List<List<Integer>> rightAns = pathSum(root.right, currTarget);
        
        if(leftAns != null) {
            for(List<Integer> currList : leftAns){
                List<Integer> curr = new ArrayList<Integer>(currAns);
                curr.addAll(currList);
                ans.add(curr);
            }
        }

        if(rightAns != null) {
            for(List<Integer> currList : rightAns){
                List<Integer> curr = new ArrayList<Integer>(currAns);
                curr.addAll(currList);
                ans.add(curr);
            }
        }

        return ans;
    }
}