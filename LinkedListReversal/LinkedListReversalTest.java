import java.util.*;

class LinkedListReversalTest{

    public static void main(String[] args) {
        
        LinkedListReversalTest linkedListReversalTest = new LinkedListReversalTest();        
        linkedListReversalTest.testReverseList();
        linkedListReversalTest.testReverseSublistList();
    }    

    void testReverseSublistList(){
        LinkedListReversal linkedListReversal = new LinkedListReversal();

        List<Integer> expectedList = new ArrayList<>();

        ListNode head = new ListNode(1,null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);
        head.next.next.next.next = new ListNode(5, null);
        head.next.next.next.next.next = new ListNode(6, null);
        head.next.next.next.next.next.next = new ListNode(7, null);
        head.next.next.next.next.next.next.next = new ListNode(8, null);

        expectedList.add(1);
        expectedList.add(2);
        expectedList.add(6);
        expectedList.add(5);
        expectedList.add(4);
        expectedList.add(3);
        expectedList.add(7);
        expectedList.add(8);

        List<Integer> actualList = new ArrayList<>();
        ListNode actual = linkedListReversal.reverseSublistList(head, 3, 6);        
        while(actual!=null){
            actualList.add(actual.val);
            actual = actual.next;
        }

        if(actualList.equals(expectedList)){
            System.out.println("Test Case testReverseSublistList Passed.");        
        }else{
            System.out.println("Test Case testReverseSublistList FAILED. Expected: "+expectedList.toString()+" Actual: "+actualList.toString()); 
        }
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