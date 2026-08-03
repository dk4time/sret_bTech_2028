"""
Topic: Encapsulation
Author: Dineshkumar
"""

# Real World Example:
# Banking Application

class BankAccount:

    def __init__(self, account_number, balance):
        self.account_number = account_number
        self.__balance = balance

    def deposit(self, amount):
        self.__balance += amount

    def withdraw(self, amount):

        if amount <= self.__balance:
            self.__balance -= amount

    def get_balance(self):
        return self.__balance


account = BankAccount(
    "SB101",
    5000
)

account.deposit(2000)

account.withdraw(1000)

print(account.get_balance())


# Access Restriction

# print(account.__balance)