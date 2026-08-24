# Q1. Rain Water Trapped

## Problem Description

Imagine a histogram where the bars' heights are given by the array **A**. Each bar has a **uniform width of 1 unit**.

When it rains, water will accumulate in the valleys between the bars.

Your task is to calculate the **total amount of water that can be trapped** in these valleys.

### Example

The array:

```text
A = [5, 4, 1, 4, 3, 2, 7]
```

can be visualized as:

```text
Height
  7 |                         █
  6 |                         █
  5 | █                       █
  4 | █ █       █             █
  3 | █ █       █ █           █
  2 | █ █       █ █ █         █
  1 | █ █ █     █ █ █         █
  0 +---------------------------
      5 4 1 4 3 2 7
```

After rain, the trapped water can be visualized as:

```text
Height
  7 |                         █
  6 |                         █
  5 | █ ░ ░ ░ ░ ░ ░           █
  4 | █ █ ░ █ ░ ░ ░           █
  3 | █ █ ░ █ █ ░ ░           █
  2 | █ █ ░ █ █ █ ░           █
  1 | █ █ █ █ █ █ ░           █
  0 +---------------------------
      5 4 1 4 3 2 7

      ░ = Trapped Water
```

The total amount of rainwater trapped is:

```text
11
```

Therefore, the answer is **11 units** of water.

---

## Problem Constraints

```text
1 <= |A| <= 10^5
0 <= A[i] <= 10^5
```

---

## Input Format

The only argument is an integer array **A**, representing the heights of the bars in the histogram.

---

## Output Format

Return an integer representing the **total amount of water trapped**.

---

## Example 1

### Input

```text
A = [5, 4, 1, 4, 3, 2, 7]
```

### Output

```text
11
```

### Example Explanation

The bars of heights `5` and `7` form boundaries around the valley. Water accumulates above the shorter bars, and the total amount of trapped water is **11 units**.

---

## Example 2

### Input

```text
A = [1, 2, 3, 4, 5]
```

### Output

```text
0
```

### Example Explanation

The bars are arranged in increasing order, so there is no taller bar on the right to form a valley. Therefore, no water can be trapped.

---

## Example 3

### Input

```text
A = [5, 4, 3, 2, 1]
```

### Output

```text
0
```

### Example Explanation

The bars are arranged in decreasing order, so there is no taller bar on the left to form a valley. Therefore, no water can be trapped.

---

# Q2. Boundary Elements of N × M Matrix

## Problem Description

Given a matrix `A` of size `N × M`, print all the boundary elements of the matrix in clockwise direction, starting from the top-left corner.

The boundary elements are the elements present on the first row, last column, last row, and first column of the matrix.

## Example

For the following `4 × 5` matrix:

```text
1   2   3   4   5
6   7   8   9  10
11 12  13  14  15
16 17  18  19  20
```

The boundary elements in clockwise direction are:

```text
1 2 3 4 5 10 15 20 19 18 17 16 11 6
```

## Input Format

* The first line contains two integers `N` and `M`, representing the number of rows and columns of the matrix.
* The next `N` lines contain `M` integers each, representing the elements of the matrix.

## Output Format

Print all the boundary elements of the matrix in clockwise order, starting from the top-left corner.

## Constraints

* `1 ≤ N, M ≤ 1000`
* `-10^9 ≤ A[i][j] ≤ 10^9`

## Example 1

**Input:**

```text
4 5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
```

**Output:**

```text
1 2 3 4 5 10 15 20 19 18 17 16 11 6
```

**Explanation:**

Starting from `1`, traverse the boundary in clockwise direction:

* Top row: `1 2 3 4 5`
* Right column: `10 15 20`
* Bottom row: `19 18 17 16`
* Left column: `11 6`

Thus, the boundary elements are:

```text
1 2 3 4 5 10 15 20 19 18 17 16 11 6
```

## Example 2

**Input:**

```text
3 4
1 2 3 4
5 6 7 8
9 10 11 12
```

**Output:**

```text
1 2 3 4 8 12 11 10 9 5
```

**Explanation:**

Starting from `1`, traverse the boundary in clockwise direction:

* Top row: `1 2 3 4`
* Right column: `8 12`
* Bottom row: `11 10 9`
* Left column: `5`

Thus, the boundary elements are:

```text
1 2 3 4 8 12 11 10 9 5
```

## Edge Cases to Note

* **Single row (`N = 1`)**: print the row once, left to right (don't loop back).
* **Single column (`M = 1`)**: print the column once, top to bottom (don't loop back).
* **Single element (`N = 1, M = 1`)**: print that one element.

---

# Q3. Spiral Matrix [Follow up question for Boundary Elements of N × M Matrix]

## Problem Description

Given a matrix `A` of `m × n` elements (`m` rows, `n` columns), return all elements of the matrix in spiral order.

The spiral order means traversing the matrix in a clockwise direction from the outside to the inside, starting from the top-left corner.

## Problem Constraints

`1 <= m, n <= 1000`

`-10^9 <= A[i][j] <= 10^9`

## Input Format

The first argument is a 2D integer array `A`, representing the matrix.

## Output Format

Return a 1D integer array containing all elements of the matrix in spiral order.

## Example Input

**Input 1:**

```text
A = [
[1, 2, 3],
[4, 5, 6],
[7, 8, 9]
]
```

**Input 2:**

```text
A = [
[1, 2, 3, 4],
[5, 6, 7, 8]
]
```

## Example Output

**Output 1:**

```text
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

**Output 2:**

```text
[1, 2, 3, 4, 8, 7, 6, 5]
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

1. Move right along top row: 1 -> 2 -> 3 -> 4
2. Move down along right column: 8
3. Move left along bottom row: 7 -> 6 -> 5

```text
Result: [1, 2, 3, 4, 8, 7, 6, 5]
```

---

