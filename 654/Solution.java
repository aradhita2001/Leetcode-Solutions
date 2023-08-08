import java.util.Arrays;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        int n = nums.length;

        if (n == 0)
            return null;
        if (n == 1)
            return new TreeNode(nums[0]);

        int max = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[max])
                max = i;
        }

        int[] left = Arrays.copyOfRange(nums, 0, max);
        int[] right = Arrays.copyOfRange(nums, max + 1, n);

        return new TreeNode(nums[max], constructMaximumBinaryTree(left), constructMaximumBinaryTree(right));
    }
}