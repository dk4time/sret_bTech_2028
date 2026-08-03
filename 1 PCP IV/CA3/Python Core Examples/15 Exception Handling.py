"""
Topic: Exception Handling
Author: Digital Flash Notes
"""

# try except

try:
    result = 10 / 0
except ZeroDivisionError:
    print("Cannot divide by zero")


# Multiple Exceptions

try:
    number = int("abc")
except ValueError:
    print("Invalid Number")


# try except else

try:
    result = 10 / 2
except ZeroDivisionError:
    print("Error")
else:
    print(result)


# try except finally

try:
    file = open("sample.txt")
except FileNotFoundError:
    print("File Not Found")
finally:
    print("Execution Completed")


# Raising Exception

age = -5

if age < 0:
    raise ValueError("Age cannot be negative")