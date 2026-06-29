# 383. Ransom Note

## Pattern
- Hashing / Frequency Counting

## Approach Used
- Use a frequency array of size **26** to count the occurrences of each character in the `magazine`.
- Traverse the `ransomNote` and consume the required characters by decrementing their counts.
- If any required character is unavailable (count becomes `0` before use), return `false`.
- If all characters are successfully consumed, return `true`.

## Time Complexity
- **O(m + n)**
    - `m` = length of `magazine`
    - `n` = length of `ransomNote`

## Space Complexity
- **O(1)**
    - Uses a fixed-size array of 26 integers.

## Key Learning
- Sometimes it's better to count the **available resources** rather than the **required resources**.
- A frequency array is more efficient than a `HashMap` when the character set is fixed (lowercase English letters).
- Checking availability while consuming characters allows an **early exit**, avoiding unnecessary work.

## What I Learned
- My first solution used a **HashMap** to store the frequency of characters in the `ransomNote` and then decrement those counts while traversing the `magazine`. Initially, I mistakenly checked for `!= 0` at the end, but later realized that the correct condition is `> 0` because the magazine is allowed to have extra unused characters.
####
- After getting the HashMap solution working, I tried to optimize it by merging the two loops into a single traversal. Although this reduced the number of loops, it did not improve the overall efficiency because the expensive `HashMap` operations (`get`, `put`, `containsKey`) were still being performed.
####
- Since the problem guarantees only lowercase English letters, I realized that a fixed-size **frequency array of 26 elements** is a much better choice than a HashMap. It avoids hashing overhead and provides direct indexing.
  ####
- I also understood that **frequency is more important than existence**. Using methods like `contains()` is not enough because a character may exist in the `magazine` but not in sufficient quantity.
####
- The biggest insight from this problem was to think in terms of **supply and demand**. Instead of counting the characters required by the `ransomNote`, the optimal approach counts the characters available in the `magazine` and consumes them while traversing the `ransomNote`. This naturally supports an **early exit** whenever a required character is unavailable.