## Proposed Approach

To traverse the binary tree level wise, we'll use the Breadth First Search (BFS) technique.

To do that, we will maintain a Queue to track the nodes of a level. When we're processing a level, we can do all sorts of operations like keeping track of the max value, calculating the average, creating an array of nodes at that level, etc.

1. Initialize the Queue with the root element.
2. Start a while loop until the Queue is empty.
3. At the beginning of the iteration, take note of the size of the queue `levelsize`. This tells us the number of nodes at that level.
4. In an inner loop, which runs from `0` to `levelsize`, remove elements from Queue.
5. For each element, take the children and add them the Queue. Add their values in a subarray (or update max value, or update average etc.).

## Time Complexity

As we traverse the array level wise, each node will be visited once. Hence, the time complexity will be O(N) where N is the total number of nodes in the binary tree.

## Space Complexity

The maximum nodes the Queue will is the maximum number of nodes any any level which would be ~ N/2. Hence the space complexity would be O(N/2)