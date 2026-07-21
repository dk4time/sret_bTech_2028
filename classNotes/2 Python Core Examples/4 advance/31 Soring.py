"""
Topic: Sorting
Author: Dineshkumar
"""

# Real World Example:
# Student Ranking System

numbers = [50, 20, 80, 10, 40]

print(numbers)


# Bubble Sort
# Time  : O(n²)
# Space : O(1)

numbers = [50, 20, 80, 10, 40]

n = len(numbers)

for i in range(n):

    for j in range(n - i - 1):

        if numbers[j] > numbers[j + 1]:

            numbers[j], numbers[j + 1] = (
                numbers[j + 1],
                numbers[j]
            )

print(numbers)


# Selection Sort
# Time  : O(n²)
# Space : O(1)

numbers = [50, 20, 80, 10, 40]

n = len(numbers)

for i in range(n):

    minimum_index = i

    for j in range(i + 1, n):

        if numbers[j] < numbers[minimum_index]:
            minimum_index = j

    numbers[i], numbers[minimum_index] = (
        numbers[minimum_index],
        numbers[i]
    )

print(numbers)


# Insertion Sort
# Time  : O(n²)
# Space : O(1)

numbers = [50, 20, 80, 10, 40]

for i in range(1, len(numbers)):

    current = numbers[i]

    j = i - 1

    while j >= 0 and numbers[j] > current:

        numbers[j + 1] = numbers[j]

        j -= 1

    numbers[j + 1] = current

print(numbers)


# sort()
# list | Params: reverse Optional
# Returns: None
# Complexity: O(n log n)

numbers = [50, 20, 80, 10, 40]

numbers.sort()

print(numbers)


# sorted()
# Built-in Function
# Params: iterable
# Returns: list
# Complexity: O(n log n)

numbers = [50, 20, 80, 10, 40]

result = sorted(numbers)

print(result)


# Sorting Strings

names = [
    "John",
    "Alice",
    "David"
]

print(sorted(names))


# Sorting Using Key

students = [
    ("John", 85),
    ("Alice", 95),
    ("David", 78)
]

students.sort(
    key=lambda student: student[1]
)

print(students)


# Descending Order

numbers = [50, 20, 80, 10, 40]

numbers.sort(reverse=True)

print(numbers)