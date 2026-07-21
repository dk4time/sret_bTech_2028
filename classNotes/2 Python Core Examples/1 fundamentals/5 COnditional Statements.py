"""
Topic: Conditional Statements
Author: Digital Flash Notes
"""

# Simple if

age = 18

if age >= 18:
    print("Eligible to vote")


# if else

number = 15

if number % 2 == 0:
    print("Even")
else:
    print("Odd")


# if elif else

marks = 76

if marks >= 90:
    print("Grade A")
elif marks >= 75:
    print("Grade B")
elif marks >= 50:
    print("Grade C")
else:
    print("Fail")


# Nested if

username = "admin"
password = "1234"

if username == "admin":
    if password == "1234":
        print("Login Successful")
    else:
        print("Invalid Password")
else:
    print("Invalid Username")


# Ternary operator

num = 25

result = "Positive" if num > 0 else "Negative"

print(result)


# Multiple conditions

salary = 45000
experience = 3

if salary >= 40000 and experience >= 2:
    print("Eligible")
else:
    print("Not Eligible")