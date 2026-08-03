"""
Topic: Polymorphism
Author: Dineshkumar
"""

# Real World Example:
# Payment Gateway

# Method Overriding

class Payment:

    def pay(self, amount):
        print("Payment Processing")


class CreditCardPayment(Payment):

    def pay(self, amount):
        print(f"Paid {amount} Using Credit Card")


class UpiPayment(Payment):

    def pay(self, amount):
        print(f"Paid {amount} Using UPI")


payments = [
    CreditCardPayment(),
    UpiPayment()
]

for payment in payments:
    payment.pay(1000)


# Built-in Polymorphism

print(len("Python"))

print(len([10, 20, 30]))