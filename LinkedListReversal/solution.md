## Proposed Approach

We will use three temporary pointers — current, next, and previous.

1. Current *(C)* points to head. Next *(N)* and Previous *(P)* point to null.
2. Repeat following steps until *C* is not null.
    - N = C.next
    - C.next = P
    - P = C
    - C = N
3. Return *P*

For the version 2 of this problem, where we need to reverse a sublist *(from position a to b)*, here are the steps —

1. First, skip *a-1* nodes to reach node *a*.
2. Remember the *a-1* node.
3. Reverse the nodes from *a* to *b* 
4. Connect *a-1* node and *b+1* node to the reversed list

## Time Complexity

We'll have to step through every node of the list once, so the time complexity is O(N).

## Space Complexity

We only need three temporary pointers irrespective of the length of the list. So the space complexity is constant i.e., O(1)
