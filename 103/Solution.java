import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        int current = 1, next = 0;
        boolean order = true;
        ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
        ArrayList<List<TreeNode>> list = new ArrayList<List<TreeNode>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        ArrayList<TreeNode> tempList = new ArrayList<TreeNode>();
        tempList.add(root);
        list.add(tempList);

        if (root == null)
            return answer;

        while (current != 0) {

            ArrayList<TreeNode> currList = new ArrayList<TreeNode>();
            while (current != 0) {
                TreeNode currNode = queue.poll();
                current--;

                if (currNode.left != null) {
                    currList.add(currNode.left);
                    queue.add(currNode.left);
                    next++;
                }
                if (currNode.right != null) {
                    currList.add(currNode.right);
                    queue.add(currNode.right);
                    next++;
                }
            }

            if(!currList.isEmpty()) list.add(currList);
            current = next;
            next = 0;
        }

        for(List<TreeNode> currList : list){
            
            int length = currList.size();
            ArrayList<Integer> ans = new ArrayList<Integer>();

            if(order){
                for(int i = 0; i < length; i++){
                    ans.add(currList.get(i).val);
                }
            }
            else{
                for(; length-- > 0; ){
                    ans.add(currList.get(length).val);
                }
            }

            answer.add(ans);
            order = !order;
        }

        return answer;
    }
}