import java.util.*;

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        // Min heap based on node value
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val
        );
        
        // Step 1: Add first node of each list
        for (ListNode node : lists) {
            if (node != null) {
                pq.add(node);
            }
        }
        
        // Dummy node for result list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        
        // Step 2: Process heap
        while (!pq.isEmpty()) {
            ListNode minNode = pq.poll(); // smallest node
            
            current.next = minNode;
            current = current.next;
            
            // Add next node of that list
            if (minNode.next != null) {
                pq.add(minNode.next);
            }
        }
        
        return dummy.next;
    }
}