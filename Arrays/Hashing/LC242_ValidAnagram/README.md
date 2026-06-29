# 242. Valid Anagram

## Pattern

- Arrays & Hashing
- Frequency Counting

---

## Approach

### Frequency Array (Optimized)

Since the problem guarantees that both strings contain only lowercase English letters (`a-z`), a frequency array of size `26` can be used.

1. If the lengths of the two strings are different, return `false`.
2. Create a frequency array of size `26`.
3. Traverse both strings simultaneously:
    - Increment the count for the current character in `s`.
    - Decrement the count for the current character in `t`.
4. After the traversal, if every element in the frequency array is `0`, the strings are anagrams. Otherwise, they are not.

---

## Time Complexity

- **O(n)**

where `n` is the length of the strings.

---

## Space Complexity

- **O(1)**

The frequency array always has a fixed size of `26`, regardless of the input size.

---

## Key Learning

- A frequency array is more efficient than a `HashMap` when the range of possible characters is fixed and small.
- Instead of maintaining two separate frequency structures, a single frequency array can store the **difference** between character counts.
- Increment for characters in the first string and decrement for characters in the second string. If the strings are anagrams, every count will end up as `0`.

---

## What I Learned

- Before creating two arrays or two hash maps for counting frequencies, check if the problem can be solved using a single structure by storing the difference in counts.
- Frequency arrays are a great alternative to `HashMap` when the input is limited to lowercase English letters.
- Leveraging problem constraints often leads to simpler and more efficient solutions.