# Alien Language — Problem Statement

There's an alien language which contains the same characters as the English language, i.e. from **a** to **z**. However, we don’t know the ordering of the characters in this language. You're given a dictionary from this language i.e, a sequence of words which are lexicographically sorted. 

#### Find the correct order of characters in the alien language.

## Example 1: 

Input: 
>["pq", "pr", "qr", "rqp"]

Output: 
>pqr

Since the words are sorted lexicographically, we can infer the following ordering:
 
- From "pq" and "pr", we can conclude that 'q' comes before 'r'.
- From "pr" and "qr", we can conclude that 'p' comes before 'q'
 
Combining above two statements, we can conclude that the correct character order is: *"pqr"*

## Example 2:

Input: 
>["xyz", "yyy", "yyz"]

Output: 
>xyz

Pairing the words, we can conclude the following ordering:
 
- From "xyz" and "yyy", we can conclude that 'x' comes before 'y'.
- From "yyy" and "yyz", we can conclude that 'y' comes before 'z'
 
From the above two points, we can conclude that the correct character order is: "xyz"

## Example 3:

Input: 
>["def", "eg", "fee", "fg", "gdd", "geg"]

Output: 
>defg

From the given words we can conclude the following:
 
- From "def" and "eg", we can conclude that 'd' comes before 'e'.
- From "eg" and "fee", we can conclude that 'e' comes before 'f'.
- From "fee" and "fg", we can conclude that 'e' comes before 'g'
- From "fg" and "gdd", we can conclude that 'f' comes before 'g'
- From "gdd" and "geg", we can conclude that 'd' comes before 'e'
 
From the above five points, we can deduce that the character order is: "defg"

# Proposed Solution

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

5. Pop from this source Queue, and do the following until the source Queue is empty:
    - Add it to the sorted list.
    - Get all of its children from the graph.
    - Decrement the in-degree of each child by 1.
    - If a child’s in-degree becomes ‘0’, add it to the sources Queue.

## Time Complexity

> N = total number of characters in the alien language
> M = size of the input array of words
> C = average number of characters in each word which is a constant

1.  The time complexity of the step where we initialize the Ajacency List and the inDegree map will be O(N*M).
2.  The time complexity of the the step where we're building the graph and populating the in-degree map will be O(N*C).
3.  The step where we're building the sources queue, the time complexity will be O(N).
4.  In the last step, where we're iterating over the Source Queue, each edge of the graph will be accessed once. The edges are the list of pairs **[u,v]** which is the order of M. So the time complexity of this step would be O(M).

Based on above 4 points, the time complexity of this approach would be O(M*N)

## Space Complexity

The Adjacency List, the Source Queue, and the inDegree Map are all proportional to the number of characters in the Alient language i.e., N. So the space complexity would be O(N).