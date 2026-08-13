# Q1. Print Matrix in Row Wave Form

## Problem Description

Given a matrix `A` of size `N x M`, print all the elements of the matrix in **row wave form**.

In row wave form:

- The first row is traversed from **left to right**.
- The second row is traversed from **right to left**.
- The third row is traversed from **left to right**.
- The fourth row is traversed from **right to left**.
- This pattern continues for all rows.

In other words, the direction of traversal alternates for every row.

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

Print the elements of the matrix in **row wave form**.

---

## Example Input

### Input 1

```text
N = 3
M = 4

1  2  3  4
5  6  7  8
9 10 11 12
```

### Input 2

```text
N = 4
M = 3

1  2  3
4  5  6
7  8  9
10 11 12
```

---

## Example Output

### Output 1

```text
1 2 3 4 8 7 6 5 9 10 11 12
```

### Output 2

```text
1 2 3 6 5 4 7 8 9 12 11 10
```

---

## Example Explanation

### Explanation 1

The matrix is traversed in row wave form.

Therefore, the output is:

```text
1 2 3 4 8 7 6 5 9 10 11 12
```

---

### Explanation 2

The matrix is traversed in row wave form.

Therefore, the output is:

```text
1 2 3 6 5 4 7 8 9 12 11 10
```

---
# Q2. Print Matrix in Column Wave Form

## Problem Description

Given a matrix `A` of size `N x M`, print all the elements of the matrix in **column wave form**.

In column wave form:

- The first column is traversed from **top to bottom**.
- The second column is traversed from **bottom to top**.
- The third column is traversed from **top to bottom**.
- The fourth column is traversed from **bottom to top**.
- This pattern continues for all columns.

In other words, the direction of traversal alternates for every column.

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

Print the elements of the matrix in **column wave form**.

---

## Example Input

### Input 1

```text
N = 3
M = 4

1  2  3  4
5  6  7  8
9 10 11 12
```

### Input 2

```text
N = 4
M = 3

1  2  3
4  5  6
7  8  9
10 11 12
```

---

## Example Output

### Output 1

```text
1 5 9 10 6 2 3 7 11 12 8 4
```

### Output 2

```text
1 4 7 10 11 8 5 2 3 6 9 12
```

---

## Example Explanation

### Explanation 1

The matrix is traversed in column wave form.

Therefore, the output is:

```text
1 5 9 10 6 2 3 7 11 12 8 4
```

---

### Explanation 2

The matrix is traversed in column wave form.

Therefore, the output is:

```text
1 4 7 10 11 8 5 2 3 6 9 12
```

---
# Q3. Maximum Element of a Matrix

## Problem Description

Given a 2D array `A` of size `N x M`, find and return the **maximum element** present in the matrix.

The maximum element is the element whose value is greater than or equal to every other element in the matrix.

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

Return or print the maximum element present in the matrix.

---

## Example Input

### Input 1

```text
N = 3
M = 4

12 65 89 74
22 44 12 30
10 12 97 19
```

### Input 2

```text
N = 2
M = 3

5 18 7
21 9 14
```

---

## Example Output

### Output 1

```text
Max element of matrix is 97
```

### Output 2

```text
Max element of matrix is 21
```

---

## Example Explanation

### Explanation 1

The maximum element in the matrix is `97`.

Therefore:

```text
Max element of matrix is 97
```

---

### Explanation 2

The maximum element in the matrix is `21`.

Therefore:

```text
Max element of matrix is 21
```

---
# Q4. Maximum of Every Row

## Problem Description

Given a matrix `A` of size `N x M`, find the **maximum element from every row** of the matrix.

Return an array containing the maximum element of each row.

The element at index `i` in the result array represents the maximum element present in row `i`.

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

Return or print an array containing the maximum element from every row.

---

## Example Input

### Input 1

```text
N = 5
M = 4

21 16 17 14
7  8  10 1
6  11 13 21
32 50 6  10
15 18 49 4
```

### Input 2

```text
N = 3
M = 3

5  2  8
10 7  4
3  9  6
```

---

## Example Output

### Output 1

```text
21 10 21 50 49
```

### Output 2

```text
8 10 9
```

---

## Example Explanation

### Explanation 1

The maximum elements of the rows are `21, 10, 21, 50, 49`.

Therefore, the output is:

```text
21 10 21 50 49
```

---

### Explanation 2

The maximum elements of the rows are `8, 10, 9`.

Therefore, the output is:

```text
8 10 9
```

---
# Q5. Reverse Each Row of a Matrix

## Problem Description

Given a matrix `A` of size `N x M`, reverse the elements of **each row** of the matrix.

The order of the rows should remain unchanged. Only the elements within each row should be reversed.

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

Print the matrix after reversing the elements of every row.

---

## Example Input

### Input 1

```text
N = 3
M = 4

1  2  3  4
5  6  7  8
9 10 11 12
```

### Input 2

```text
N = 2
M = 5

1  2  3  4  5
6  7  8  9 10
```

---

## Example Output

### Output 1

```text
4  3  2  1
8  7  6  5
12 11 10 9
```

### Output 2

```text
5  4  3  2  1
10 9  8  7  6
```

---

## Example Explanation

### Explanation 1

Each row is reversed individually.

Therefore, the final matrix is:

```text
4  3  2  1
8  7  6  5
12 11 10 9
```

---

### Explanation 2

Each row is reversed individually.

Therefore, the final matrix is:

```text
5  4  3  2  1
10 9  8  7  6
```

---
# Q6. Reverse Each Column of a Matrix

## Problem Description

Given a matrix `A` of size `N x M`, reverse the elements of **each column** of the matrix.

The order of the columns should remain unchanged. Only the elements within each column should be reversed.

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

Print the matrix after reversing the elements of every column.

---

## Example Input

### Input 1

```text
N = 3
M = 4

1  2  3  4
5  6  7  8
9 10 11 12
```

### Input 2

```text
N = 4
M = 3

1  2  3
4  5  6
7  8  9
10 11 12
```

---

## Example Output

### Output 1

```text
9 10 11 12
5  6  7  8
1  2  3  4
```

### Output 2

```text
10 11 12
7  8  9
4  5  6
1  2  3
```

---

## Example Explanation

### Explanation 1

Each column is reversed individually.

Therefore, the final matrix is:

```text
9  10 11 12
5  6  7  8
1  2  3  4
```

---

### Explanation 2

Each column is reversed individually.

Therefore, the final matrix is:

```text
10 11 12
7  8  9
4  5  6
1  2  3
```

---

