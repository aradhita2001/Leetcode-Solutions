import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {

        if(root == null) return new ArrayList<List<Integer>>();
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        Queue<Node> queue = new LinkedList<Node>();
        queue.add(root);
        int level = 1;
        int nextLevel = 0;

        while(level != 0){
            List<Integer> curr = new ArrayList<Integer>();

            for(int i = 0; i < level; i++){
                
                Node currNode = queue.remove();
                curr.add(currNode.val);
                if(currNode.children != null){
                    for(int j = 0; j < currNode.children.size(); j++){
                        queue.add(currNode.children.get(j));
                        nextLevel++;
                    }
                }
            }

            ans.add(curr);
            level = nextLevel;
            nextLevel = 0;
        }
        
        return ans;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};