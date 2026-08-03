"""
Topic: Recursion
Author: Digital Flash Notes
"""

# Factorial

def factorial(n):
    if n == 0:
        return 1

    return n * factorial(n - 1)

print(factorial(5))


# Sum Of N Numbers

def total(n):
    if n == 0:
        return 0

    return n + total(n - 1)

print(total(5))


# Fibonacci

def fibonacci(n):
    if n <= 1:
        return n

    return fibonacci(n - 1) + fibonacci(n - 2)

print(fibonacci(7))


# Reverse String

def reverse(text):
    if len(text) == 0:
        return ""

    return text[-1] + reverse(text[:-1])

print(reverse("python"))


# Power

def power(base, exponent):
    if exponent == 0:
        return 1

    return base * power(base, exponent - 1)

print(power(2, 5))