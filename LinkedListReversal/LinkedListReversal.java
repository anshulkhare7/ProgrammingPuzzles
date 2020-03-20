class LinkedListReversal{
    
    public static void main(String[] args) {
        LinkedListReversal linkedListReversal = new LinkedListReversal();
        
        ListNode head = new ListNode(1,null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);
        head.next.next.next.next = new ListNode(5, null);
        head.next.next.next.next.next = new ListNode(6, null);
        head.next.next.next.next.next.next = new ListNode(7, null);
        head.next.next.next.next.next.next.next = new ListNode(8, null);

        linkedListReversal.reverseSublistList(head, 3, 6);
    }

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

    ListNode reverseAllSublistLists(ListNode head, int size){
        return null;
    }

    ListNode reverseSublistList(ListNode head, int start, int end){
        if(head==null)
            return null;            
        
        ListNode current = head;        
        ListNode previous = null;

        int counter = 1;
        while(counter < start){                        
            previous = current;
            if(current.next!=null)
                current = current.next;
            else
                return null;
            counter++;
        }
        
        ListNode lastNodeOfFirstPart = previous;
        ListNode lastNodeOfSublist = current;

        ListNode next = null;
        previous = null;
        counter = 1;
        while(counter <= (end-start)+1){            
            if(current.next!=null){
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
                counter++;
            }else{
                return null;
            }
        }
        
        lastNodeOfSublist.next = current;
        lastNodeOfFirstPart.next = previous;
        
        return head;
    }
}