# LeetCode Style Custom Sort

numbers = [
    11,
    2,
    333,
    44,
    5
]

numbers.sort(
    key=lambda number: len(str(number))
)

print(numbers)