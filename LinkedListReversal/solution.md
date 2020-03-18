## Proposed Approach

We will use three temporary pointers — current, next, and previous.

1. Current *(C)* points to head. Next *(N)* and Previous *(P)* point to null.
2. Repeat following steps until *C* is not null.
    - N = C.next
    - C.next = P
    - P = C
    - C = N
3. Return *P*

## Time Complexity

We'll have to step through every node of the list once, so the time complexity is O(N).

## Space Complexity

We only need three temporary pointers irrespective of the length of the list. So the space complexity is constant i.e., O(1)
