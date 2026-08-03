"""
Topic: Lambda
Author: Digital Flash Notes
"""

# Basic Lambda

square = lambda x: x * x

print(square(5))


# Multiple Parameters

add = lambda a, b: a + b

print(add(10, 20))


# Sorting

students = [
    ("John", 85),
    ("Alice", 92),
    ("Bob", 78)
]

students.sort(key=lambda student: student[1])

print(students)


# max()
# Built-in Function | key Optional

numbers = [10, 50, 20, 80]

print(max(numbers))


# sorted()
# Built-in Function | key Optional

words = ["banana", "kiwi", "apple", "watermelon"]

result = sorted(words, key=lambda word: len(word))

print(result)