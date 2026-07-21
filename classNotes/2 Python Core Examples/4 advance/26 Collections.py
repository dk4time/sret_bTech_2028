"""
Topic: Collections
Author: Dineshkumar
"""

# Real World Example:
# Frequency Analysis System

from collections import Counter
from collections import defaultdict
from collections import deque


# Counter(iterable)
# Counter | Params: iterable | Returns: Counter | O(n)

text = "banana"

frequency = Counter(text)

print(frequency)


# most_common(n=None)
# Counter | Params: n Optional | Returns: list | O(n log n)

print(frequency.most_common(2))


# defaultdict(default_factory)
# defaultdict | Params: callable | Returns: defaultdict | O(1)

students = defaultdict(list)

students["MCA"].append("John")
students["MCA"].append("Alice")

print(students)


# deque(iterable=None)
# deque | Params: iterable Optional | Returns: deque | O(1)

queue = deque([10, 20, 30])

print(queue)


# append(item)
# deque | Params: item | Returns: None | O(1)

queue.append(40)

print(queue)


# appendleft(item)
# deque | Params: item | Returns: None | O(1)

queue.appendleft(5)

print(queue)


# popleft()
# deque | Params: None | Returns: element | O(1)

print(queue.popleft())

print(queue)