"""
Topic: Abstraction
Author: Dineshkumar
"""

# Real World Example:
# Vehicle Management System

from abc import ABC
from abc import abstractmethod


class Vehicle(ABC):

    @abstractmethod
    def start(self):
        pass


class Car(Vehicle):

    def start(self):
        print("Car Started")


class Bike(Vehicle):

    def start(self):
        print("Bike Started")


car = Car()

car.start()


bike = Bike()

bike.start()