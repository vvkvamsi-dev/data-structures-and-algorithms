# LeetCode 1207 - Unique Number of Occurrences

## Pattern
HashMap + HashSet

## Approach Used

### Step 1: Frequency Counting
- Use a `HashMap<Integer, Integer>` to store the frequency of each number in the array.
- Key = number
- Value = occurrence count

### Step 2: Check Frequency Uniqueness
- Use a `HashSet<Integer>` to store the frequencies.
- Iterate through all frequencies from the HashMap.
- If a frequency already exists in the HashSet, return `false`.
- Otherwise, add the frequency to the HashSet.

### Step 3: Return Result
- If all frequencies are unique, return `true`.

## Time Complexity
- Building the frequency map: **O(n)**
- Checking frequency uniqueness: **O(k)**

Overall: **O(n)**

Where:
- `n` = length of the array
- `k` = number of distinct elements

## Space Complexity
- HashMap stores frequencies of distinct elements.
- HashSet stores distinct frequencies.

Overall: **O(k)**

## Key Learning
- Learned how to combine a HashMap and HashSet in a single solution.
- Practiced frequency counting using `getOrDefault()`.
- Understood that a HashSet can be used to efficiently check uniqueness.

## What I Learned
- Frequency maps are useful when a problem involves counting occurrences.
- HashSets are useful for detecting duplicates and verifying uniqueness.
- Multiple hash-based data structures can be combined to solve a problem efficiently.
- Sometimes the problem is not about the elements themselves, but about the frequencies of those elements.