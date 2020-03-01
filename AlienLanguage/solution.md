We will use topological sort to solve this problem.

A topological ordering of a directed graph is a linear ordering of its vertices such that for every directed edge **UV** from vertex **U** to vertex **V**, **U** comes before **V** in the ordering.

Consider the graph below.

![alt Graph](https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Directed_acyclic_graph_2.svg/180px-Directed_acyclic_graph_2.svg.png)

The edges of the graph are: `[5,11] [11,2] [7.11] [7,8] [8,9] [3,8] [3,10] [11,9] [11,10]`

The graph has many valid topological sorts, including:

- 5, 7, 3, 11, 8, 2, 9, 10 (visual left-to-right, top-to-bottom)
- 3, 5, 7, 8, 11, 2, 9, 10 (smallest-numbered available vertex first)
- 5, 7, 3, 8, 11, 10, 9, 2 (fewest edges first)
- 7, 5, 11, 3, 10, 8, 9, 2 (largest-numbered available vertex first)
- 5, 7, 11, 2, 3, 8, 9, 10 (attempting top-to-bottom, left-to-right)
- 3, 7, 8, 5, 11, 10, 2, 9 (arbitrary)