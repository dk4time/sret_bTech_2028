#Method Overloading
class Calculator:
    def add(self, *a):
        return sum(a)

calc = Calculator()
calc.add(10, 20)
calc.add(10)
calc.add(10, 20, 30)
calc.add(10,20, 30, 40, 50, 60)

#Method Overriding
class Animal:
    def sound(self):
        pass

class Dog(Animal):
    def sound(self):
        print("Woof! Woof!")

class Cat(Animal):
    def sound(self):
        print("Meow! Meow!")

# Using polymorphism
animals = [Dog(), Cat()]

for animal in animals:
    animal.sound()
# Output:
# Woof! Woof!
# Meow! Meow!


