# Alien Language

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


