# Sorting Objects

class Student:

    def __init__(self, name, marks):
        self.name = name
        self.marks = marks

    def __repr__(self):
        return f"{self.name} - {self.marks}"


students = [
    Student("John", 85),
    Student("Alice", 95),
    Student("David", 78)
]

students.sort(
    key=lambda student: student.marks
)

print(students)