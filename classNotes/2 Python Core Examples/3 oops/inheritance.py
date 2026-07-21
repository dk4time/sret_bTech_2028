class Vehicle:
    def __init__(self, type):
        self.type = type

    def move(self):
        print(f"The {self.type} is moving.")

class Car(Vehicle):
    def __init__(self, brand, type="Car"):
        super().__init__(type)
        self.brand = brand

    def move(self):
        print(f"The {self.brand} car is zooming on the road.")

# Inheritance in action
vehicle = Vehicle("bike")
vehicle.move()  # Output: The bike is moving.

car = Car("Tesla")
car.move()  # Output: The Tesla car is zooming on the road.
