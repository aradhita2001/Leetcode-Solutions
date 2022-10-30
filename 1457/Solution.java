import java.util.HashMap;
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
    public int pseudoPalindromicPaths (TreeNode root) {
        
        int ans = 0;

        Stack<TreeNode> nodes = new Stack<TreeNode>();
        Stack<HashMap<Integer, Integer>> values = new Stack<HashMap<Integer, Integer>>();

        if(root != null){
            nodes.push(root);
            HashMap<Integer, Integer> curr = new HashMap<Integer, Integer>();
            curr.put(root.val, 1);
            values.push(curr);            
        }

        while(nodes.isEmpty() == false){
            TreeNode currNode = nodes.pop();
            HashMap<Integer, Integer> currMap = values.pop();

            if(currNode.left != null){
                nodes.push(currNode.left);
                HashMap<Integer, Integer> newMap = new HashMap<>(currMap);
                int currval = currNode.left.val;
                newMap.put(currval, newMap.getOrDefault(currval, 0) + 1);
                values.push(newMap);
            }

            if(currNode.right != null){
                nodes.push(currNode.right);
                HashMap<Integer, Integer> newMap = new HashMap<>(currMap);
                int currval = currNode.right.val;
                newMap.put(currval, newMap.getOrDefault(currval, 0) + 1);
                values.push(newMap);
            }

            if(currNode.left == null && currNode.right == null){
                int total = 0;
                boolean odd = false, possible = true;

                for(int val : currMap.values()){
                    total = total + val;
                    if(val % 2 == 1 && odd) {
                        possible = false;
                        break;
                    }
                    if(val % 2 == 1 && !odd) odd = true;
                    
                }

                if(!possible) continue;
                if(total % 2 == 0 && !odd) ans++;
                if(total % 2 == 1 && odd) ans++;

            }
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