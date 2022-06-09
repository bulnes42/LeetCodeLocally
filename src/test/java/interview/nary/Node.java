package interview.nary;

import java.util.List;

public class Node {
    public int val;
    public List<Node> next;

    public Node() {
    }

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> next) {
        this.val = val;
        this.next = next;
    }
}

