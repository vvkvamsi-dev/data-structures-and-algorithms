# LeetCode 771 - Jewels and Stones

## Pattern
HashMap / Frequency Counting

## Approach Used
1. Traverse the `stones` string and store the frequency of each character in a `HashMap<Character, Integer>`.
2. Traverse the `jewels` string.
3. For each jewel character, check its frequency in the HashMap and add it to the answer.
4. Return the total count of jewel stones.

## Time Complexity
- Building the HashMap: **O(n)**, where `n = stones.length()`
- Traversing jewels: **O(m)**, where `m = jewels.length()`

**Overall:** `O(n + m)`

## Space Complexity
- HashMap stores frequencies of stone characters.

**O(k)**, where `k` is the number of distinct characters in `stones`.

## Key Learning
- Learned how to use a HashMap for frequency counting.
- Practiced using `getOrDefault()` to avoid extra existence checks.
- Understood how precomputing frequencies can make lookups efficient.

## What I Learned
- A frequency map can be used to quickly answer character-count queries.
- Instead of checking every stone for every jewel, storing frequencies first reduces repeated work.
- HashMaps are useful when fast insertion and lookup operations are needed.