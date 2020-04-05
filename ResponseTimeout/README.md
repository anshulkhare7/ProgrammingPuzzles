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