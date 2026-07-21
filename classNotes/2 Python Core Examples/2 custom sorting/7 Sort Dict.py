# Sorting Dictionary Keys

students = {
    "John": 85,
    "Alice": 95,
    "David": 78
}

result = sorted(
    students.keys()
)

print(result)

# Sorting Dictionary By Values

students = {
    "John": 85,
    "Alice": 95,
    "David": 78
}

result = sorted(
    students.items(),
    key=lambda item: item[1]
)

print(result)