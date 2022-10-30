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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth == 1){
            TreeNode newNode = new TreeNode(val, root, null);
            return newNode;
        }

        Queue<TreeNode> nodes = new LinkedList<TreeNode>();
        int currLevel = 1, nextLevel = 0, currDepth = 1;
        nodes.add(root);

        while(currLevel != 0){

            TreeNode currNode = nodes.poll();
            currLevel--;
            System.out.println(currNode.val);

            if(currDepth == depth - 1){
                currNode.left = new TreeNode(val, currNode.left, null);
                currNode.right = new TreeNode(val, null, currNode.right);
            }

            if(currNode.left != null){
                nodes.add(currNode.left);
                nextLevel++;
            }
            if(currNode.right != null){
                nodes.add(currNode.right);
                nextLevel++;
            }

            if(currLevel == 0){
                currLevel = nextLevel;
                nextLevel = 0;
                currDepth++;
                if(currDepth == depth) break;
            }
            
        }

        return root;
    }
}