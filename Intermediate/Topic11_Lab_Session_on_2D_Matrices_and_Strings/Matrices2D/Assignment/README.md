# Q1. Transpose of a Square Matrix

## Problem Description

Given a **square matrix** `A` of size `N x N`, find and return its **transpose**.

The transpose of a matrix is obtained by converting its rows into columns and its columns into rows.

For every element:

```text
A[i][j]
```

the corresponding element in the transposed matrix is:

```text
A[j][i]
```

Since the matrix is square, the transpose can be performed **in-place** by swapping elements across the main diagonal.

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

Return the transpose of the given square matrix.

Print the transposed matrix with each row on a separate line.

---

## Example Input

### Input 1

```text
N = 3

1 2 3
4 5 6
7 8 9
```

### Input 2

```text
N = 4

1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
```

---

## Example Output

### Output 1

```text
1 4 7
2 5 8
3 6 9
```

### Output 2

```text
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
```

---

## Example Explanation

### Explanation 1

Given the square matrix:

```text
1 2 3
4 5 6
7 8 9
```

The transpose is obtained by converting rows into columns.

The first row:

```text
1 2 3
```

becomes the first column:

```text
1
2
3
```

Similarly:

```text
4 5 6
```

becomes:

```text
4
5
6
```

and:

```text
7 8 9
```

becomes:

```text
7
8
9
```

Therefore, the transposed matrix is:

```text
1 4 7
2 5 8
3 6 9
```

---

### Explanation 2

Given:

```text
1  2  3  4
5  6  7  8
9 10 11 12
13 14 15 16
```

After transposing, the rows and columns are exchanged:

```text
1  5  9 13
2  6 10 14
3  7 11 15
4  8 12 16
```

Therefore, the answer is:

```text
1 5 9 13
2 6 10 14
3 7 11 15
4 8 12 16
```

---

# Q2. Rotate Matrix

## Problem Description

You are given an `N x N` 2D matrix `A` representing an image.

Rotate the image by **90 degrees clockwise**.

You need to perform the rotation **in-place**.

> **Note:** If you use an additional array, you will only receive partial score.

---

## Problem Constraints

- `1 <= N <= 1000`

---

## Input Format

The first argument is a 2D matrix `A` of integers.

---

## Output Format

Return the 2D matrix after rotating it by `90` degrees clockwise.

---

## Example Input

### Input 1

```text
[
    [1, 2],
    [3, 4]
]
```

### Input 2

```text
[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

---

## Example Output

### Output 1

```text
[
    [3, 1],
    [4, 2]
]
```

### Output 2

```text
[
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
]
```

---

## Example Explanation

### Explanation 1

Given:

```text
[
    [1, 2],
    [3, 4]
]
```

After rotating the matrix by `90` degrees clockwise:

```text
1 goes to 2
2 goes to 4
4 goes to 3
3 goes to 1
```

Therefore, the rotated matrix is:

```text
[
    [3, 1],
    [4, 2]
]
```

---

### Explanation 2

Given:

```text
[
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

After rotating the matrix by `90` degrees clockwise:

```text
1 goes to 3
3 goes to 9
9 goes to 7
7 goes to 1

2 goes to 6
6 goes to 8
8 goes to 4
4 goes to 2
```

Therefore, the rotated matrix is:

```text
[
    [7, 4, 1],
    [8, 5, 2],
    [9, 6, 3]
]
```

---

