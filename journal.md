# Phase 1
The PriorityQueue knows which company is smallest because Company implements Comparable and compares companies using their size. To merge the largest companies first, I would reverse the comparison order.

# Phase 2
A PriorityQueue is more efficient because it automatically keeps the smallest company accessible without sorting the entire list every time. Adding an item takes O(log n), while sorting a whole list takes O(n log n).

# Phase 3
If I forgot to check the queue size before calling poll() twice, one of the calls could return null. This could cause a NullPointerException when accessing the company's information. This is called underflow because we are trying to remove more elements than the queue contains.s