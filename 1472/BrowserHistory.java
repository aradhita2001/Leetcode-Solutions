import java.util.LinkedList;

class BrowserHistory {

    Node head;
    Node tail;
    Node curr;

    public BrowserHistory(String homepage) {

        head = tail = curr = new Node(homepage);

    }

    public void visit(String url) {

        if (curr.next != null)
            curr.next.prev = null;

        curr.next = new Node(url);
        curr.next.prev = curr;
        curr = curr.next;
        tail = curr;

    }

    public String back(int steps) {

        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }

        return curr.val;

    }

    public String forward(int steps) {

        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }

        return curr.val;

    }
}

/**
 * Node
 */
class Node {

    String val;
    Node prev;
    Node next;

    public Node(String s) {
        this.val = s;
    }

}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */