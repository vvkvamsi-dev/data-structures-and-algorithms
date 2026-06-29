# LeetCode 2011 - Final Value of Variable After Performing Operations

## Pattern
Simulation / Array Traversal

## Approach Used

### Approach 1: Traverse and Update Counter
- Initialize a variable with value `0`.
- Traverse through each operation in the array.
- If the middle character is `'+'`, increment the variable.
- Otherwise, decrement it.
- Return the final value after processing all operations.

## Time Complexity
- **O(n)** → We process each operation exactly once.

## Space Complexity
- **O(1)** → Only a single variable is used regardless of input size.

## Key Learning
- In Java, `==` compares object references, while `.equals()` compares actual string values.
- String operations can sometimes be simplified by checking specific character positions instead of comparing entire strings.

## What I Learned
- Difference between `==` and `.equals()` in Java.
- Using `charAt()` to simplify string-based conditions.
- Solving simulation problems using a single traversal with constant extra space.