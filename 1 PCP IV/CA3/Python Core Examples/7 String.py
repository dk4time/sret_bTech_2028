"""
Topic: Strings
Author: Digital Flash Notes
"""

# Creating Strings

name = "Python Programming"

print(name)


# Accessing Characters

print(name[0])
print(name[-1])


# String Slicing

print(name[0:6])
print(name[7:])
print(name[::-1])


# Traversing String

for ch in name:
    print(ch)


# upper()
# str | Params: None | Returns: str | O(n)

print(name.upper())


# lower()
# str | Params: None | Returns: str | O(n)

print(name.lower())


# title()
# str | Params: None | Returns: str | O(n)

print(name.title())


# capitalize()
# str | Params: None | Returns: str | O(n)

print(name.capitalize())


# strip()
# str | Params: None | Returns: str | O(n)

text = "   Python   "

print(text.strip())


# replace(old, new, count=None)
# str | Params: 2 Required, 1 Optional | Returns: str | O(n)

print(name.replace("Python", "Java"))


# find(sub)
# str | Params: sub (Required) | Returns: int | O(n)

print(name.find("Programming"))


# count(sub)
# str | Params: sub (Required) | Returns: int | O(n)

print(name.count("m"))


# startswith(prefix)
# str | Params: prefix (Required) | Returns: bool | O(len(prefix))

print(name.startswith("Python"))


# endswith(suffix)
# str | Params: suffix (Required) | Returns: bool | O(len(suffix))

print(name.endswith("Programming"))


# split(separator=None)
# str | Params: separator (Optional) | Returns: list | O(n)

sentence = "Java Python JavaScript"

words = sentence.split()

print(words)


# join(iterable)
# str | Params: iterable (Required) | Returns: str | O(n)

languages = ["Java", "Python", "C++"]

print(" | ".join(languages))


# String Membership

print("Python" in name)
print("Java" not in name)


# f-string

student = "John"
marks = 95

print(f"{student} scored {marks} marks")