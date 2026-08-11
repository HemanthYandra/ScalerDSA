# Q1. Range Sum Query

## Problem Description

You are given an integer array `A` of length `N`.

You are also given a 2D integer array `B` with dimensions `M × 2`, where each row represents a query `[L, R]`.

For each query, find the sum of all elements from index `L` to index `R` (inclusive) in array `A`.

More formally:

```text
A[L] + A[L + 1] + A[L + 2] + ... + A[R]
```

Return the answer for every query.

---

## Problem Constraints

- `1 <= N, M <= 10^5`
- `1 <= A[i] <= 10^9`
- `0 <= L <= R < N`

---

## Input Format

- The first argument is the integer array `A`.
- The second argument is the 2D integer array `B`.

---

## Output Format

Return an integer array of length `M`, where the `i`th element is the answer for the `i`th query.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
B = [[0, 3], [1, 2]]
```

### Input 2

```text
A = [2, 2, 2]
B = [[0, 0], [1, 2]]
```

---

## Example Output

### Output 1

```text
[10, 5]
```

### Output 2

```text
[2, 4]
```

---

## Example Explanation

### Explanation 1

- Sum of elements from `A[0...3]`:
  ```text
  1 + 2 + 3 + 4 = 10
  ```
- Sum of elements from `A[1...2]`:
  ```text
  2 + 3 = 5
  ```

### Explanation 2

- Sum of elements from `A[0...0]`:
  ```text
  2
  ```
- Sum of elements from `A[1...2]`:
  ```text
  2 + 2 = 4
  ```

  ---

# Q2. Sum of Even Indexed Elements in a Range

## Problem Description

You are given:

- An integer array `A` of size `N`.
- A 2D array `B` of size `Q`, where each row `B[i]` contains two integers `L` and `R`, representing the range `[L, R]`.

For each query, calculate the **sum of elements at even indices** within the specified range `[L, R]`.

Return an array containing the answer for each query.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`
- `1 <= Q <= 10^5`
- `0 <= B[i][0], B[i][1] < N`
- `B[i][0] <= B[i][1]`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is a 2D integer array `B`, where each row contains two integers `[L, R]`.

---

## Output Format

Return an integer array where each element is the sum of elements at **even indices** within the corresponding query range.

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
    [1, 1],
    [0, 0]
]
```

---

## Example Output

### Output 1

```text
[18, 5, 3]
```

### Output 2

```text
[0, 5]
```

---

## Explanation

### Explanation 1

- Query `[1, 4]`
  - Even indices in the range: `2, 4`
  - Sum = `A[2] + A[4] = 3 + 15 = 18`

- Query `[0, 2]`
  - Even indices in the range: `0, 2`
  - Sum = `A[0] + A[2] = 2 + 3 = 5`

- Query `[2, 3]`
  - Even index in the range: `2`
  - Sum = `A[2] = 3`

Result:

```text
[18, 5, 3]
```

### Explanation 2

- Query `[1, 1]`
  - No even indices in the range.
  - Sum = `0`

- Query `[0, 0]`
  - Even index: `0`
  - Sum = `A[0] = 5`

Result:

```text
[0, 5]
```