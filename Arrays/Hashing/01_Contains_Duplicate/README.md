# Contains Duplicate

## Approach
- Used a `HashSet` to track previously seen elements.
- If an element already exists in the set, return `true`.
- Otherwise add it to the set and continue traversal.

## Other Approaches Considered
- Tried nested loops, but it results in **O(n²)** time complexity.
- Considered using an `ArrayList`, but `contains()` performs a linear search, leading to **O(n²)** overall.
- Thought about using a boolean/frequency array, but the value range in the constraints can be very large (`10^9`), making it memory inefficient.

## Key Learnings
- `HashSet` provides average **O(1)** lookup and insertion.
- HashSet memory depends on the number of stored elements, not the maximum value in the input.
- Always consider both **time complexity** and **space complexity** before choosing a data structure.

## Complexity
- Time: **O(n)**
- Space: **O(n)**