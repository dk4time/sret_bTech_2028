# Sorting Tuples By Second Element

students = [
    ("John", 85),
    ("Alice", 95),
    ("David", 78)
]

students.sort(
    key=lambda student: student[1]
)

print(students)