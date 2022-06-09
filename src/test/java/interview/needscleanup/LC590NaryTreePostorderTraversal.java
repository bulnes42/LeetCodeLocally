package interview.needscleanup;

import interview.nary.Node;

import java.util.ArrayList;
import java.util.List;

public class LC590NaryTreePostorderTraversal {

    public List<Integer> postorder(Node root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> list = new ArrayList<>();
        for (Node child : root.next) {
            list.addAll(postorder(child));
        }

        list.add(root.val);
        return list;
    }
}
