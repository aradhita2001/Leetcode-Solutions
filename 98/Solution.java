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
    public boolean isValidBST(TreeNode root) {
        
        Queue<TreeNode> nodes = new LinkedList<TreeNode> ();
        List<Integer> list = new ArrayList<Integer>();
        
        nodes.add(root);
        list.add(root.val);
        
        while(nodes.peek() != null){
            TreeNode curr = nodes.remove();
            int index = list.indexOf(curr.val);
            
            if(curr.left != null){
                
                //System.out.println(list + "   "  + curr.left.val + "  " + (index - 1) + " " + (index));
                if(curr.left.val >= list.get(index)) return false;
                if((index != 0) && curr.left.val <= list.get(index - 1)) return false;
                nodes.add(curr.left);
                list.add(index, curr.left.val);
            }
            
            index = list.indexOf(curr.val);
            
            if(curr.right != null){
                if(curr.right.val <= list.get(index)) return false;
                if((index != list.size() - 1) && curr.right.val >= list.get(index + 1)) return false;
                nodes.add(curr.right);
                list.add(index + 1, curr.right.val);
            }
            
            //list.add(curr.val);
            
        }
        return true;
        
    }
}

class TreeNode {
         TreeNode left;
         int val;
         TreeNode right;
         TreeNode() {}
         TreeNode(int val) { this.val = val; }
         TreeNode(int val, TreeNode left, TreeNode right) {
             this.val = val;
             this.left = left;
             this.right = right;
         }
    }