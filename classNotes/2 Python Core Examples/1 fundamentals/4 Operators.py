"""
Topic: Operators
Author: Digital Flash Notes
"""

a = 20
b = 6


# Arithmetic Operators

print(a + b)
print(a - b)
print(a * b)
print(a / b)
print(a // b)
print(a % b)
print(a ** b)


# Comparison Operators

print(a == b)
print(a != b)
print(a > b)
print(a < b)
print(a >= b)
print(a <= b)


# Logical Operators

x = True
y = False

print(x and y)
print(x or y)
print(not x)


# Assignment Operators

num = 10

num += 5
print(num)

num -= 2
print(num)

num *= 3
print(num)


# Membership Operators

language = "Python"

print("P" in language)
print("Java" in language)


# Identity Operators

list1 = [1, 2, 3]
list2 = list1
list3 = [1, 2, 3]

print(list1 is list2)
print(list1 is list3)

print(list1 == list3)