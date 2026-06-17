# Palindrome Number

Reverse the given integer and compare it with the original number.

### Edge Cases
- Negative numbers are not palindromes.
- `0` is a palindrome.

### Approach
- Store the original number.
- Reverse the digits using `% 10` and `/ 10`.
- Compare the reversed number with the original.

### Optimized Approach
- Reverse only half of the number instead of the entire number.
- Avoids integer overflow and reduces the number of iterations.
- Time complexity remains `O(log n)` with `O(1)` space.

### Complexity
- Time: `O(log n)`
- Space: `O(1)`