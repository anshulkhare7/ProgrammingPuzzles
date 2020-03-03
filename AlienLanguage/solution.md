## Proposed Approach

We can always compare two adjacent words given in the input list to determine the ordering of the characters. So, for the given input `["pq", "pr", "qr", "rqp"]`, if we take the first two words and find the first character that is different in both words: it would be **q** from **pq** and **r** from **pr**.

So we can generate a list of pairs **[u,v]** such that **u < v** (lexicographically). This will represent the edges of a graph.

Now, We will use topological sort for this graph to come up with an ordering.

A topological ordering of a directed graph is a linear ordering of its vertices such that for every directed edge **UV** from vertex **U** to vertex **V**, **U** comes before **V** in the ordering.

Consider the graph below.

![alt Graph](https://upload.wikimedia.org/wikipedia/commons/thumb/0/03/Directed_acyclic_graph_2.svg/180px-Directed_acyclic_graph_2.svg.png)

The edges of the graph are: `[5,11] [11,2] [7,11] [7,8] [8,9] [3,8] [3,10] [11,9] [11,10]`

The graph has many valid topological sorts, including:

- 5, 7, 3, 11, 8, 2, 9, 10 (visual left-to-right, top-to-bottom)
- 3, 5, 7, 8, 11, 2, 9, 10 (smallest-numbered available vertex first)
- 5, 7, 3, 8, 11, 10, 9, 2 (fewest edges first)
- 7, 5, 11, 3, 10, 8, 9, 2 (largest-numbered available vertex first)
- 5, 7, 11, 2, 3, 8, 9, 10 (attempting top-to-bottom, left-to-right)
- 3, 7, 8, 5, 11, 10, 2, 9 (arbitrary)

In a graph, a **Source** is a node which has no incoming edges and only outgoing edges. A **Sink** is a node which has only incoming edges and no outgoing edges. So, in the graph shown above, nodes 5, 7, and 3 are Source nodes. And nodes 2, 9, and 10 are Sink node. 

Now, it's easy to see that a topological ordering begins from one of the Sources and ends at one of the Sinks.

>Note: A graph has a cycle if some vertices have cyclical dependencies. Which means it's impossible to find a linear ordering of vertices. So a topological sort is only possible in a Directed Acyclic Graph (**DAG**)

1. The first step is to represent the graph in form of an **Adjacency List** which is nothing but a HashMap where the *key* will be parent vertex and the *value* will be a list containing children vertices.

2. The second step is to find all the nodes which are *sources*. To do this, we will maintain a HashMap which contains the count of in-degrees i.e, number of incoming edges to that vertex. The vertices which have 0 in-degree will be sources.

3. Next step is to build the graph and populate the in-degrees HashMap.

4. All vertices with ‘0’ in-degrees will be our sources and we will store them in a Queue.

5. Pop from this source Queue, and do the following:
    - Add it to the sorted list.
    - Get all of its children from the graph.
    - Decrement the in-degree of each child by 1.
    - If a child’s in-degree becomes ‘0’, add it to the sources Queue.
    - Repeat step 1, until the source Queue is empty.

## Time Complexity

## Space Complexity