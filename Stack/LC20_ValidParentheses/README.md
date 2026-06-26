# 20. Valid Parentheses

## Pattern
**Stack – Balanced Brackets / Matching Parentheses**

## Approach Used
**Stack**

- Traverse the string character by character.
- Push every opening bracket onto the stack.
- When a closing bracket is encountered:
    - If the stack is empty, the string is invalid.
    - Pop the top element from the stack.
    - Verify that it matches the corresponding opening bracket.
- After processing the entire string, the stack should be empty for the string to be valid.

---

## Time Complexity
- **O(n)**

Each character is processed exactly once.

---

## Space Complexity
- **O(n)**

In the worst case, all opening brackets are stored in the stack.

---

## Key Learning
- A **Stack (LIFO)** is the ideal data structure for problems involving matching pairs and nested structures.
- Always check whether the stack is empty before performing `pop()` to avoid exceptions.
- A valid sequence requires both:
    - Correct matching of bracket types.
    - Correct order of opening and closing brackets.
- Returning `stack.isEmpty()` at the end ensures there are no unmatched opening brackets remaining.

---

## What I Learned
- Initially, I identified that a stack was the appropriate data structure because brackets must be matched in reverse order.
- I learned to handle invalid cases early by checking if the stack is empty before popping.
- I understood how to compare each closing bracket with the most recently opened bracket using `pop()`.
- I realized that even if all closing brackets are processed, any remaining opening brackets in the stack make the string invalid.
- This problem strengthened my understanding of the LIFO behavior of stacks and their application in parsing and matching problems.