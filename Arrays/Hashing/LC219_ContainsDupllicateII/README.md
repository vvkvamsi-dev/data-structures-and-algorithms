# LeetCode 219 - Contains Duplicate II

## Pattern
HashMap (Value → Last Seen Index)

## Approach Used
### Approach
- Use a HashMap to store each number as the key and its latest index as the value.
- Traverse the array once.
- If the current number already exists in the HashMap:
    - Calculate the distance between the current index and the previously stored index.
    - If the distance is less than or equal to `k`, return `true`.
- Update the index of the current number in the HashMap.
- If no valid pair is found, return `false`.

## Time Complexity
- **O(n)**

## Space Complexity
- **O(n)**

## Key Learning
- HashMaps can be used to store additional information such as indices, not just frequencies.
- Storing the latest occurrence of an element helps solve distance-based duplicate problems efficiently in a single traversal.
- Updating the index after every occurrence ensures the most recent position is always available for comparison.

## What I Learned
- How to use a HashMap to track the last seen index of elements.
- How index tracking can help solve problems involving conditions on element positions.
- Reinforced the pattern of storing `value → index` in a HashMap, which is commonly used in array and hashing problems.