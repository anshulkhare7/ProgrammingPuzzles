import java.util.*;

class LinkedListReversalTest{

    public static void main(String[] args) {
        
        LinkedListReversalTest linkedListReversalTest = new LinkedListReversalTest();        
        linkedListReversalTest.testReverseList();

    }

    boolean isListSame(ListNode l1, ListNode l2){
        if(l1==null || l2==null){
            return false;
        }

        while(l1!=null && l2!=null){
            if(l1.val != l2.val)
                return false;
            
            if(l1==null)
                return false;
            
            if(l2==null)
                return false;

            l1 = l1.next;
            l2 = l2.next;
        }

        return true;
    }

    void testReverseList(){
        LinkedListReversal linkedListReversal = new LinkedListReversal();
        
        ListNode head = new ListNode(1,null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);
        head.next.next.next.next = new ListNode(6, null);
        
        List<Integer> expectedList = new ArrayList<>();
        ListNode expectedHead = head;
        while(expectedHead!=null){
            expectedList.add(expectedHead.val);
            expectedHead = expectedHead.next;
        }
        Collections.reverse(expectedList);
        
        ListNode actual = linkedListReversal.reverseList(head);
                
        List<Integer> actualList = new ArrayList<>();
        while(actual!=null){
            actualList.add(actual.val);
            actual = actual.next;
        }

        if(actualList.equals(expectedList)){
            System.out.println("Test Case testReverseList Passed.");        
        }else{
            System.out.println("Test Case testReverseList FAILED. Expected: "+expectedList.toString()+" Actual: "+actualList.toString()); 
        }
        
    }
}