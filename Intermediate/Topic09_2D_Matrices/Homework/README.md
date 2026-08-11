# Q1. Minor Diagonal Sum

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

# Q3. Count Increasing Triplets

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

