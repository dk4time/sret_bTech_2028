# Sorting By Last Character

words = [
    "apple",
    "banana",
    "kiwi",
    "orange"
]

words.sort(
    key=lambda word: word[-1]
)

print(words)