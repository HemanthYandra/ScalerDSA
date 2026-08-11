# Q1. Sum of All Subarrays

## Problem Description

You are given an integer array `A` of length `N`.

Your task is to find the **sum of the sums of all possible subarrays** of `A`.

A **subarray** is a contiguous part of an array that can be obtained by deleting zero or more elements from either the beginning or the end of the array.

A **subarray sum** is the sum of all the elements present in that subarray.

> **Note:** Be careful of integer overflow while performing calculations. Use appropriate data types.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^4`

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return a single integer denoting the **sum of all subarray sums**.

---

## Example Input

### Input 1

```text
A = [1, 2, 3]
```

### Input 2

```text
A = [2, 1, 3]
```

---

## Example Output

### Output 1

```text
20
```

### Output 2

```text
19
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [1, 2, 3]
```

All possible subarrays are:

```text
[1]
[2]
[3]
[1, 2]
[2, 3]
[1, 2, 3]
```

Their sums are:

```text
1 + 2 + 3 + 3 + 5 + 6 = 20
```

Hence, the answer is:

```text
20
```

---

### Explanation 2

For the array:

```text
A = [2, 1, 3]
```

All possible subarrays are:

```text
[2]
[1]
[3]
[2, 1]
[1, 3]
[2, 1, 3]
```

Their sums are:

```text
2 + 1 + 3 + 3 + 4 + 6 = 19
```

Hence, the answer is:

```text
19
```

---

