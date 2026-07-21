"""
Topic: File Handling
Author: Digital Flash Notes
"""

# Writing To File

file = open("sample.txt", "w")

file.write("Welcome To Python\n")
file.write("File Handling Example")

file.close()


# Reading Entire File

file = open("sample.txt", "r")

print(file.read())

file.close()


# Reading Line By Line

file = open("sample.txt", "r")

for line in file:
    print(line.strip())

file.close()


# readline()
# TextIOWrapper | Params: None | Returns: str | O(n)

file = open("sample.txt", "r")

print(file.readline())

file.close()


# readlines()
# TextIOWrapper | Params: None | Returns: list[str] | O(n)

file = open("sample.txt", "r")

print(file.readlines())

file.close()


# Appending Data

file = open("sample.txt", "a")

file.write("\nLearning Python")

file.close()


# Context Manager

with open("sample.txt", "r") as file:
    print(file.read())