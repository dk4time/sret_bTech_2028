"""
Topic: Modules
Author: Dineshkumar
"""

# Real World Example:
# Utility Package Used In Multiple Projects

# math Module

import math

print(math.sqrt(25))
print(math.ceil(4.2))
print(math.floor(4.9))


# random Module

import random

print(random.randint(1, 10))


# Import Specific Function

from math import factorial

print(factorial(5))


# Alias

import math as m

print(m.pi)


# Built-in Module Information

import sys

print(sys.version)