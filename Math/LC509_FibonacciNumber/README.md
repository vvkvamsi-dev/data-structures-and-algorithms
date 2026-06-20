# LeetCode 509 - Fibonacci Number

## Pattern
Recursion / Iteration

## Approach 1: Iterative (Used)
Maintain the previous two Fibonacci numbers using variables `a` and `b`. For each iteration, calculate the next Fibonacci number and update the variables.

### Time Complexity
O(n)

### Space Complexity
O(1)

---

## Approach 2: Recursion

The Fibonacci relation can be directly implemented using recursion:

```java
fib(n) = fib(n - 1) + fib(n - 2);
```

However, the same Fibonacci values are recalculated many times, making it inefficient.

### Time Complexity
O(2ⁿ)

### Space Complexity
O(n) (recursion stack)