"""
Topic: Inheritance
Author: Dineshkumar
"""

# Real World Example:
# Employee Management System

# Single Inheritance

class Employee:

    def __init__(self, employee_id, name):
        self.employee_id = employee_id
        self.name = name

    def display(self):
        print(self.employee_id)
        print(self.name)


class Developer(Employee):

    def __init__(self, employee_id, name, technology):
        super().__init__(employee_id, name)
        self.technology = technology

    def show_technology(self):
        print(self.technology)


developer = Developer(
    1001,
    "John",
    "Python"
)

developer.display()
developer.show_technology()


# Multilevel Inheritance

class Person:

    def speak(self):
        print("Speaking")


class Employee(Person):

    def work(self):
        print("Working")


class Manager(Employee):

    def manage(self):
        print("Managing Team")


manager = Manager()

manager.speak()
manager.work()
manager.manage()