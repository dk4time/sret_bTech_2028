"""
Topic: Generators
Author: Dineshkumar
"""

# Real World Example:
# Streaming Large Data

# Generator Function

def generate_numbers():

    yield 10
    yield 20
    yield 30


generator = generate_numbers()

print(next(generator))
print(next(generator))
print(next(generator))


# Generator With Loop

def count(limit):

    for number in range(1, limit + 1):
        yield number


for value in count(5):
    print(value)


# Generator Expression

squares = (number * number for number in range(1, 6))

for value in squares:
    print(value)