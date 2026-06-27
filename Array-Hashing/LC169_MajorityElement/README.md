# 169. Majority Element

## Pattern
- Array
- HashMap (Frequency Counting)

## Approach Used
- Count the frequency of each element using a HashMap.
- Traverse the map to find the element whose frequency is greater than `n / 2`.

## Time Complexity
- O(n)

## Space Complexity
- O(n)

## Key Learning
- Frequency counting with a HashMap is a simple way to solve counting problems.
- `getOrDefault()` makes updating frequencies concise.
- The majority element is guaranteed to exist, so once a frequency exceeds `n / 2`, that element is the answer.

## What I Learned
- Reinforced the frequency counting pattern using `HashMap`.
- Became more comfortable using enhanced for-loops and `getOrDefault()`.
- Solved the problem independently without hints.