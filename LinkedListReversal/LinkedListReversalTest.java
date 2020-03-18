import java.util.*;

class LinkedListReversalTest{

    public static void main(String[] args) {
        
        LinkedListReversalTest linkedListReversalTest = new LinkedListReversalTest();        
        linkedListReversalTest.testReverseList();

    }

    void testReverseList(){
        LinkedListReversal linkedListReversal = new LinkedListReversal();
        
        ListNode head = new ListNode(1,null);
        head.next = new ListNode(2, null);
        head.next.next = new ListNode(3, null);
        head.next.next.next = new ListNode(4, null);
        head.next.next.next.next = new ListNode(5, null);

        List<Integer> expectedList = new ArrayList<>();
        while(head!=null){
            expectedList.add(head.val);
            head = head.next;
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