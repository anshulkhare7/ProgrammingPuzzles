## Proposed Approach

1. Sort the intervals on the start time to ensure a.start <= b.start
2. If **a** overlaps **b** (i.e. **b.start <= a.end**), we need to merge them into a new interval **c** such that:<br>
    `c.start = a.start` <br>
    `c.end = max(a.end, b.end)`
3. Keep repeating the above two steps to merge **c** with the next interval if it overlaps with **c**.

## Time Complexity

1. Sorting will be **O(N*LogN)**.
2. In merging step, we'll need to iterate over the list of intervals once. So **O(N)**

So the overall time complexity will be **O(N*logN)**

## Space Complexity

1. Sorting will require space complexity of O(N)
2. The output list will be of order O(N).

So overall space complexity will be O(N)

