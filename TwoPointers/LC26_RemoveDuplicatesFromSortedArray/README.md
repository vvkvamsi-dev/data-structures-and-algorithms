# 26. Remove Duplicates from Sorted Array


## Approach

### Approach 1: LinkedHashSet
- Insert every element into a `LinkedHashSet`.
- Since `LinkedHashSet` stores only unique elements while maintaining insertion order, all duplicates are removed automatically.
- Copy the unique elements back into the original array.
- Return the count of unique elements.

**Pros**
- Simple and easy to understand.
- Preserves the order of elements.

**Cons**
- Uses extra memory (`O(n)`).
- Does not satisfy the intended in-place optimization of the problem.

---

### Approach 2: Two Pointers (Fast & Slow Pointer)
- Use two pointers:
    - `i` keeps track of the last unique element.
    - `j` scans the array.
- Whenever `nums[j]` is different from `nums[i]`, a new unique element is found.
- Place it at `nums[i + 1]` and increment `i`.
- At the end, `i + 1` represents the number of unique elements.

This approach modifies the array **in-place** and uses constant extra space.

---

## Time Complexity

### Approach 1 (LinkedHashSet)
- **Time:** `O(n)`
- **Space:** `O(n)`

### Approach 2 (Two Pointers)
- **Time:** `O(n)`
- **Space:** `O(1)`

---

## Edge Cases
- Array with only one element.
- Array where all elements are unique.
- Array where all elements are the same.
- Empty array (handled automatically if constraints allow).

---

## Key Learning
- A sorted array allows duplicates to be detected by comparing adjacent unique values.
- `LinkedHashSet` is a quick way to remove duplicates while preserving insertion order, but it requires extra space.
- The **Fast & Slow Pointer** technique is the optimal approach for in-place array modification problems.
- This was my **first Two Pointers problem**, and I learned the core idea:
    - Let one pointer scan the array.
    - Move the second pointer only when the required condition is satisfied.
    - Perform the necessary update and continue scanning.