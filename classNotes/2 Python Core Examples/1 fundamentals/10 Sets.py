"""
Topic: Sets
Author: Digital Flash Notes
"""

# Creating Sets

numbers = {10, 20, 30, 40}

print(numbers)


# add(item)
# set | Params: item (Required) | Returns: None | O(1)

numbers.add(50)

print(numbers)


# update(iterable)
# set | Params: iterable (Required) | Returns: None | O(k)

numbers.update([60, 70])

print(numbers)


# remove(item)
# set | Params: item (Required) | Returns: None | O(1)

numbers.remove(20)

print(numbers)


# discard(item)
# set | Params: item (Required) | Returns: None | O(1)

numbers.discard(100)


# pop()
# set | Params: None | Returns: element | O(1)

print(numbers.pop())


# union(other)
# set | Params: set (Required) | Returns: set | O(n+m)

a = {1, 2, 3}
b = {3, 4, 5}

print(a.union(b))


# intersection(other)
# set | Params: set (Required) | Returns: set | O(min(n,m))

print(a.intersection(b))


# difference(other)
# set | Params: set (Required) | Returns: set | O(n)

print(a.difference(b))


# Membership

print(3 in a)