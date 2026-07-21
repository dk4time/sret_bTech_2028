"""
Topic: Functions
Author: Digital Flash Notes
"""

# Function Without Parameters

def greet():
    print("Welcome to Python")

greet()


# Function With Parameters

def greet_user(name):
    print("Welcome", name)

greet_user("John")


# Function With Return Value

def add(a, b):
    return a + b

result = add(10, 20)

print(result)


# Multiple Return Values

def calculate(a, b):
    return a + b, a - b

sum_value, diff_value = calculate(20, 10)

print(sum_value)
print(diff_value)


# Default Parameters

def power(number, exponent=2):
    return number ** exponent

print(power(5))
print(power(5, 3))


# Keyword Arguments

def display(name, age):
    print(name, age)

display(age=21, name="Alice")


# Variable Length Arguments

def total(*numbers):
    print(sum(numbers))

total(10, 20)
total(10, 20, 30, 40)


# Variable Length Keyword Arguments

def print_details(**details):
    print(details)

print_details(name="John", city="Chennai")


# Scope

global_var = 100

def show():
    local_var = 50

    print(global_var)
    print(local_var)

show()


# Built-in Functions

numbers = [10, 20, 30, 40]

print(len(numbers))
print(max(numbers))
print(min(numbers))
print(sum(numbers))