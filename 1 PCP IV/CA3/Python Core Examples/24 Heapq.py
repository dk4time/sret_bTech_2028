"""
Topic: Heapq
Author: Dineshkumar
"""

# Real World Example:
# Top K Ranking System

import heapq


numbers = [50, 10, 80, 20, 30]

# heapify(list)
# heapq | Params: list | Returns: None | O(n)

heapq.heapify(numbers)

print(numbers)


# heappush(heap, item)
# heapq | Params: heap, item | Returns: None | O(log n)

heapq.heappush(numbers, 15)

print(numbers)


# heappop(heap)
# heapq | Params: heap | Returns: element | O(log n)

print(heapq.heappop(numbers))

print(numbers)


# nlargest(n, iterable)
# heapq | Params: n, iterable | Returns: list | O(n log k)

print(heapq.nlargest(3, numbers))


# nsmallest(n, iterable)
# heapq | Params: n, iterable | Returns: list | O(n log k)

print(heapq.nsmallest(3, numbers))