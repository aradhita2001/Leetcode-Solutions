import java.util.ArrayList;

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

    ArrayList<Integer> nums = new ArrayList<Integer>();

    public int getMinimumDifference(TreeNode root) {
        
        loadNums(root);

        nums.sort(null);

        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.size() - 1; i++){
            min = Math.min(min, nums.get(i+1) - nums.get(i));
        }

        return min;
    }

    void loadNums (TreeNode root){
        nums.add(root.val);
        if(root.left != null) loadNums(root.left);
        if(root.right!= null) loadNums(root.right);
    }
}