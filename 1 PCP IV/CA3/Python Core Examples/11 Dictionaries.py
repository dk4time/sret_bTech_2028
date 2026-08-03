"""
Topic: Dictionaries
Author: Digital Flash Notes
"""

# Creating Dictionaries

student = {
    "id": 101,
    "name": "John",
    "marks": 95
}

print(student)


# Accessing Values

print(student["name"])


# get(key, default=None)
# dict | Params: key (Required), default (Optional) | Returns: Any | O(1)

print(student.get("marks"))
print(student.get("city", "Not Found"))


# Adding / Updating Values

student["city"] = "Chennai"
student["marks"] = 98

print(student)


# keys()
# dict | Params: None | Returns: dict_keys | O(1)

print(student.keys())


# values()
# dict | Params: None | Returns: dict_values | O(1)

print(student.values())


# items()
# dict | Params: None | Returns: dict_items | O(1)

print(student.items())


# pop(key)
# dict | Params: key (Required) | Returns: value | O(1)

removed = student.pop("city")

print(removed)
print(student)


# popitem()
# dict | Params: None | Returns: tuple | O(1)

print(student.popitem())


# update(other)
# dict | Params: dict (Required) | Returns: None | O(n)

student.update({
    "department": "MCA",
    "year": 2
})

print(student)


# Membership

print("name" in student)
print("salary" in student)


# Traversing Dictionary

for key in student:
    print(key, student[key])


# Traversing items()

for key, value in student.items():
    print(key, value)


# len()
# Built-in Function | Params: iterable | Returns: int | O(1)

print(len(student))