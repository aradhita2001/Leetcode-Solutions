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
    public int maxLevelSum(TreeNode root) {
        
        int max = root.val;
        int maxLevel = 1;

        Queue<TreeNode> queue = new LinkedList<TreeNode> ();
        queue.add(root);
        int level = 1;
        int currLevel = 1, nextLevel = 0;

        int sum = 0;

        while(currLevel > 0){

            TreeNode currNode = queue.poll();
            sum += currNode.val;
            currLevel--;
            
            if(currNode.left != null){
                queue.add(currNode.left);
                nextLevel++;
            } 

            if(currNode.right != null){
                queue.add(currNode.right);
                nextLevel++;
            } 

            if(currLevel == 0){
                
                currLevel = nextLevel;
                nextLevel = 0;
                
                System.out.println(level + " " + sum);

                if(sum > max){
                    max = sum;
                    maxLevel = level;
                }
                level++;
                sum = 0;
            }
        }


        return maxLevel;
    }
}