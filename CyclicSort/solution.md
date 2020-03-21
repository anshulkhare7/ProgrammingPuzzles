## Proposed Approach

Typically, a sorting algorithm has a time complexity of **O(NlogN)** Since we know that the numbers range from **1 to n**, we can use this fact to optimize our sorting.

We can try placing each number at its correct place, i.e., placing ‘1’ at index ‘0’, placing ‘2’ at index ‘1’, and so on.

## Time Complexity

Since we have to traverse the array only once, the time complexity would be **O(N)**

## Space Complexity

We're doing in-place sorting so no extra space is used. Space complexity would be O(1)

