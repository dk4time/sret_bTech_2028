"""
Topic: Decorators
Author: Dineshkumar
"""

# Real World Example:
# Logging User Actions

def logger(function):

    def wrapper():

        print("Function Started")

        function()

        print("Function Completed")

    return wrapper


@logger
def greet():
    print("Welcome To Python")


greet()