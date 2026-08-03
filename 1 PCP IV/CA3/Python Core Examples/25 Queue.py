"""
Topic: Queue
Author: Dineshkumar
"""

# Real World Example:
# Ticket Booking Queue

from collections import deque


queue = deque()


# append(item)
# deque | Params: item | Returns: None | O(1)

queue.append("John")
queue.append("Alice")
queue.append("David")

print(queue)


# popleft()
# deque | Params: None | Returns: element | O(1)

print(queue.popleft())

print(queue)


# Front Element

print(queue[0])


# Queue Size

print(len(queue))