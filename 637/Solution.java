import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
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
    public List<Double> averageOfLevels(TreeNode root) {
        
        ArrayList<Double> ans = new ArrayList<Double>();

        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        int currLength = 1;
        int nextLength = 0;

        while(currLength != 0){
            
            Double sum = 0.0;

            for(int i = 0; i < currLength; i++){

                TreeNode curr = queue.remove();
                sum += curr.val;

                if(curr.left!= null){
                    queue.add(curr.left);
                    nextLength++;
                }
                if(curr.right != null){
                    queue.add(curr.right);
                    nextLength++;
                }
            }

            ans.add((Double)sum / currLength);

            currLength = nextLength;
            nextLength = 0;
        }

        return ans;
    }
}

class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
     }