# Q1. Search in a Row-Wise and Column-Wise Sorted Matrix

## Problem Description
Given a matrix `A` of size `N × M`, where each row and each column is sorted in ascending order, and an integer `B`, determine whether `B` exists in the matrix.

Return `true` if the element is present; otherwise, return `false`.

## Problem Constraints
- `1 <= N, M <= 1000`
- `-10^9 <= A[i][j], B <= 10^9`
- Each row of the matrix is sorted in ascending order.
- Each column of the matrix is sorted in ascending order.

## Input Format
- The first line contains an integer `N`, representing the number of rows.
- The second line contains an integer `M`, representing the number of columns.
- The next `N` lines contain `M` integers each, representing the matrix elements.
- The last line contains an integer `B`, the element to search for.

## Output Format
- Print `true` if `B` is present in the matrix.
- Print `false` if `B` is not present in the matrix.

## Example

### Input 1
```
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

B = 2
```

### Output 1
```
true
```

### Input 2
```
A = [[1, 2],
     [3, 3]]

B = 7
```

### Output 2
```
false
```

## Example Explanation

### Explanation 1
The element `2` is present in the matrix at row `0`, column `1`. Therefore, the output is `true`.

### Explanation 2
The element `7` is not present in the matrix. Therefore, the output is `false`.

---

# Q2. Search in a Row-Wise and Column-Wise Sorted Matrix - 1

## Problem Description

Given a matrix of integers `A` of size `N × M` and an integer `B`.

In the given matrix, every row and column is sorted in non-decreasing order. Find and return the position of `B` in the matrix in the following form:

- If `A[i][j] = B`, return `i * 1009 + j`.
- If `B` is not present, return `-1`.

---

## Notes

- Rows are numbered from top to bottom and columns are numbered from left to right.
- If there are multiple occurrences of `B` in `A`, return the smallest value of `i * 1009 + j`.
- The expected time complexity is linear.
- Use 1-based indexing.

---

## Problem Constraints

- `1 <= N, M <= 1000`
- `-100000 <= A[i] <= 100000`
- `-100000 <= B <= 100000`

---

## Input Format

The first argument is the integer matrix `A`.

The second argument is the integer `B`.

---

## Output Format

Return the position of `B`.

If `B` is not present in the matrix, return `-1`.

---

## Example Input

### Input 1

```text
A = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

B = 2
```

### Input 2

```text
A = [[1, 2],
     [3, 3]]

B = 3
```

---

## Example Output

### Output 1

```text
1011
```

### Output 2

```text
2019
```

---

## Example Explanation

### Explanation 1

```text
A[1][2] = 2
1 * 1009 + 2 = 1011
```

### Explanation 2

```text
A[2][1] = 3
2 * 1009 + 1 = 2019

A[2][2] = 3
2 * 1009 + 2 = 2020
```

The minimum value is `2019`.

---

# Q3. Sum of All Submatrices

## Problem Description

Given a 2D Matrix `A` of dimensions `N × N`, return the sum of all possible submatrices.

## Problem Constraints

- `1 <= N <= 30`
- `0 <= A[i][j] <= 10`

## Input Format

Single argument representing a 2-D array `A` of size `N × N`.

## Output Format

Return an integer denoting the sum of all possible submatrices.

## Example Input

### Input 1
```
A = [ [1, 1],
      [1, 1] ]
```

### Input 2
```
A = [ [1, 2],
      [3, 4] ]
```

## Example Output

### Output 1
```
16
```

### Output 2
```
40
```

## Example Explanation

### Example 1

```
Number of submatrices with 1 element = 4
Sum = 4 × 1 = 4

Number of submatrices with 2 elements = 4
Sum = 4 × 2 = 8

Number of submatrices with 3 elements = 0

Number of submatrices with 4 elements = 1
Sum = 1 × 4 = 4

Total Sum = 4 + 8 + 4 = 16
```

### Example 2

```
The submatrices are:
[1], [2], [3], [4]
[1, 2], [3, 4]
[1, 3], [2, 4]
[[1, 2], [3, 4]]

Total sum = 40
```

---

# Q4. First Missing Natural Number

## Problem Description

You are given an **unsorted array of integers** `A` of length `N`.

Your task is to find the **first missing natural number** from the array.

A **natural number** is a positive integer starting from `1`.

The **first missing natural number** is the smallest positive integer that does not appear in the given array.

> **Note:** The array may contain negative numbers, `0`, duplicate values, and positive numbers in any order.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`

---

## Input Format

The first and only argument is an integer array `A`.

---

## Output Format

Return a single integer denoting the **first missing natural number**.

---

## Example Input

### Input 1

```text
A = [3, -2, 1, 2, 7]
```

### Input 2

```text
A = [-9, 2, 6, 4, -8, 1, 3]
```

### Input 3

```text
A = [-2, 4, -1, -6, 3, 7, 8, 4, -3]
```

---

## Example Output

### Output 1

```text
4
```

### Output 2

```text
5
```

### Output 3

```text
1
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [3, -2, 1, 2, 7]
```

The natural numbers `1`, `2`, and `3` are present, but `4` is missing.

Hence, the answer is:

```text
4
```

### Explanation 2

For the array:

```text
A = [-9, 2, 6, 4, -8, 1, 3]
```

The natural numbers `1`, `2`, `3`, and `4` are present, but `5` is missing.

Hence, the answer is:

```text
5
```

### Explanation 3

For the array:

```text
A = [-2, 4, -1, -6, 3, 7, 8, 4, -3]
```

The number `1` is not present in the array.

Hence, the first missing natural number is:

```text
1
```

---

