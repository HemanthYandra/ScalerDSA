# Q1. Add One To Number

## Problem Description

Given a non-negative number represented as an array of digits, add `1` to the number (increment the number represented by the digits).

The digits are stored such that the most significant digit is at the head of the list.

### Note

Certain things are intentionally left unclear in this question which you should practice asking the interviewer. For example, for this problem, the following are some good questions to ask:

- **Q:** Can the input have `0`'s before the most significant digit. Or, in other words, is `0 1 2 3` a valid input?
- **A:** For the purpose of this question, YES.

- **Q:** Can the output have `0`'s before the most significant digit? Or, in other words, is `0 1 2 4` a valid output?
- **A:** For the purpose of this question, NO. Even if the input has zeroes before the most significant digit.

---

## Problem Constraints

- `1 <= size of the array <= 1000000`

---

## Input Format

First argument is an array of digits.

---

## Output Format

Return the array of digits after adding one.

---

## Example Input

### Input 1

```text
[1, 2, 3]
```

---

## Example Output

### Output 1

```text
[1, 2, 4]
```

---

## Example Explanation

### Explanation 1

Given vector is `[1, 2, 3]`.

The returned vector should be `[1, 2, 4]` as `123 + 1 = 124`.

---

# Q2. Boundary Elements of Square Matrix

## Problem Description

Given a square matrix `A` of size `N × N`, print all the boundary elements of the matrix in clockwise direction, starting from the top-left corner.

The boundary elements are the elements present on the first row, last column, last row, and first column of the matrix.

## Example

For the following 5 × 5 matrix:

```text
1   2   3   4   5
6   7   8   9  10
11 12  13  14  15
16 17  18  19  20
21 22  23  24  25
```

The boundary elements in clockwise direction are:

```text
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6
```

## Input Format

* The first line contains an integer `N`, representing the size of the square matrix.
* The next `N` lines contain `N` integers each, representing the elements of the matrix.

## Output Format

Print all the boundary elements of the matrix in clockwise order, starting from the top-left corner.

## Constraints

* `1 ≤ N ≤ 1000`
* `-10^9 ≤ A[i][j] ≤ 10^9`

## Example 1

**Input:**

```text
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
```

**Output:**

```text
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6
```

**Explanation:**

Starting from `1`, traverse the boundary in clockwise direction:

* Top row: `1 2 3 4 5`
* Right column: `10 15 20 25`
* Bottom row: `24 23 22 21`
* Left column: `16 11 6`

Thus, the boundary elements are:

```text
1 2 3 4 5 10 15 20 25 24 23 22 21 16 11 6
```

---

# Q3. Spiral Square Matrix [Follow up question for Boundary Elements of Square Matrix]

## Problem Description

Given a square matrix `A` of size `N × N`, return all elements of the matrix in spiral order.

The spiral order means traversing the matrix in a clockwise direction from the outside to the inside, starting from the top-left corner.

## Problem Constraints

`1 <= N <= 1000`

`-10^9 <= A[i][j] <= 10^9`

## Input Format

The first line contains an integer `N`, representing the size of the square matrix.

The next `N` lines contain `N` integers each, representing the elements of the matrix.

## Output Format

Return (or print) a 1D integer array containing all elements of the matrix in spiral order.

## Example Input

**Input 1:**

```text
3
1 2 3
4 5 6
7 8 9
```

**Input 2:**

```text
2
1 2
3 4
```

## Example Output

**Output 1:**

```text
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

**Output 2:**

```text
[1, 2, 4, 3]
```

## Example Explanation

**Explanation 1:**

Starting from the top-left corner, traverse in spiral (clockwise) order:

1. Move right along top row: 1 -> 2 -> 3
2. Move down along right column: 6 -> 9
3. Move left along bottom row: 8 -> 7
4. Move up along left column: 4
5. Move right to center: 5

```text
Result: [1, 2, 3, 6, 9, 8, 7, 4, 5]
```

**Explanation 2:**

Starting from the top-left corner, traverse in spiral (clockwise) order:

1. Move right along top row: 1 -> 2
2. Move down along right column: 4
3. Move left along bottom row: 3

```text
Result: [1, 2, 4, 3]
```

---

