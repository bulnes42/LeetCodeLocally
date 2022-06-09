package interview.java.exercises;

import interview.java.model.ListNode;

//https://leetcode.com/problems/merge-two-sorted-lists/
public class LC21MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyHead = new ListNode(0); // This is simply a placeholder for convenience
        ListNode tempIterator = dummyHead;
        while (list1 != null && list2 != null) {
            // if list1 node is smaller, add list1 node to returnList and advance list1
            if (list1.val < list2.val) {
                tempIterator.next = list1;
                list1 = list1.next;
            }
            // list2 node is less than or equal to list1 node
            // add list2 node to returnList and advance list2
            else {
                tempIterator.next = list2;
                list2 = list2.next;
            }
            tempIterator = tempIterator.next;
        }

        // Handles edge case where one of the lists is not empty after loop
        // Since lists are already sorted, we can just append the non-empty one to the returnList
        if (list1 != null)
            tempIterator.next = list1;
        else if (list2 != null)
            tempIterator.next = list2;

        return dummyHead.next;
    }
}
