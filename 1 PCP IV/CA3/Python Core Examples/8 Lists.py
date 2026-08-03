"""
Topic: Lists
Author: Digital Flash Notes
"""

# Creating Lists

numbers = [10, 20, 30, 40]

print(numbers)


# Accessing Elements

print(numbers[0])
print(numbers[-1])


# List Slicing

print(numbers[1:3])


# Updating Elements

numbers[1] = 25

print(numbers)


# append(item)
# list | Params: item (Required) | Returns: None | O(1)

numbers.append(50)

print(numbers)


# insert(index, item)
# list | Params: 2 Required | Returns: None | O(n)

numbers.insert(1, 15)

print(numbers)


# extend(iterable)
# list | Params: iterable (Required) | Returns: None | O(k)

numbers.extend([60, 70])

print(numbers)


# remove(item)
# list | Params: item (Required) | Returns: None | O(n)

numbers.remove(30)

print(numbers)


# pop(index=-1)
# list | Params: index (Optional) | Returns: element | O(1)

removed = numbers.pop()

print(removed)
print(numbers)


# index(item)
# list | Params: item (Required) | Returns: int | O(n)

print(numbers.index(25))


# count(item)
# list | Params: item (Required) | Returns: int | O(n)

values = [10, 20, 10, 30, 10]

print(values.count(10))


# sort(reverse=False)
# list | Params: reverse (Optional) | Returns: None | O(n log n)

values.sort()

print(values)


# reverse()
# list | Params: None | Returns: None | O(n)

values.reverse()

print(values)


# copy()
# list | Params: None | Returns: list | O(n)

new_values = values.copy()

print(new_values)


# len()
# Built-in Function | Params: iterable | Returns: int | O(1)

print(len(values))


# Traversing List

for num in values:
    print(num)


# Membership

print(20 in values)


# Nested List

matrix = [
    [1, 2],
    [3, 4]
]

print(matrix[1][0])