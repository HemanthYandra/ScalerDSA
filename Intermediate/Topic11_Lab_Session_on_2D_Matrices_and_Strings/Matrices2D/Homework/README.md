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

## Approach

Use an additional matrix to store the transpose.

1. Let the original matrix have `N` rows and `M` columns.
2. Create a new matrix `result` of size `M x N`.
3. Traverse every element of the original matrix.
4. For every element at position `(i, j)`, place it at position `(j, i)` in the result matrix.
5. After all elements are processed, the result matrix is the transpose.
6. Return the result matrix.

---

## Algorithm

```text
1. Read N and M.
2. Create a result matrix of size M x N.
3. For i from 0 to N - 1:
   a. For j from 0 to M - 1:
      i. result[j][i] = A[i][j]
4. Return result.
```

---

## Example Walkthrough

Consider:

```text
1 2 3
4 5 6
```

Create a result matrix of size `3 x 2`:

```text
0 0
0 0
0 0
```

Now place each element at its transposed position.

### Step 1

```text
A[0][0] = 1
```

Place it at:

```text
result[0][0] = 1
```

Result:

```text
1 0
0 0
0 0
```

### Step 2

```text
A[0][1] = 2
```

Place it at:

```text
result[1][0] = 2
```

Result:

```text
1 0
2 0
0 0
```

### Step 3

```text
A[0][2] = 3
```

Place it at:

```text
result[2][0] = 3
```

Result:

```text
1 0
2 0
3 0
```

### Step 4

Process the second row:

```text
A[1][0] = 4  →  result[0][1] = 4
A[1][1] = 5  →  result[1][1] = 5
A[1][2] = 6  →  result[2][1] = 6
```

Final result:

```text
1 4
2 5
3 6
```

---

## Complexity Analysis

### Time Complexity

Every element of the `N x M` matrix is visited exactly once.

Therefore:

```text
O(N × M)
```

### Space Complexity

A new matrix of size `M x N` is created to store the transpose.

Therefore:

```text
O(N × M)
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

Given the matrix:

```text
1 2
3 4
```

First, transpose the matrix:

```text
1 3
2 4
```

Then, reverse the order of the rows:

```text
3 4
1 2
```

Therefore, after rotating the matrix by `90` degrees anti-clockwise, the result is:

```text
3 4
1 2
```

---

### Explanation 2

Given the matrix:

```text
1 2 3
4 5 6
7 8 9
```

### Step 1: Transpose the Matrix

The matrix becomes:

```text
1 4 7
2 5 8
3 6 9
```

### Step 2: Reverse the Order of Rows

Reverse the order of the rows:

```text
3 6 9
2 5 8
1 4 7
```

Therefore, after rotating the matrix by `90` degrees anti-clockwise, the result is:

```text
3 6 9
2 5 8
1 4 7
```

---

