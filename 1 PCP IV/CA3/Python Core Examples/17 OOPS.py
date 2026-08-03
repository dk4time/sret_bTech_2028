"""
Topic: OOPS
Author: Dineshkumar
"""

# Real World Example:
# Student Management System

# Class And Object

class Student:

    def __init__(self, student_id, name, department):
        self.student_id = student_id
        self.name = name
        self.department = department

    def display(self):
        print(self.student_id)
        print(self.name)
        print(self.department)


student1 = Student(101, "John", "MCA")

student1.display()


# Multiple Objects

student2 = Student(102, "Alice", "MCA")

student2.display()