# Q1. Equilibrium Index of an Array

## Problem Description

You are given an array `A` of integers of size `N`.

Your task is to find the **equilibrium index** of the given array.

The equilibrium index of an array is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

If there are no elements at lower indices or at higher indices, then the corresponding sum is considered to be `0`.

> **Note:**
>
> - Array indexing starts from `0`.
> - If there is no equilibrium index, return `-1`.
> - If there are multiple equilibrium indices, return the **smallest index**.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`

---

## Input Format

- The first argument is an integer array `A`.

---

## Output Format

- Return the equilibrium index of the given array.
- If no such index exists, return `-1`.

---

## Example Input

### Input 1

```text
A = [-7, 1, 5, 2, -4, 3, 0]
```

### Input 2

```text
A = [1, 2, 3]
```

---

## Example Output

### Output 1

```text
3
```

### Output 2

```text
-1
```

---

## Example Explanation

### Explanation 1

| Index | Left Sum | Right Sum |
|------:|---------:|----------:|
| 0 | 0 | 7 |
| 1 | -7 | 6 |
| 2 | -6 | 1 |
| 3 | -1 | -1 |
| 4 | 1 | 3 |
| 5 | -3 | 0 |
| 6 | 0 | 0 |

At index `3`:

```text
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
-7 + 1 + 5 = -4 + 3 + 0
-1 = -1
```

Hence, the equilibrium index is:

```text
3
```

### Explanation 2

| Index | Left Sum | Right Sum |
|------:|---------:|----------:|
| 0 | 0 | 5 |
| 1 | 1 | 3 |
| 2 | 3 | 0 |

There is no index where the left sum equals the right sum.

Hence, the answer is:

```text
-1
```

---

# Q2. In-place Prefix Sum

## Problem Description

Given an array `A` of `N` integers, construct the prefix sum of the array **in-place**, i.e., modify the given array itself to store its prefix sums.

The prefix sum at index `i` is the sum of all elements from index `0` to `i`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^3`

---

## Input Format

- The only argument is an integer array `A`.

---

## Output Format

Return the modified array containing the prefix sums.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
```

### Input 2

```text
A = [4, 3, 2]
```

---

## Example Output

### Output 1

```text
[1, 3, 6, 10, 15]
```

### Output 2

```text
[4, 7, 9]
```

---

## Example Explanation

### Explanation 1

The prefix sum array of:

```text
[1, 2, 3, 4, 5]
```

is:

```text
[1, 3, 6, 10, 15]
```

### Explanation 2

The prefix sum array of:

```text
[4, 3, 2]
```

is:

```text
[4, 7, 9]
```