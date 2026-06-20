# LeetCode 1480 - Running Sum of 1d Array

## Approach 1: Brute Force
- For each index, calculated the sum of all elements from index `0` to the current index.
- Repeatedly traversed previously visited elements for every position.
- Worked correctly but involved redundant calculations.

**Complexity:**
- Time: **O(n²)**
- Space: **O(n)**

---

## Approach 2: Running Sum
- Maintained a single running sum while traversing the array.
- Added the current element to the running sum and stored the result in a new array.
- Avoided recalculating previous sums.

**Key Idea:**
- Reuse the previously computed sum instead of calculating it again.

**Complexity:**
- Time: **O(n)**
- Space: **O(n)**

---

## Approach 3: In-Place Optimization
- Noticed that previous values were no longer needed after processing.
- Stored the running sum directly in the input array.
- Eliminated the need for an additional array.

**Key Idea:**
- Reuse the input array to reduce extra space.

**Complexity:**
- Time: **O(n)**
- Space: **O(1)**

---

## Approach 4: Most Compact Version
- Observed that the previous index already contains the running sum.
- Updated each element using the value at the previous index.

```java
nums[i] += nums[i - 1];