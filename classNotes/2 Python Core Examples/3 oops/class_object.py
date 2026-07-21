class Car:
    def __init__(self, brand, color):
        self.brand = brand
        self.color = color

    def start_engine(self):
        print(f"{self.brand} engine started.")

# Creating objects
car1 = Car("Toyota", "Red")
car2 = Car("Honda", "Blue")

car1.start_engine()  # Output: Toyota engine started.
car2.start_engine()  # Output: Honda engine started.
