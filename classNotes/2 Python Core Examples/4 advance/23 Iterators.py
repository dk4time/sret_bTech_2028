"""
Topic: Iterators
Author: Dineshkumar
"""

# Real World Example:
# Processing Records One By One

numbers = [10, 20, 30, 40]

# iter(iterable)
# Built-in Function | Params: iterable | Returns: iterator | O(1)

iterator = iter(numbers)

# next(iterator)
# Built-in Function | Params: iterator | Returns: element | O(1)

print(next(iterator))
print(next(iterator))
print(next(iterator))
print(next(iterator))


# Using Iterator In Loop

iterator = iter(numbers)

for value in iterator:
    print(value)


# Custom Iterator

class Counter:

    def __init__(self, limit):
        self.current = 1
        self.limit = limit

    def __iter__(self):
        return self

    def __next__(self):

        if self.current > self.limit:
            raise StopIteration

        value = self.current
        self.current += 1

        return value


counter = Counter(5)

for number in counter:
    print(number)