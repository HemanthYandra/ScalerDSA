# Q1. Max Sum Contiguous Subarray

## Problem Description (In Interview/Coding rounds)

As a cryptocurrency trader, you have a unique advantage: access to predicted data that outlines the daily price changes of a specific cryptocurrency for the next N days. Your goal is to maximize your profit based on these predictions.

You are provided with an array A consisting of N integers, where each integer represents the predicted change in the crypto's price for that day. A positive value indicates a profit (the price goes up), while a negative value indicates a loss (the price goes down). The total profit or loss you can make is determined by the sum of the daily price changes for the period you choose to hold onto the crypto.

Your goal is to Determine the maximum profit you can achieve, under the condition that you must buy before you can sell.

---

## Problem Constraints

- `1 <= N <= 10^6`
- `-1000 <= A[i] <= 1000`

---

## Input Format

The first and the only argument contains an integer array, `A`.

---

## Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.

---

## Example Input

### Input 1

```text
A = [-20, 30, 40, -10, 50, -100, 70]
```

### Input 2

```text
A = [-3, 4, 6, 8, -10, 2, 7]
```

---

## Example Output

### Output 1

```text
110
```

### Output 2

```text
18
```

---

## Example Explanation

### Explanation 1

The subarray `[30, 40, -10, 50]` has the maximum possible sum of `110`.

### Explanation 2

The subarray `[4, 6, 8]` has the maximum possible sum of `18`.

---

## Problem Description (In simple words)

Given an array `A` of length `N`, your task is to find the maximum possible sum of any non-empty contiguous subarray.

In other words, among all possible subarrays of `A`, determine the one that yields the highest sum and return that sum.

---

## Problem Constraints

- `1 <= N <= 10^6`
- `-1000 <= A[i] <= 1000`

---

## Input Format

The first and the only argument contains an integer array, `A`.

---

## Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, -10]
```

### Input 2

```text
A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

---

## Example Output

### Output 1

```text
10
```

### Output 2

```text
6
```

---

## Example Explanation

### Explanation 1

The subarray `[1, 2, 3, 4]` has the maximum possible sum of `10`.

### Explanation 2

The subarray `[4, -1, 2, 1]` has the maximum possible sum of `6`.

---

# Q2. Range Increment Queries

## Problem Description

Initially, all elements of an array `arr` of length `N` are `0`.

You are given `Q` queries. Each query contains two integers `idx` and `value`.

For every query, increment all elements of the array from index `idx` to the last index (`N - 1`) by `value`.

After processing all the queries, return the final state of the array.

---

## Example

Suppose:

```text
N = 7
Q = 3
```

The queries are:

```text
idx  value
3    4
1    3
4   -2
```

Initially:

```text
arr = [0, 0, 0, 0, 0, 0, 0]
```

After applying all queries, the final array is:

```text
[0, 3, 3, 7, 5, 5, 5]
```

---

## Constraints

- `1 <= N <= 10^5`
- `1 <= Q <= 10^5`

---

## Input Format

The input consists of:

- The first line containing two integers `N` and `Q`, representing the size of the array and the number of queries.
- The next `Q` lines contain two integers `idx` and `value`, representing each query.

---

## Output Format

Return the final state of the array after processing all `Q` queries.

---

## Example Input

```text
7 
3
3 4
1 3
4 -2
```

---

## Example Output

```text
0 3 3 7 5 5 5
```

---

## Example Explanation

Initially:

```text
[0, 0, 0, 0, 0, 0, 0]
```

- Query `(3, 4)` increments indices `3` to `6` by `4`.
- Query `(1, 3)` increments indices `1` to `6` by `3`.
- Query `(4, -2)` decrements indices `4` to `6` by `2`.

Therefore, the final array is:

```text
[0, 3, 3, 7, 5, 5, 5]
```

---

# Q3. Range Update Queries (Follow Up question for Range Increment Queries)

## Problem Description

Initially, all elements of an array `arr` of length `N` are `0`.

You are given `Q` queries. Each query contains three integers `i`, `j`, and `x`.

For every query, add `x` to all elements of the array from index `i` to index `j` (inclusive), where `i <= j`.

After processing all the queries, return the final state of the array.

---

## Example

Suppose:

```text
N = 5
Q = 3
```

The queries are:

```text
i    j    x
0    2    10
1    3    20
2    4    30
```

Initially:

```text
arr = [0, 0, 0, 0, 0]
```

After applying all queries, the final array is:

```text
[10, 30, 60, 50, 30]
```

---

## Constraints

- `1 <= N <= 10^5`
- `1 <= Q <= 10^5`
- `0 <= i <= j <= N - 1`
- `-10^3 <= x <= 10^3`

---

## Input Format

The input consists of:

- The first line containing two integers `N` and `Q`, representing the size of the array and the number of queries.
- The next `Q` lines contain three integers `i`, `j`, and `x`, representing each query.

---

## Output Format

Return the final state of the array after processing all `Q` queries.

---

## Example Input

```text
5
3
0 2 10
1 3 20
2 4 30
```

---

## Example Output

```text
10 30 60 50 30
```

---

## Example Explanation

Initially:

```text
[0, 0, 0, 0, 0]
```

- Query `(0, 2, 10)` adds `10` to indices `0` to `2`.
- Query `(1, 3, 20)` adds `20` to indices `1` to `3`.
- Query `(2, 4, 30)` adds `30` to indices `2` to `4`.

Therefore, the final array is:

```text
[10, 30, 60, 50, 30]
```

---

# Q4. Merge Sorted Overlapping Intervals - 2

## Problem Description

You are given a collection of intervals `A` in a 2-D array format, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.

Your task is to merge all overlapping intervals and return the resulting set of non-overlapping intervals.

---

## Problem Constraints

- `1 <= len(A) <= 100000`
- `1 <= A[i][0] <= A[i][1] <= 100000`
- `A` is sorted based on the start value `A[i][0]`

---

## Input Format

First argument is a list of intervals in a 2-Dimensional Array.

---

## Output Format

Return the sorted list of intervals after merging all the overlapping intervals.

---

## Example Input

### Input 1

```text
[ [1, 3], [2, 6], [8, 10], [15, 18] ]
```

### Input 2

```text
[ [2, 10], [4, 9], [6, 7] ]
```

---

## Example Output

### Output 1

```text
[ [1, 6], [8, 10], [15, 18] ]
```

### Output 2

```text
[ [2, 10] ]
```

---

## Example Explanation

### Explanation 1

Intervals `[1, 3]` and `[2, 6]` overlap, so they are merged into `[1, 6]`.

The remaining intervals do not overlap.

Therefore, the required answer is:

```text
[ [1, 6], [8, 10], [15, 18] ]
```

### Explanation 2

All three intervals overlap within `[2, 10]`.

Therefore, they can be merged into:

```text
[2, 10]
```

So the required answer is:

```text
[ [2, 10] ]
```

---

