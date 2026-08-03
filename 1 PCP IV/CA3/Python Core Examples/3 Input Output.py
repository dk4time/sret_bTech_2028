"""
Topic: Input Output
Author: Digital Flash Notes
"""

# Basic output

print("Welcome to Python")


# Multiple values

name = "John"
age = 22

print(name, age)


# Separator

print("Python", "Java", "C", sep=" | ")


# End parameter

print("Hello", end=" ")
print("World")


# Taking input

name = input("Enter your name: ")

print("Welcome", name)


# Integer input

age = int(input("Enter your age: "))

print("Age:", age)


# Float input

salary = float(input("Enter salary: "))

print("Salary:", salary)


# Formatted output

student = "Alice"
marks = 95

print(f"{student} scored {marks} marks")