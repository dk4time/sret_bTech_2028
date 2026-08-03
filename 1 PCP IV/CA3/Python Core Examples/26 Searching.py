"""
Topic: Searching
Author: Dineshkumar
"""

# Real World Example:
# Product Search System

numbers = [10, 20, 30, 40, 50]


# Linear Search
# Time  : O(n)
# Space : O(1)

target = 30

found = False

for number in numbers:

    if number == target:
        found = True
        break

print(found)


# Linear Search Function

def linear_search(numbers, target):

    for index, value in enumerate(numbers):

        if value == target:
            return index

    return -1


print(linear_search(numbers, 40))


# Binary Search (Iterative)
# Requirement : Sorted Array
# Time        : O(log n)
# Space       : O(1)

numbers = [10, 20, 30, 40, 50, 60, 70]

target = 50

left = 0
right = len(numbers) - 1

while left <= right:

    mid = (left + right) // 2

    if numbers[mid] == target:
        print("Found At", mid)
        break

    elif numbers[mid] < target:
        left = mid + 1

    else:
        right = mid - 1


# Binary Search Function

def binary_search(numbers, target):

    left = 0
    right = len(numbers) - 1

    while left <= right:

        mid = (left + right) // 2

        if numbers[mid] == target:
            return mid

        if numbers[mid] < target:
            left = mid + 1
        else:
            right = mid - 1

    return -1


print(binary_search(numbers, 70))


# Membership Search
# in Operator
# Time : O(n)

print(40 in numbers)


# Search In Set
# Time : O(1) Average

numbers_set = {10, 20, 30, 40, 50}

print(40 in numbers_set)


# Search In Dictionary
# Time : O(1) Average

student = {
    "id": 101,
    "name": "John"
}

print("name" in student)