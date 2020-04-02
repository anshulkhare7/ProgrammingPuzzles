## Proposed Approach

Typically, a sorting algorithm has a time complexity of **O(NlogN)** Since we know that the numbers range from **1 to n**, we can use this fact to optimize our sorting.

We can try placing each number at its correct place, i.e., placing ‘1’ at index ‘0’, placing ‘2’ at index ‘1’, and so on.

### Version 1

1. Iterate on the elements of the array.
2. For each iteration check if the number at current index is at its own place
3. If not, swap the number **arr[i]** with the number at **arr[arr[i]]**
4. Keep repeating step 3 until you get the right number at i.
5. Go to the next iteration.

### Version 2

Same as version 1 except that in step 4, you'd move to next iteration if the number after swap is equal to array length.


## Time Complexity

In the worst case, starting from first index, we will swap n-1 times during our first iteration. After that, all the number will already be at their place so there won't be any swapping for subsequent indexes. So the time complexity would be **O(n-1) + O(n)** i.e., **O(N)**

## Space Complexity

We're doing in-place sorting so no extra space is used. Space complexity would be O(1)

