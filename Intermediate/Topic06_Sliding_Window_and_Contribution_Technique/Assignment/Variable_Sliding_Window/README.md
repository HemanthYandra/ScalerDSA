# Q1. Maximum Subarray Easy

## Problem Description

You are given an integer array `C` of size `A`.

Your task is to find a **subarray** (contiguous sequence of elements) whose sum is **maximum**, but the sum **must not exceed** `B`.

Return the maximum possible subarray sum that is less than or equal to `B`.

> **Note:** If no valid subarray exists, return `0`.

---

## Problem Constraints

- `1 <= A <= 10^3`
- `1 <= B <= 10^9`
- `1 <= C[i] <= 10^6`

---

## Input Format

- The first argument is an integer `A`, representing the size of the array.
- The second argument is an integer `B`.
- The third argument is an integer array `C`.

---

## Output Format

- Return a single integer denoting the **maximum subarray sum** that does not exceed `B`.

---

## Example Input

### Input 1

```text
A = 5
B = 12
C = [2, 1, 3, 4, 5]
```

### Input 2

```text
A = 3
B = 1
C = [2, 2, 2]
```

---

## Example Output

### Output 1

```text
12
```

### Output 2

```text
0
```

---

## Example Explanation

### Explanation 1

For the array:

```text
C = [2, 1, 3, 4, 5]
B = 12
```

The subarray:

```text
[3, 4, 5]
```

has a sum of:

```text
3 + 4 + 5 = 12
```

Since `12` does not exceed `B` and is the maximum possible valid sum, the answer is:

```text
12
```

---

### Explanation 2

For the array:

```text
C = [2, 2, 2]
B = 1
```

Every element is greater than `B`, so no valid subarray can be selected.

Hence, the answer is:

```text
0
```

---

