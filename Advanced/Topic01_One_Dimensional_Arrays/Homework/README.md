# Q1. Print Subarray of Max Subarray Sum

## Problem Description

Given an array `A` of length `N`, your task is to find the contiguous subarray that has the maximum possible sum, and return that subarray itself (not just the sum).

In other words, among all possible subarrays of `A`, determine the one that yields the highest sum and return the elements of that subarray in order.

If there are multiple subarrays with the same maximum sum, return any one of them.

---

## Problem Constraints

- `1 <= N <= 10^6`
- `-1000 <= A[i] <= 1000`

---

## Input Format

The first argument is an integer `N`, denoting the size of the array.

The second line contains `N` integers representing the array `A`.

---

## Output Format

Return an integer array denoting the contiguous subarray with the maximum possible sum.

---

## Example Input

### Input 1

```text
N = 5

A = [1, 2, 3, 4, -10]
```

### Input 2

```text
N = 9

A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

---

## Example Output

### Output 1

```text
[1, 2, 3, 4]
```

### Output 2

```text
[4, -1, 2, 1]
```

---

## Example Explanation

### Explanation 1

Among all contiguous subarrays of `A`, the subarray:

```text
[1, 2, 3, 4]
```

has the maximum possible sum of `10`.

Therefore, the answer is:

```text
[1, 2, 3, 4]
```

### Explanation 2

Among all contiguous subarrays of `A`, the subarray:

```text
[4, -1, 2, 1]
```

has the maximum possible sum of `6`.

Therefore, the answer is:

```text
[4, -1, 2, 1]
```

---

