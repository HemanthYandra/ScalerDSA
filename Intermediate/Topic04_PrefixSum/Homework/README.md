# Q1. Equilibrium Index of an Array

## Problem Description

You are given an array `A` of integers of size `N`.

Your task is to find the **equilibrium index** of the given array.

The equilibrium index of an array is an index such that the sum of elements at lower indices is equal to the sum of elements at higher indices.

If there are no elements at lower indices or at higher indices, then the corresponding sum is considered to be `0`.

> **Note:**
>
> - Array indexing starts from `0`.
> - If there is no equilibrium index, return `-1`.
> - If there are multiple equilibrium indices, return the **smallest index**.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`

---

## Input Format

- The first argument is an integer array `A`.

---

## Output Format

- Return the equilibrium index of the given array.
- If no such index exists, return `-1`.

---

## Example Input

### Input 1

```text
A = [-7, 1, 5, 2, -4, 3, 0]
```

### Input 2

```text
A = [1, 2, 3]
```

---

## Example Output

### Output 1

```text
3
```

### Output 2

```text
-1
```

---

## Example Explanation

### Explanation 1

| Index | Left Sum | Right Sum |
|------:|---------:|----------:|
| 0 | 0 | 7 |
| 1 | -7 | 6 |
| 2 | -6 | 1 |
| 3 | -1 | -1 |
| 4 | 1 | 3 |
| 5 | -3 | 0 |
| 6 | 0 | 0 |

At index `3`:

```text
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
-7 + 1 + 5 = -4 + 3 + 0
-1 = -1
```

Hence, the equilibrium index is:

```text
3
```

### Explanation 2

| Index | Left Sum | Right Sum |
|------:|---------:|----------:|
| 0 | 0 | 5 |
| 1 | 1 | 3 |
| 2 | 3 | 0 |

There is no index where the left sum equals the right sum.

Hence, the answer is:

```text
-1
```

---

# Q2. In-place Prefix Sum

## Problem Description

Given an array `A` of `N` integers, construct the prefix sum of the array **in-place**, i.e., modify the given array itself to store its prefix sums.

The prefix sum at index `i` is the sum of all elements from index `0` to `i`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^3`

---

## Input Format

- The only argument is an integer array `A`.

---

## Output Format

Return the modified array containing the prefix sums.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
```

### Input 2

```text
A = [4, 3, 2]
```

---

## Example Output

### Output 1

```text
[1, 3, 6, 10, 15]
```

### Output 2

```text
[4, 7, 9]
```

---

## Example Explanation

### Explanation 1

The prefix sum array of:

```text
[1, 2, 3, 4, 5]
```

is:

```text
[1, 3, 6, 10, 15]
```

### Explanation 2

The prefix sum array of:

```text
[4, 3, 2]
```

is:

```text
[4, 7, 9]
```

---

# Q3. Sum of Odd Indexed Elements in a Range

## Problem Description

You are given:

- An integer array `A` of size `N`.
- A 2D array `B` of size `Q`, where each row `B[i]` contains two integers `B[i][0]` and `B[i][1]`, representing the range `[L, R]`.

For each query in `B`, calculate the sum of elements in `A` that are located at **odd indices** within the specified range `[L, R]` (inclusive), and return the results as an array.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`
- `1 <= Q <= 10^5`
- `0 <= B[i][0], B[i][1] < N`
- `B[i][0] <= B[i][1]`

---

## Input Format

- The first argument `A` is an integer array.
- The second argument `B` is a 2D integer array where each subarray `B[i] = [L, R]` represents a query range.

---

## Output Format

Return an integer array where the `i`th element is the sum of elements at **odd indices** in the range `[L, R]` for the `i`th query.

---

## Example Input

### Input 1

```text
A = [2, 8, 3, 9, 15]
B = [
      [1, 4],
      [0, 2],
      [2, 3]
    ]
```

### Input 2

```text
A = [5, 15, 25, 35, 45]
B = [
      [2, 2],
      [2, 4]
    ]
```

---

## Example Output

### Output 1

```text
[17, 8, 9]
```

### Output 2

```text
[0, 35]
```

---

## Example Explanation

### Explanation 1

- Query `[1, 4]`:
  ```text
  A[1] + A[3] = 8 + 9 = 17
  ```

- Query `[0, 2]`:
  ```text
  A[1] = 8
  ```

- Query `[2, 3]`:
  ```text
  A[3] = 9
  ```

Therefore, the answer is:

```text
[17, 8, 9]
```

### Explanation 2

- Query `[2, 2]`:
  ```text
  There are no odd indices in the range, so the sum is 0.
  ```

- Query `[2, 4]`:
  ```text
  A[3] = 35
  ```

Therefore, the answer is:

```text
[0, 35]
```

---

# Q4. Special Index

## Problem Description

Given an integer array `A` of size `N`, find the number of indices such that removing the element at that index makes the sum of elements at even indices equal to the sum of elements at odd indices in the resulting array.

