# Response Timeout — Problem Statement

A log file contains the start and end events for several webservices. Each event has a timestamp. 


| Id        | Timestamp | Status
| --------- |:---------:| -----:
| ID_0      | 0         | Start 
| ID_1      | 1         | Start 
| ID_0      | 2         | End   
| ID_3      | 4         | Start
| ID_4      | 7         | Start
| ID_1      | 8         | End
| ID_5      | 9         | Start

The timeout threshold for every event is 3 sec.

Write code to call out the timedout services **as earliest as possible**

# Solution 

1. Maintain a HashMap with eventId as key and a Blocking queue.
2. One thread will read the data from the log stream and insert/delete it from a Blocking queue. As a start event is published, it's added to the queue and inserted into the Map.
3. Another thread dequeues from the list. On each dequeueing step —
    - If the `now - timestamp > 3000`, call out **Timeout** and remove it from the Map.
    — Else, sleep for `timstamp + 3000 - now`