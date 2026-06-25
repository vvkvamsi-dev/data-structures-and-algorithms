# 3737. Count Subarrays With Majority Element I

## Approach

My first thought process was to iterate through all subarrays based on their **length**.

- First, check every subarray of length `1`.
- Then check every subarray of length `2`.
- Continue until the entire array length.

For each subarray, I planned to:
- Count the occurrences of the `target`.
- Calculate the subarray length.
- Check whether:

```text
targetCount > length / 2
```

Although the logic was valid, I found it difficult to organize the loops and manage the implementation.

After receiving a couple of small hints, I changed the way I generated subarrays:

- Instead of fixing the **length**, I fixed the **starting index**.
- Then I gradually expanded the **ending index** to generate every possible subarray.
- While expanding, I maintained the count of the `target` incrementally instead of recounting it for every subarray.

Once I switched to this approach, the implementation became much simpler, and I was able to complete the solution on my own.

---

## Pattern

- Brute Force
- Nested Loops
- Incremental Counting

---

## Time Complexity

- **O(n²)**

Every possible subarray is visited exactly once.

---

## Space Complexity

- **O(1)**

Only a few variables are used.

---

## Key Learning

- The way you **generate subarrays** can greatly simplify the implementation.
- Generating subarrays by fixing the **starting index** and expanding the **ending index** is often easier than iterating by subarray length.
- When expanding a subarray, maintain running information (like frequency counts) instead of recomputing it every time.

---

## What I Learned

- I initially came up with a correct idea but made the implementation unnecessarily complicated.
- A small change in perspective (how the subarrays are generated) made the problem much easier.
- I realized that getting a small hint is different from being given the entire solution. I still had to connect the ideas and implement the algorithm myself, which helped me understand the problem much better.