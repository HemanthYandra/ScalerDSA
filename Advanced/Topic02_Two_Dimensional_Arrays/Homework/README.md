# Q1. Row with maximum number of ones

## Problem Description

Given a binary sorted matrix `A` of size `N x N`. Find the row with the maximum number of `1`.

### Note

- If two rows have the maximum number of `1` then return the row which has a lower index.
- Rows are numbered from top to bottom and columns are numbered from left to right.
- Assume 0-based indexing.
- Assume each row to be sorted by values.
- Expected time complexity is `O(rows + columns)`.

---

## Problem Constraints

- `1 <= N <= 1000`
- `0 <= A[i] <= 1`

---

## Input Format

The only argument given is the integer matrix `A`.

---

## Output Format

Return the row with the maximum number of `1`.

---

## Example Input

### Input 1

```text
A = [ [0, 1, 1],
      [0, 0, 1],
      [0, 1, 1] ]
```

### Input 2

```text
A = [ [0, 0, 0, 0],
      [0, 0, 0, 1],
      [0, 0, 1, 1],
      [0, 1, 1, 1] ]
```

---

## Example Output

### Output 1

```text
0
```

### Output 2

```text
3
```

---

## Example Explanation

### Explanation 1

Row `0` has maximum number of `1`s.

### Explanation 2

Row `3` has maximum number of `1`s.

---

# Q2. Minimum Swaps

## Problem Description

Given an array of integers **A** and an integer **B**, find and return the minimum number of swaps required to bring all the numbers less than or equal to **B** together.

**Note:** It is possible to swap any two elements, not necessarily consecutive.

## Problem Constraints

- `1 <= length of the array <= 100000`
- `-10^9 <= A[i], B <= 10^9`

## Input Format

The first argument given is the integer array A.

The second argument given is the integer B.

## Output Format

Return the minimum number of swaps.

## Example Input

### Input 1:

```text
A = [1, 12, 10, 3, 14, 10, 5]
B = 8
```

### Input 2:

```text
A = [5, 17, 100, 11]
B = 20
```

## Example Output

### Output 1:

```text
2
```

### Output 2:

```text
1
```

## Example Explanation

### Explanation 1:

```text
A = [1, 12, 10, 3, 14, 10, 5]

After swapping 12 and 3, A => [1, 3, 10, 12, 14, 10, 5].

After swapping the first occurence of 10 and 5, A => [1, 3, 5, 12, 14, 10, 10].

Now, all elements less than or equal to 8 are together.
```

### Explanation 2:

```text
A = [5, 17, 100, 11]

After swapping 100 and 11, A => [5, 17, 11, 100].

Now, all elements less than or equal to 20 are together.
```

---