> **Note:** After removing an element, the indices of all subsequent elements shift left by one.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`
- Sum of all elements of `A` <= `10^9`

---

## Input Format

- The first argument is an integer array `A` of size `N`.

---

## Output Format

Return the count of indices such that removing the element at those indices makes the sum of even-indexed elements equal to the sum of odd-indexed elements.

---

## Example Input

### Input 1

```text
A = [2, 1, 6, 4]
```

### Input 2

```text
A = [1, 1, 1]
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
3
```

---

## Example Explanation

### Explanation 1

Removing `A[1]` modifies the array to:

```text
[2, 6, 4]
```

- Sum of even-indexed elements = `2 + 4 = 6`
- Sum of odd-indexed elements = `6`

Since both sums are equal, index `1` is a special index.

Therefore, the answer is:

```text
1
```

### Explanation 2

Removing any one of the three elements results in:

```text
[1, 1]
```

In each case:

- Sum of even-indexed elements = `1`
- Sum of odd-indexed elements = `1`

Hence, all three indices are special.

Therefore, the answer is:

```text
3
```

---

# Q5. Even Numbers in a Range

## Problem Description

You are given an integer array `A` of length `N` and `Q` queries represented by a 2D array `B` of size `Q × 2`.

Each query contains two integers `L` and `R`, representing the range `[L, R]`.

For each query, find the number of **even elements** in the subarray `A[L...R]`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= Q <= 10^5`
- `1 <= A[i] <= 10^9`
- `0 <= L <= R < N`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is a 2D integer array `B`, where each row is of the form `[L, R]`.

---

## Output Format

Return an integer array where the `i`th element is the count of even numbers in the range specified by the `i`th query.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]

B = [
      [0, 2],
      [2, 4],
      [1, 4]
    ]
```

### Input 2

```text
A = [2, 1, 8, 3, 9, 6]

B = [
      [0, 3],
      [3, 5],
      [1, 3],
      [2, 4]
    ]
```

---

## Example Output

### Output 1

```text
[1, 1, 2]
```

### Output 2

```text
[2, 1, 1, 1]
```

---

## Example Explanation

### Explanation 1

- Query `[0, 2]`:
  ```text
  Subarray = [1, 2, 3]
  Even numbers = {2}
  Count = 1
  ```

- Query `[2, 4]`:
  ```text
  Subarray = [3, 4, 5]
  Even numbers = {4}
  Count = 1
  ```

- Query `[1, 4]`:
  ```text
  Subarray = [2, 3, 4, 5]
  Even numbers = {2, 4}
  Count = 2
  ```

### Explanation 2

- Query `[0, 3]`:
  ```text
  Subarray = [2, 1, 8, 3]
  Even numbers = {2, 8}
  Count = 2
  ```

- Query `[3, 5]`:
  ```text
  Subarray = [3, 9, 6]
  Even numbers = {6}
  Count = 1
  ```

- Query `[1, 3]`:
  ```text
  Subarray = [1, 8, 3]
  Even numbers = {8}
  Count = 1
  ```

- Query `[2, 4]`:
  ```text
  Subarray = [8, 3, 9]
  Even numbers = {8}
  Count = 1
  ```

  ---

# Q6. Odd Numbers in a Range

## Problem Description

You are given an integer array `A` of length `N` and `Q` queries represented by a 2D array `B` of size `Q × 2`.

Each query contains two integers `L` and `R`, representing the range `[L, R]`.

For each query, find the number of **odd elements** in the subarray `A[L...R]`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= Q <= 10^5`
- `1 <= A[i] <= 10^9`
- `0 <= L <= R < N`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is a 2D integer array `B`, where each row is of the form `[L, R]`.

---

## Output Format

Return an integer array where the `i`th element is the count of odd numbers in the range specified by the `i`th query.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]

B = [
      [0, 2],
      [2, 4],
      [1, 4]
    ]
```

### Input 2

```text
A = [2, 1, 8, 3, 9, 6]

B = [
      [0, 3],
      [3, 5],
      [1, 3],
      [2, 4]
    ]
```

---

## Example Output

### Output 1

```text
[2, 2, 2]
```

### Output 2

```text
[2, 2, 2, 2]
```

---

## Example Explanation

### Explanation 1

- Query `[0, 2]`:
  ```text
  Subarray = [1, 2, 3]
  Odd numbers = {1, 3}
  Count = 2
  ```

- Query `[2, 4]`:
  ```text
  Subarray = [3, 4, 5]
  Odd numbers = {3, 5}
  Count = 2
  ```

- Query `[1, 4]`:
  ```text
  Subarray = [2, 3, 4, 5]
  Odd numbers = {3, 5}
  Count = 2
  ```

### Explanation 2

- Query `[0, 3]`:
  ```text
  Subarray = [2, 1, 8, 3]
  Odd numbers = {1, 3}
  Count = 2
  ```

- Query `[3, 5]`:
  ```text
  Subarray = [3, 9, 6]
  Odd numbers = {3, 9}
  Count = 2
  ```

- Query `[1, 3]`:
  ```text
  Subarray = [1, 8, 3]
  Odd numbers = {1, 3}
  Count = 2
  ```

- Query `[2, 4]`:
  ```text
  Subarray = [8, 3, 9]
  Odd numbers = {3, 9}
  Count = 2
  ```