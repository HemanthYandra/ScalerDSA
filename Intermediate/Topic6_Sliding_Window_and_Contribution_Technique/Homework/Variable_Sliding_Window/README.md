# Q1. Counting Subarrays Easy

## Problem Description

Given an array `A` of `N` non-negative integers and a non-negative integer `B`, count the number of **contiguous subarrays** whose sum is **less than `B`**.

> **Note:** You may assume that there is no integer overflow.

---

## Problem Constraints

- `1 <= N <= 5 × 10^3`
- `1 <= A[i] <= 1000`
- `1 <= B <= 10^7`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.

---

## Output Format

- Return a single integer denoting the number of subarrays whose sum is less than `B`.

---

## Example Input

### Input 1

```text
A = [2, 5, 6]
B = 10
```

### Input 2

```text
A = [1, 11, 2, 3, 15]
B = 10
```

---

## Example Output

### Output 1

```text
4
```

### Output 2

```text
4
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [2, 5, 6]
B = 10
```

The subarrays with sum less than `10` are:

```text
[2]     → Sum = 2
[5]     → Sum = 5
[6]     → Sum = 6
[2, 5]  → Sum = 7
```

There are **4** such subarrays.

Hence, the answer is:

```text
4
```

---

### Explanation 2

For the array:

```text
A = [1, 11, 2, 3, 15]
B = 10
```

The subarrays with sum less than `10` are:

```text
[1]     → Sum = 1
[2]     → Sum = 2
[3]     → Sum = 3
[2, 3]  → Sum = 5
```

There are **4** such subarrays.

Hence, the answer is:

```text
4
```

---

