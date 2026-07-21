"""
Topic: Variables
Author: Digital Flash Notes
"""

# Creating variables

name = "Dinesh"
age = 28
salary = 55000.75

print(name)
print(age)
print(salary)


# Multiple assignment

x, y, z = 10, 20, 30

print(x)
print(y)
print(z)


# Assigning same value

a = b = c = 100

print(a)
print(b)
print(c)


# Dynamic typing

value = 100
print(value)
print(type(value))

value = "Python"
print(value)
print(type(value))

value = 99.99
print(value)
print(type(value))


# Variable naming

student_name = "John"
student_age = 21

print(student_name)
print(student_age)


# Swapping variables

first = 10
second = 20

print("Before Swap")
print(first, second)

first, second = second, first

print("After Swap")
print(first, second)


# Deleting variable

temp = "Temporary"

print(temp)

del temp