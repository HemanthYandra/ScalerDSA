# Q1. Good Subarrays Easy

## Problem Description

Given an integer array `A`, a subarray is called **good** if it satisfies **either** of the following conditions:

1. The length of the subarray is **even**, and the sum of its elements is **less than `B`**.
2. The length of the subarray is **odd**, and the sum of its elements is **greater than `B`**.

Your task is to find the **count of good subarrays** in the array.

---

## Problem Constraints

- `1 <= N <= 5 × 10^3`
- `1 <= A[i] <= 10^3`
- `1 <= B <= 10^7`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.

---

## Output Format

Return an integer denoting the **count of good subarrays**.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
B = 4
```

### Input 2

```text
A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65
```

---

## Example Output

### Output 1

```text
6
```

### Output 2

```text
36
```

---

## Example Explanation

### Explanation 1

For:

```text
A = [1, 2, 3, 4, 5]
B = 4
```

Good subarrays are:

#### Even length and sum < 4

```text
[1, 2]
```

#### Odd length and sum > 4

```text
[1, 2, 3]
[1, 2, 3, 4, 5]
[2, 3, 4]
[3, 4, 5]
[5]
```

Total good subarrays:

```text
6
```

---

### Explanation 2

For:

```text
A = [13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9]
B = 65
```

The total number of good subarrays is:

```text
36
```

---

