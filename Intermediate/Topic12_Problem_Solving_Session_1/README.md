# Q1. Search in a Row-Wise and Column-Wise Sorted Matrix

## Problem Description

Given an `N x M` matrix `A`, where **each row and each column is sorted in increasing order**, and an integer `B`, search for the element `B` in the matrix.

If the element is found, return `true`. Otherwise, return `false`.

### Note

- Every row is sorted from left to right.
- Every column is sorted from top to bottom.

---

## Problem Constraints

- `1 <= N, M <= 1000`
- `-10^9 <= A[i][j], B <= 10^9`

---

## Input Format

The first line contains two integers:

```text
N M
```

The next `N` lines contain `M` integers representing the matrix.

The last line contains the integer `B`, representing the element to search.

---

## Output Format

Return:

```text
true
```

if `B` is present in the matrix.

Otherwise, return:

```text
false
```

---

## Example Input

### Input 1

```text
N = 4
M = 4

1  4  7  11
2  5  8  12
3  6  9  16
10 13 14 17

B = 9
```

### Input 2

```text
N = 4
M = 4

1  4  7  11
2  5  8  12
3  6  9  16
10 13 14 17

B = 15
```

---

## Example Output

### Output 1

```text
true
```

### Output 2

```text
false
```

---

## Example Explanation

### Explanation 1

The element `9` is present in the matrix at row `2` and column `2`.

Therefore, the output is:

```text
true
```

### Explanation 2

The element `15` is not present anywhere in the matrix.

Therefore, the output is:

```text
false
```