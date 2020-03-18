class LinkedListReversal{
    
    ListNode reverseList(ListNode head){
        if(head==null)
            return null;
        
        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        return previous;
    }

    ListNode reverseSublistList(ListNode head, int start, int end){
        return null;
    }
}