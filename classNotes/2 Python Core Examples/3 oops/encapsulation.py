class BankAccount:
    def __init__(self, account_holder, balance):
        self.account_holder = account_holder
        self.__balance = balance  # Private attribute

    def deposit(self, amount):
        self.__balance += amount
        print(f"Deposited {amount}. New balance: {self.__balance}")

    def withdraw(self, amount):
        if amount <= self.__balance:
            self.__balance -= amount
            print(f"Withdrew {amount}. New balance: {self.__balance}")
        else:
            print("Insufficient balance.")

# Using encapsulation
account = BankAccount("Alice", 1000)
account.deposit(500)  # Deposited 500. New balance: 1500
account.withdraw(700)  # Withdrew 700. New balance: 800
