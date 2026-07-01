# LeetCode 1672 - Richest Customer Wealth

## Pattern

* 2D Array Traversal

## Approach

* Traverse each row of the 2D array, where each row represents a customer’s bank accounts.
* Calculate the total wealth of the current customer by summing all account balances in that row.
* Keep track of the maximum wealth encountered while traversing all customers.
* Return the maximum wealth after processing the entire matrix.

## Time Complexity

* O(m × n)
    * m = number of customers (rows)
    * n = number of accounts per customer (columns)

## Space Complexity

* O(1)
    * Only a few extra variables are used regardless of the input size.

## Key Learning

* Practiced traversing a 2D array using nested loops.
* Learned how to compute a value for each row and maintain a running maximum.
* Reinforced the concept of using an accumulator (sum) and updating the answer during traversal.