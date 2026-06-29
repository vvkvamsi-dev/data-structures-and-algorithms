LeetCode 1 - Two Sum
---

## Pattern
- Array
- Hashing

---

## Approaches Used

### 1. Brute Force
- Check every possible pair of elements.
- If the sum equals the target, return their indices.

**Time Complexity:** `O(n²)`

**Space Complexity:** `O(1)`

---

### 2. HashMap (Optimal)
- Traverse the array once.
- For each element, determine the complement (`target - currentElement`).
- Use a `HashMap` to quickly determine whether the required value has already been encountered.
- If found, return the stored index and the current index.
- Otherwise, store the current information in the map and continue.

**Time Complexity:** `O(n)`

**Space Complexity:** `O(n)`

---

## Key Learning

- Brute force is often the first valid solution, but it may not be efficient.
- HashMap allows constant-time lookups, reducing the time complexity from `O(n²)` to `O(n)`.
- Many array problems become simpler by storing previously seen elements in a HashMap.
- There can be multiple correct HashMap implementations. One common approach stores `number → index`, while another stores `complement → index`.
- Returning immediately after finding the answer avoids unnecessary iterations.

---

## What I Learned

- Always look for ways to replace nested loops with a suitable data structure.
- Think in terms of the **missing value (complement)** instead of searching for pairs.
- A HashMap can be used to trade extra space for faster lookups.
- The Java compiler requires every possible execution path of a method to return a value, even if the problem statement guarantees a solution.

---

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Brute Force | `O(n²)` | `O(1)` |
| HashMap | `O(n)` | `O(n)` |