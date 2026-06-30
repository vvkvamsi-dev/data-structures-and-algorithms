LeetCode 3 - Longest Substring Without Repeating Characters



🏷️ Pattern

* Sliding Window
* Two Pointers
* HashSet

⸻

💡 Approach

Sliding Window + HashSet

* Use two pointers (left and right) to maintain a sliding window.
* Store the characters inside the current window using a HashSet.
* Expand the window by moving the right pointer.
* If a duplicate character is encountered, shrink the window by removing characters from the left until the duplicate is removed.
* After every valid window, update the maximum length found.
* Continue until the right pointer reaches the end of the string.

⸻

⏱️ Time Complexity

* O(n)

Each character is inserted into and removed from the HashSet at most once.

⸻

💾 Space Complexity

* O(min(n, character set size))

The HashSet stores only the unique characters present in the current window.

⸻

📚 Key Learning

* Understood how a variable-size sliding window works.
* Learned to maintain information about the current window instead of recomputing it.
* Practiced using a HashSet to efficiently detect duplicate characters.
* Learned that both pointers only move forward, resulting in a linear-time solution.

⸻

🚀 What I Learned

* Sliding Window is a specialized application of the Two Pointer technique.
* The window expands by moving the right pointer and shrinks by moving the left pointer whenever the constraint is violated.
* Not every Two Pointer problem is a Sliding Window problem—the defining feature of Sliding Window is maintaining information about the entire window.
* This was my first medium LeetCode problem solved independently using the Sliding Window pattern, which helped reinforce pattern recognition over memorization.