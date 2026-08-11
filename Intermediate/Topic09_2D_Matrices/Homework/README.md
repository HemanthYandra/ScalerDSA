# Q1. Count Increasing Triplets

## Problem Description

You are given an array **A** of **N** elements.

Find the number of triplets `(i, j, k)` such that:

```text
i < j < k
```

and

```text
A[i] < A[j] < A[k]
```

Return the count of such increasing triplets.

---

## Problem Constraints

- `1 <= N <= 10^3`
- `1 <= A[i] <= 10^9`

---

## Input Format

The first and only argument is an integer array **A**.

---

## Output Format

Return an integer representing the number of increasing triplets.

---

## Example Input

### Input 1

```text
A = [1, 2, 4, 3]
```

### Input 2

```text
A = [2, 1, 2, 3]
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

Array:

```text
A = [1, 2, 4, 3]
```

The triplets satisfying:

```text
i < j < k
A[i] < A[j] < A[k]
```

are:

```text
[1, 2, 4]
[1, 2, 3]
```

Count:

```text
2
```

---

### Explanation 2

Array:

```text
A = [2, 1, 2, 3]
```

The only valid triplet is:

```text
[1, 2, 3]
```

Count:

```text
1
```

---

# Q2. Matrix Scalar Product

## Problem Description

You are given a matrix **A** and an integer **B**.

Perform **scalar multiplication** of matrix **A** with integer **B**.

In scalar multiplication, every element of the matrix is multiplied by the given integer.

---

## Problem Constraints

- `1 <= A.size() <= 1000`
- `1 <= A[i].size() <= 1000`
- `1 <= A[i][j] <= 1000`
- `1 <= B <= 1000`

---

## Input Format

- First argument is a 2D integer array **A** representing the matrix.
- Second argument is an integer **B**.

---

## Output Format

Return the resulting 2D integer array after performing scalar multiplication.

---

## Example Input

### Input 1

```text
A = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]

B = 2
```

### Input 2

```text
A = [
  [1]
]

B = 5
```

---

## Example Output

### Output 1

```text
[
  [2, 4, 6],
  [8, 10, 12],
  [14, 16, 18]
]
```

### Output 2

```text
[
  [5]
]
```

---

## Example Explanation

### Explanation 1

Scalar multiplication:

```text
A * B

= [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
  ] * 2
```

Multiply every element by `2`:

```text
[
  [2*1, 2*2, 2*3],
  [2*4, 2*5, 2*6],
  [2*7, 2*8, 2*9]
]
```

Result:

```text
[
  [2, 4, 6],
  [8, 10, 12],
  [14, 16, 18]
]
```

---

### Explanation 2

Scalar multiplication:

```text
[
  [1]
] * 5
```

Result:

```text
[
  [5*1]
]
```

Output:

```text
[
  [5]
]
```

---

# Q3. Minor Diagonal Sum

## Problem Description

You are given an **N × N** integer matrix **A**.

Find and return the **sum of all the minor diagonal elements** of the matrix.

The **minor diagonal** of an **M × M** matrix **A** consists of all elements **A[i][j]** such that:

```text
i + j = M + 1
```

where `i` and `j` are **1-based indices**.

---

## Problem Constraints

- `1 <= N <= 10^3`
- `-1000 <= A[i][j] <= 1000`

---

## Input Format

The first and only argument is a 2D integer matrix **A**.

---

## Output Format

Return an integer denoting the sum of the **minor diagonal elements**.

---

## Example Input

### Input 1

```text
A = [
  [ 1, -2, -3 ],
  [ -4, 5, -6 ],
  [ -7, -8, 9 ]
]
```

### Input 2

```text
A = [
  [3, 2],
  [2, 3]
]
```

---

## Example Output

### Output 1

```text
-5
```

### Output 2

```text
4
```

---

## Example Explanation

### Explanation 1

The minor diagonal elements are:

```text
A[1][3] + A[2][2] + A[3][1]

= (-3) + 5 + (-7)

= -5
```

---

### Explanation 2

The minor diagonal elements are:

```text
A[1][2] + A[2][1]

= 2 + 2

= 4
```

---

# Q4. Principal Diagonal

## Problem Description

Given a matrix `A` of size `N x M`, print the elements present on its **principal diagonal**.

The principal diagonal starts from the **top-left corner** of the matrix and moves towards the **bottom-right corner**.

In other words, the principal diagonal contains elements where the row index and column index are the same:

```text
A[i][i]
```

Continue printing diagonal elements until either the last row or the last column is reached.

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

Print the elements of the principal diagonal separated by spaces.

---

## Example Input

### Input 1

```text
N = 3
M = 3

1 2 3
4 5 6
7 8 9
```

### Input 2

```text
N = 3
M = 4

1 2 3 4
5 6 7 8
9 10 11 12
```

---

## Example Output

### Output 1

```text
1 5 9
```

### Output 2

```text
1 6 11
```

---

## Example Explanation

### Explanation 1

Given the matrix:

```text
1 2 3
4 5 6
7 8 9
```

The principal diagonal starts from the top-left corner and moves diagonally towards the bottom-right:

```text
1
  5
    9
```

Therefore, the principal diagonal elements are:

```text
1 5 9
```

---

### Explanation 2

Given the matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

The principal diagonal elements are:

```text
1
   6
      11
```

Therefore, the output is:

```text
1 6 11
```

---

# Q5. Print All Anti-Diagonals

## Problem Description

Given a matrix `A` of size `N x M`, print all the **anti-diagonals** of the matrix.

An anti-diagonal is a sequence of elements that starts from a cell and moves:

- One row down.
- One column to the left.

In other words, from a cell `(i, j)`, the next element in the anti-diagonal is:

```text
(i + 1, j - 1)
```

To print all anti-diagonals:

1. Start from every element of the **0th row**.
2. Then start from every element of the **last column**, excluding the first element because it is already covered while processing the 0th row.
3. For each starting position, move down and left until the matrix boundary is reached.

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

Print all anti-diagonals of the matrix.

Each anti-diagonal should be printed on a separate line.

The elements within an anti-diagonal should be separated by spaces.

---

## Example Input

### Input 1

```text
N = 3
M = 3

1 2 3
4 5 6
7 8 9
```

### Input 2

```text
N = 3
M = 4

1 2 3 4
5 6 7 8
9 10 11 12
```

---

## Example Output

### Output 1

```text
1
2 4
3 5 7
6 8
9
```

### Output 2

```text
1
2 5
3 6 9
4 7 10
8 11
12
```

---

## Example Explanation

### Explanation 1

Given the matrix:

```text
1 2 3
4 5 6
7 8 9
```

Start from each element of the `0th` row.

Starting from `(0, 0)`:

```text
1
```

Starting from `(0, 1)`:

```text
2
  4
```

Starting from `(0, 2)`:

```text
3
  5
    7
```

Then start from the remaining elements of the last column.

Starting from `(1, 2)`:

```text
6
  8
```

Starting from `(2, 2)`:

```text
9
```

Therefore, all anti-diagonals are:

```text
1
2 4
3 5 7
6 8
9
```

---

### Explanation 2

Given the matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

Starting from the `0th` row:

```text
1
2 5
3 6 9
4 7 10
```

Then start from the remaining elements of the last column:

```text
8 11
12
```

Therefore, all anti-diagonals are:

```text
1
2 5
3 6 9
4 7 10
8 11
12
```

---

