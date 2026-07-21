# Sorting Tuples By Name

students = [
    ("John", 85),
    ("Alice", 95),
    ("David", 78)
]

students.sort(
    key=lambda student: student[0]
)

print(students)