# 349. Intersection of Two Arrays

## Pattern
- Hashing
- HashSet

## Approach Used

### Initial Approach
- Created two HashSets:
    - One for unique elements of `nums1`
    - One for unique elements of `nums2`
- Iterated through one set and checked whether the element existed in the other set.
- Added common elements to the result list.

### Optimized Approach
- Used only one HashSet to store unique elements from `nums1`.
- Traversed `nums2`.
- If an element existed in the set:
    - Added it to the result list.
    - Removed it from the set to prevent duplicate entries in the answer.
- Converted the ArrayList into an `int[]` before returning.

## Time Complexity

```text
O(n + m)
```

- O(n) to build the HashSet.
- O(m) to traverse the second array.

## Space Complexity

```text
O(n)
```

- HashSet stores unique elements from `nums1`.

## Key Learning

- HashSet provides average O(1) lookup time.
- Removing an element from the HashSet after adding it to the answer helps maintain uniqueness.
- A second HashSet was unnecessary for this problem.

## What I Learned

- Solved the problem initially using two HashSets.
- Optimized the solution to use only one HashSet.
- Practiced using:
    - `add()`
    - `contains()`
    - `remove()`
- Learned how to convert an `ArrayList<Integer>` into an `int[]` for LeetCode return types.
- Understood how HashSet can be used for efficient intersection operations.

# 349. Intersection of Two Arrays (Sorting + Two Pointers)

## Pattern
- Sorting
- Two Pointers

## Approach Used

### Idea
- Sort both arrays.
- Use two pointers:
    - `i` for `nums1`
    - `j` for `nums2`
- Compare elements at both pointers:
    - If `nums1[i] < nums2[j]`, move `i`.
    - If `nums1[i] > nums2[j]`, move `j`.
    - If both are equal:
        - Add the element to the answer.
        - Move both pointers.
- To maintain uniqueness, only add the element if it is different from the last element added to the result.

## Time Complexity

```text
O(n log n + m log m)
```

- Sorting `nums1`: O(n log n)
- Sorting `nums2`: O(m log m)
- Two pointer traversal: O(n + m)

## Space Complexity

```text
O(1)
```

Ignoring the output array.

OR

```text
O(log n + log m)
```

If the sorting stack space is considered.

## Key Learning

- Sorting can sometimes replace hashing.
- When two arrays are sorted, two pointers can efficiently find common elements.
- Two pointers allow us to process both arrays in a single traversal after sorting.
- This approach trades faster runtime for lower memory usage compared to the HashSet solution.

## What I Learned

- A problem can often have multiple valid patterns and solutions.
- My first instinct was HashSet, but the same problem can also be solved using Sorting + Two Pointers.
- Two pointers work well when data is sorted.
- The loop condition

```java
while(i < nums1.length && j < nums2.length);
```

prevents any out-of-bounds access even when pointers are incremented inside the loop.
- This approach is more space-efficient than the HashSet solution but slower because of sorting.