# Sorting Using Multiple Keys

students = [
    ("John", 85),
    ("Alice", 95),
    ("David", 85),
    ("Bob", 95)
]

students.sort(
    key=lambda student: (
        student[1],
        student[0]
    )
)

print(students)

# Sort By Length Then Alphabetically

words = [
    "cat",
    "apple",
    "bat",
    "banana"
]

words.sort(
    key=lambda word: (
        len(word),
        word
    )
)

print(words)

# Custom Ranking

employees = [
    {
        "name": "John",
        "salary": 50000,
        "experience": 4
    },
    {
        "name": "Alice",
        "salary": 60000,
        "experience": 2
    },
    {
        "name": "David",
        "salary": 50000,
        "experience": 6
    }
]

employees.sort(
    key=lambda employee: (
        employee["salary"],
        employee["experience"]
    )
)

print(employees)