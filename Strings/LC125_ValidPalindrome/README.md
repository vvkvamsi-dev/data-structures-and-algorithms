# LeetCode 125 - Valid Palindrome

## Approach 1: String Cleaning
- Removed all non-alphanumeric characters using `replaceAll()`.
- Converted the string to lowercase.
- Used two pointers to check if the cleaned string is a palindrome.

**Key Methods:**
- `replaceAll("[^a-zA-Z0-9]", "")`
- `toLowerCase()`

---

## Approach 2: Optimized Two Pointers
- Used two pointers directly on the original string.
- Skipped non-alphanumeric characters using `Character.isLetterOrDigit()`.
- Compared characters case-insensitively using `Character.toLowerCase()`.
- Avoided creating a new string, resulting in better space efficiency.

**Key Methods:**
- `Character.isLetterOrDigit()`
- `Character.toLowerCase()`
- `charAt()`

## Complexity
- Time: **O(n)**
- Space: **O(1)** (Optimized Approach)