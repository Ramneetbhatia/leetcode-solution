class Solution {
    public ListNode swapPairs(ListNode head) {
        
        // dummy node to simplify edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        
        while(prev.next != null && prev.next.next != null){
            
            ListNode first = prev.next;
            ListNode second = prev.next.next;
            
            // swapping
            first.next = second.next;
            second.next = first;
            prev.next = second;
            
            // move prev to next pair
            prev = first;
        }
        
        return dummy.next;
    }
}