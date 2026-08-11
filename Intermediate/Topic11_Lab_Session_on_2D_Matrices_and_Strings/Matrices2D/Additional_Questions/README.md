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

Given the matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

Traverse the rows alternately.

### Row 0

Row `0` is even, so traverse from **left to right**:

```text
1 2 3 4
```

### Row 1

Row `1` is odd, so traverse from **right to left**:

```text
8 7 6 5
```

### Row 2

Row `2` is even, so traverse from **left to right**:

```text
9 10 11 12
```

Therefore, the row wave form is:

```text
1 2 3 4 8 7 6 5 9 10 11 12
```

---

### Explanation 2

Given the matrix:

```text
1  2  3
4  5  6
7  8  9
10 11 12
```

### Row 0

Traverse from **left to right**:

```text
1 2 3
```

### Row 1

Traverse from **right to left**:

```text
6 5 4
```

### Row 2

Traverse from **left to right**:

```text
7 8 9
```

### Row 3

Traverse from **right to left**:

```text
12 11 10
```

Therefore, the row wave form is:

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

Given the matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

Traverse the columns alternately.

### Column 0

Column `0` is even, so traverse from **top to bottom**:

```text
1 5 9
```

### Column 1

Column `1` is odd, so traverse from **bottom to top**:

```text
10 6 2
```

### Column 2

Column `2` is even, so traverse from **top to bottom**:

```text
3 7 11
```

### Column 3

Column `3` is odd, so traverse from **bottom to top**:

```text
12 8 4
```

Therefore, the column wave form is:

```text
1 5 9 10 6 2 3 7 11 12 8 4
```

---

### Explanation 2

Given the matrix:

```text
1  2  3
4  5  6
7  8  9
10 11 12
```

### Column 0

Column `0` is even, so traverse from **top to bottom**:

```text
1 4 7 10
```

### Column 1

Column `1` is odd, so traverse from **bottom to top**:

```text
11 8 5 2
```

### Column 2

Column `2` is even, so traverse from **top to bottom**:

```text
3 6 9 12
```

Therefore, the column wave form is:

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

Given the matrix:

```text
12 65 89 74
22 44 12 30
10 12 97 19
```

Traverse every element of the matrix and keep track of the maximum value.

The largest values encountered include:

```text
89
97
```

Since `97` is greater than every other element, the maximum element is:

```text
97
```

Therefore:

```text
Max element of matrix is 97
```

---

### Explanation 2

Given the matrix:

```text
5 18 7
21 9 14
```

Traverse every element and compare it with the current maximum.

The largest element is:

```text
21
```

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

Given the matrix:

```text
21 16 17 14
7  8  10 1
6  11 13 21
32 50 6  10
15 18 49 4
```

Find the maximum element from each row.

### Row 0

```text
21 16 17 14
```

Maximum:

```text
21
```

### Row 1

```text
7 8 10 1
```

Maximum:

```text
10
```

### Row 2

```text
6 11 13 21
```

Maximum:

```text
21
```

### Row 3

```text
32 50 6 10
```

Maximum:

```text
50
```

### Row 4

```text
15 18 49 4
```

Maximum:

```text
49
```

Therefore, the result array is:

```text
21 10 21 50 49
```

---

### Explanation 2

Given the matrix:

```text
5  2  8
10 7  4
3  9  6
```

Find the maximum element from each row.

### Row 0

```text
5 2 8
```

Maximum:

```text
8
```

### Row 1

```text
10 7 4
```

Maximum:

```text
10
```

### Row 2

```text
3 9 6
```

Maximum:

```text
9
```

Therefore, the result array is:

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

Given the matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

Reverse the elements of each row individually.

### Row 0

```text
1 2 3 4
```

After reversing:

```text
4 3 2 1
```

### Row 1

```text
5 6 7 8
```

After reversing:

```text
8 7 6 5
```

### Row 2

```text
9 10 11 12
```

After reversing:

```text
12 11 10 9
```

Therefore, the final matrix is:

```text
4  3  2  1
8  7  6  5
12 11 10 9
```

---

### Explanation 2

Given the matrix:

```text
1  2  3  4  5
6  7  8  9 10
```

Reverse each row independently.

### Row 0

```text
1 2 3 4 5
```

becomes:

```text
5 4 3 2 1
```

### Row 1

```text
6 7 8 9 10
```

becomes:

```text
10 9 8 7 6
```

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

Given the matrix:

```text
1  2  3  4
5  6  7  8
9 10 11 12
```

Reverse the elements of each column individually.

### Column 0

```text
1
5
9
```

After reversing:

```text
9
5
1
```

### Column 1

```text
2
6
10
```

After reversing:

```text
10
6
2
```

### Column 2

```text
3
7
11
```

After reversing:

```text
11
7
3
```

### Column 3

```text
4
8
12
```

After reversing:

```text
12
8
4
```

Therefore, the final matrix is:

```text
9  10 11 12
5  6  7  8
1  2  3  4
```

---

### Explanation 2

Given the matrix:

```text
1  2  3
4  5  6
7  8  9
10 11 12
```

Reverse each column independently.

### Column 0

```text
1
4
7
10
```

becomes:

```text
10
7
4
1
```

### Column 1

```text
2
5
8
11
```

becomes:

```text
11
8
5
2
```

### Column 2

```text
3
6
9
12
```

becomes:

```text
12
9
6
3
```

Therefore, the final matrix is:

```text
10 11 12
7  8  9
4  5  6
1  2  3
```

---

