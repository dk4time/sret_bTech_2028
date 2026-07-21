"""
Topic: Tuples
Author: Digital Flash Notes
"""

# Creating Tuples

numbers = (10, 20, 30, 40)

print(numbers)


# Accessing Elements

print(numbers[0])
print(numbers[-1])


# Tuple Slicing

print(numbers[1:3])


# count(item)
# tuple | Params: item (Required) | Returns: int | O(n)

print(numbers.count(20))


# index(item)
# tuple | Params: item (Required) | Returns: int | O(n)

print(numbers.index(30))


# len()
# Built-in Function | Params: iterable | Returns: int | O(1)

print(len(numbers))


# Traversing Tuple

for num in numbers:
    print(num)


# Tuple Unpacking

a, b, c = (10, 20, 30)

print(a)
print(b)
print(c)