# Reverse Integer

## Approach
- Extract digits using `x % 10`.
- Build the reversed number using `rev = rev * 10 + digit`.
- Remove the last digit using `x /= 10`.
- Handle both positive and negative numbers in the same loop.
- Before updating `rev`, check if `rev * 10 + digit` would overflow an `int`. If yes, return `0`.

## Key Learnings
- No need to handle negative numbers separately because Java keeps the sign in `%`.
- Overflow must be checked **before** multiplying by `10`.
- For overflow checks:
    - `Integer.MAX_VALUE = 2147483647`
    - `Integer.MIN_VALUE = -2147483648`

## Complexity
- Time: **O(log n)**
- Space: **O(1)**