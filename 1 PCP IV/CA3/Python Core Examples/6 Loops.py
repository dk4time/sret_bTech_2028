"""
Topic: Loops
Author: Digital Flash Notes
"""

# for loop

for i in range(5):
    print(i)


# range with start and end

for i in range(1, 6):
    print(i)


# range with step

for i in range(0, 11, 2):
    print(i)


# Traversing a string

for ch in "Python":
    print(ch)


# while loop

count = 1

while count <= 5:
    print(count)
    count += 1


# break

for i in range(1, 11):
    if i == 6:
        break
    print(i)


# continue

for i in range(1, 11):
    if i % 2 == 0:
        continue
    print(i)


# pass

for i in range(5):
    if i == 3:
        pass
    print(i)


# Nested loops

for row in range(3):
    for col in range(3):
        print(row, col)