# Q1. Arithmetic Progression?

## Problem Description

Given an integer array `A` of size `N`, determine whether its elements can be **rearranged** to form an **arithmetic progression**.

A sequence is called an **arithmetic progression (AP)** if the difference between every pair of consecutive elements is the same.

- Return `1` if the array can be rearranged to form an arithmetic progression.
- Otherwise, return `0`.

---

## Problem Constraints

- `2 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`

---

## Input Format

- The first and only argument is an integer array `A` of size `N`.

---

## Output Format

- Return `1` if the array can be rearranged to form an arithmetic progression.
- Otherwise, return `0`.

---

## Example Input

### Input 1

```text
A = [3, 5, 1]
```

### Input 2

```text
A = [2, 4, 1]
```

---

## Example Output

### Output 1

```text
1
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
A = [3, 5, 1]
```

After rearranging:

```text
[1, 3, 5]
```

The consecutive differences are:

```text
3 - 1 = 2
5 - 3 = 2
```

Since all consecutive differences are equal, the array can be rearranged into an arithmetic progression.

Hence, the answer is:

```text
1
```

---

### Explanation 2

For the array:

```text
A = [2, 4, 1]
```

No rearrangement of the array results in equal consecutive differences.

Hence, the answer is:

```text
0
```

---

