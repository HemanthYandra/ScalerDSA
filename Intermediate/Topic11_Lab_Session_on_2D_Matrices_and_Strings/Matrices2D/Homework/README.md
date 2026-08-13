# Q1. Transpose of a Rectangular Matrix

## Problem Description

Given a **rectangular matrix** `A` of size `N x M`, find and return its **transpose**.

The transpose of a matrix is obtained by converting its rows into columns and its columns into rows.

For every element:

```text
A[i][j]
```

the corresponding element in the transposed matrix is:

```text
A[j][i]
```

If the original matrix has `N` rows and `M` columns, then its transpose will have:

```text
M rows and N columns
```

Unlike a square matrix, a rectangular matrix cannot generally be transposed in-place using simple element swaps. Therefore, create a new matrix of size `M x N` to store the transpose.

---

## Problem Constraints

- `1 <= N, M <= 1000`
- `-10^9 <= A[i][j] <= 10^9`

---

## Input Format

The first line contains two integers:

```text
N M
```

where:

- `N` is the number of rows.
- `M` is the number of columns.

The next `N` lines contain `M` integers each, representing the matrix elements.

---

## Output Format

Return the transpose of the given rectangular matrix.

Print the transposed matrix with each row on a separate line.

---

## Example Input

### Input 1

```text
N = 3
M = 4

1 2 3 4
5 6 7 8
9 10 11 12
```

### Input 2

```text
N = 2
M = 3

1 2 3
4 5 6
```

---

## Example Output

### Output 1

```text
1 5 9
2 6 10
3 7 11
4 8 12
```

### Output 2

```text
1 4
2 5
3 6
```

---

## Example Explanation

### Explanation 1

Given the `3 x 4` matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

The original matrix has:

```text
3 rows
4 columns
```

Therefore, its transpose will have:

```text
4 rows
3 columns
```

Each element at position `(i, j)` moves to position `(j, i)`.

For example:

```text
A[0][0] = 1  →  result[0][0] = 1
A[0][1] = 2  →  result[1][0] = 2
A[0][2] = 3  →  result[2][0] = 3
A[0][3] = 4  →  result[3][0] = 4
```

Similarly, the remaining elements are placed in their transposed positions.

Therefore, the transpose is:

```text
1  5  9
2  6 10
3  7 11
4  8 12
```

---

### Explanation 2

Given the `2 x 3` matrix:

```text
1 2 3
4 5 6
```

The original matrix has:

```text
2 rows
3 columns
```

Therefore, the transpose will have:

```text
3 rows
2 columns
```

The rows become columns:

```text
1 4
2 5
3 6
```

Hence, the answer is:

```text
1 4
2 5
3 6
```

---


# Q2. Rotate Matrix 90 Degrees Anti-Clockwise

## Problem Description

You are given an `N x N` 2D matrix `A` representing an image.

Rotate the image by **90 degrees anti-clockwise**.

You need to perform the rotation **in-place**.

> **Note:** You should not use an additional matrix. The rotation must be performed by modifying the given matrix itself.

---

## Problem Constraints

- `1 <= N <= 1000`
- `-10^9 <= A[i][j] <= 10^9`

---

## Input Format

The first line contains an integer `N`, representing the size of the square matrix.

The next `N` lines contain `N` integers each, representing the matrix elements.

---

## Output Format

Print the matrix after rotating it by `90` degrees anti-clockwise.

---

## Example Input

### Input 1

```text
N = 2

1 2
3 4
```

### Input 2

```text
N = 3

1 2 3
4 5 6
7 8 9
```

---

## Example Output

### Output 1

```text
3 4
1 2
```

### Output 2

```text
3 6 9
2 5 8
1 4 7
```

---

## Example Explanation

### Explanation 1

The matrix after a 90 degree anti-clockwise rotation is:

```text
3 4
1 2
```

Therefore, the output is:

```text
3 4
1 2
```

### Explanation 2

The matrix after a 90 degree anti-clockwise rotation is:

```text
3 6 9
2 5 8
1 4 7
```

Therefore, the output is:

```text
3 6 9
2 5 8
1 4 7
```

---

