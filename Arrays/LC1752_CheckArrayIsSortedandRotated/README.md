# LeetCode 1752 - Check if Array Is Sorted and Rotated

## Pattern
- Arrays

---


## Approach 

#### Idea
A sorted array that has been rotated can have **at most one decreasing adjacent pair (drop)**.

Traverse the array and count how many times:

```java
nums[i] > nums[(i + 1) % n]
```

The modulo operator makes the comparison circular by comparing the last element with the first element.

- If the number of drops is `0` or `1`, return `true`.
- Otherwise, return `false`.

---

## Key Learning

- Sometimes a problem can be solved by identifying an **invariant** instead of validating multiple conditions.
- Treating an array as **circular** using `(i + 1) % n` is a common and useful technique.
- The comparison between the **last element and the first element** is crucial in rotation-based problems.

---

## What I Learned

- I initially tried to find the rotation point and validate both halves separately.
- My approach missed the circular boundary condition between the last and first elements.
- The optimal solution is much simpler by counting the number of decreasing adjacent pairs.
- This problem taught me to look for a core property (invariant) instead of reconstructing the rotation.

---

## Complexity Summary

| Approach | Time | Space |
|----------|------|-------|
| Observation (Optimal) | O(n) | O(1) |