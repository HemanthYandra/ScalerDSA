# Q1. Matrix Addition

## Problem Description

Given two **2D integer arrays** `A` and `B` of the same dimensions, return a new **2D integer array** representing the sum of the two matrices.

Each element in the resulting matrix should be calculated as:

```text
result[i][j] = A[i][j] + B[i][j]
```

---

## Problem Constraints

```text
1 <= A.length, B.length <= 1000

1 <= A[0].length, B[0].length <= 1000

1 <= A[i][j], B[i][j] <= 1000
```

---

## Input Format

```text
The first argument is a 2D integer array A.

The second argument is a 2D integer array B.
```

---

## Output Format

```text
Return a 2D integer array representing the sum of matrices A and B.
```

---

## Example Input

### Input 1

```text
A = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9}
        };

B = {
        {9, 8, 7},
        {6, 5, 4},
        {3, 2, 1}
        };
```

---

## Example Output

### Output 1

```text
{
        {10, 10, 10},
        {10, 10, 10},
        {10, 10, 10}
        }
```

---

## Example Explanation

### Explanation 1

```text
The corresponding elements of the two matrices are added together.

Result = {
    {1 + 9, 2 + 8, 3 + 7},
    {4 + 6, 5 + 5, 6 + 4},
    {7 + 3, 8 + 2, 9 + 1}
}

= {
    {10, 10, 10},
    {10, 10, 10},
    {10, 10, 10}
}
```

---

# Q2. Main Diagonal Sum

## Problem Description

You are given an **N × N** integer matrix **A**.

Find and return the **sum of all the main diagonal elements** of the matrix.

The **main diagonal** of a matrix consists of all elements **A[i][j]** such that **i = j**.

---

## Problem Constraints

- `1 <= N <= 10^3`
- `-1000 <= A[i][j] <= 1000`

---

## Input Format

- The first line contains two integers **R** and **C**, representing the number of rows and columns.
- The next **R × C** integers represent the matrix elements in **row-wise** order.

---

## Output Format

Return an integer representing the **sum of the main diagonal elements**.

---

## Example Input

### Input 1

```text
3 3
1 -2 -3
-4 5 -6
-7 -8 9
```

### Input 2

```text
2 2
3 2
2 3
```

---

## Example Output

### Output 1

```text
15
```

### Output 2

```text
6
```

---

## Example Explanation

### Explanation 1

The main diagonal elements are:

```text
A[0][0] = 1
A[1][1] = 5
A[2][2] = 9
```

Sum:

```text
1 + 5 + 9 = 15
```

### Explanation 2

The main diagonal elements are:

```text
A[0][0] = 3
A[1][1] = 3
```

Sum:

```text
3 + 3 = 6
```

---

# Q3. Anti Diagonals

## Problem Description

Given an **N × N** square matrix **A**, return a 2D array containing all of its **anti-diagonals**.

An **anti-diagonal** consists of all elements having the same value of **(row + column)**.

The output should contain **(2 × N - 1)** rows and **N** columns.

If an anti-diagonal contains fewer than **N** elements, fill the remaining positions with **0**.

---

## Problem Constraints

- `1 <= N <= 1000`
- `1 <= A[i][j] <= 10^9`

---

## Input Format

The only argument is a 2D integer array **A** of size **N × N**.

---

## Output Format

Return a 2D integer array of size **(2 × N - 1) × N**, representing the anti-diagonals of the matrix.

The unused positions in each row should be filled with **0**.

---

## Example Input

### Input 1

```text
A = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

### Input 2

```text
A = [
  [1, 2],
  [3, 4]
]
```

---

## Example Output

### Output 1

```text
[
  [1, 0, 0],
  [2, 4, 0],
  [3, 5, 7],
  [6, 8, 0],
  [9, 0, 0]
]
```

### Output 2

```text
[
  [1, 0],
  [2, 3],
  [4, 0]
]
```

---

## Example Explanation

### Explanation 1

The anti-diagonals of the matrix are:

- `[1]`
- `[2, 4]`
- `[3, 5, 7]`
- `[6, 8]`
- `[9]`

Each row is padded with `0` until its length becomes **N**.

### Explanation 2

The anti-diagonals of the matrix are:

- `[1]`
- `[2, 3]`
- `[4]`

Each row is padded with `0` until its length becomes **N**.

---

# Q4. Row Sum

## Problem Description

You are given a 2D integer matrix **A**.

Your task is to compute the **sum of elements in each row** and return a 1D array where each element represents the sum of the corresponding row.

---

## Problem Constraints

- `1 <= A.size() <= 10^3`
- `1 <= A[i].size() <= 10^3`
- `1 <= A[i][j] <= 10^3`

---

## Input Format

The first and only argument is a 2D integer array **A**.

---

## Output Format

Return a 1D integer array containing the sum of each row.

---

## Example Input

### Input 1

```text
A = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 2, 3, 4]
]
```

---

## Example Output

### Output 1

```text
[10, 26, 18]
```

---

## Example Explanation

### Explanation 1

```text
Row 1 = 1 + 2 + 3 + 4 = 10
Row 2 = 5 + 6 + 7 + 8 = 26
Row 3 = 9 + 2 + 3 + 4 = 18
```

Hence, the output is:

```text
[10, 26, 18]
```

---

# Q5. Column Sum

## Problem Description

You are given a 2D integer matrix **A**.

Your task is to compute the **sum of elements in each column** and return a 1D array where each element represents the sum of the corresponding column.

---

## Problem Constraints

- `1 <= A.size() <= 10^3`
- `1 <= A[i].size() <= 10^3`
- `1 <= A[i][j] <= 10^3`

---

## Input Format

The first and only argument is a 2D integer array **A**.

---

## Output Format

Return a 1D integer array containing the sum of each column.

---

## Example Input

### Input 1

```text
A = [
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9, 2, 3, 4]
]
```

---

## Example Output

### Output 1

```text
[15, 10, 13, 16]
```

---

## Example Explanation

### Explanation 1

```text
Column 1 = 1 + 5 + 9 = 15
Column 2 = 2 + 6 + 2 = 10
Column 3 = 3 + 7 + 3 = 13
Column 4 = 4 + 8 + 4 = 16
```

Hence, the output is:

```text
[15, 10, 13, 16]
```

---

# Q6. Row to Column Zero

## Problem Description

You are given a 2D integer matrix **A**.

If any element `A[i][j]` is equal to **0**, make **every element in the `i`th row** and **every element in the `j`th column** equal to **0**.

Return the modified matrix after performing the required operations.

---

## Problem Constraints

- `1 <= A.size() <= 10^3`
- `1 <= A[i].size() <= 10^3`
- `0 <= A[i][j] <= 10^3`

---

## Input Format

The first and only argument is a 2D integer matrix **A**.

---

## Output Format

Return the modified 2D integer matrix after performing the required operations.

---

## Example Input

### Input 1

```text
A = [
  [1, 2, 3, 4],
  [5, 6, 7, 0],
  [9, 2, 0, 4]
]
```

---

## Example Output

### Output 1

```text
[
  [1, 2, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 0, 0]
]
```

---

## Example Explanation

### Explanation 1

The elements `A[1][3]` and `A[2][2]` are `0`.

Therefore:

- Set the entire **2nd row** to `0`.
- Set the entire **3rd row** to `0`.
- Set the entire **3rd column** to `0`.
- Set the entire **4th column** to `0`.

The resulting matrix is:

```text
[
  [1, 2, 0, 0],
  [0, 0, 0, 0],
  [0, 0, 0, 0]
]
```

---

