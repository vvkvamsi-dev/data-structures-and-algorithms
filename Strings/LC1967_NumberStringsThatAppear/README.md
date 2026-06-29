# LeetCode 1967 - Number of Strings That Appear as Substrings in Word

## Pattern
- Strings
- Substring Search

---

## Approach Used
- Iterate through each string in `patterns`.
- Use Java's built-in `String.contains()` method to check whether the current pattern exists as a substring of `word`.
- If it does, increment the count.
- Return the final count.

---

## Time Complexity
- **O(n × m)**
    - `n` = number of patterns
    - `m` = length of `word`
    - (`contains()` may scan the word for each pattern.)

---

## Space Complexity
- **O(1)**
    - Only a counter variable is used.

---

## Key Learning
- Java provides the `String.contains()` method for checking whether a substring exists within another string.
- Built-in string methods can simplify solutions significantly when constraints are small.
- Always consider using standard library functions before implementing complex algorithms.

---

## What I Learned
- Identified this as a substring-search problem.
- Practiced using `String.contains()` effectively.
- Understood that not every string problem requires implementing a substring-search algorithm manually.
- Learned to recognize when a built-in method is sufficient for an optimal solution within the given constraints.