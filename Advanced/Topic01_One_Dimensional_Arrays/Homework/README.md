# Q1. Print Subarray of Max Subarray Sum

## Problem Description

Given an array `A` of length `N`, your task is to find the contiguous subarray that has the maximum possible sum, and return that subarray itself (not just the sum).

In other words, among all possible subarrays of `A`, determine the one that yields the highest sum and return the elements of that subarray in order.

If there are multiple subarrays with the same maximum sum, return any one of them.

---

## Problem Constraints

- `1 <= N <= 10^6`
- `-1000 <= A[i] <= 1000`

---

## Input Format

The first argument is an integer `N`, denoting the size of the array.

The second line contains `N` integers representing the array `A`.

---

## Output Format

Return an integer array denoting the contiguous subarray with the maximum possible sum.

---

## Example Input

### Input 1

```text
N = 5

A = [1, 2, 3, 4, -10]
```

### Input 2

```text
N = 9

A = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

---

## Example Output

### Output 1

```text
[1, 2, 3, 4]
```

### Output 2

```text
[4, -1, 2, 1]
```

---

## Example Explanation

### Explanation 1

Among all contiguous subarrays of `A`, the subarray:

```text
[1, 2, 3, 4]
```

has the maximum possible sum of `10`.

Therefore, the answer is:

```text
[1, 2, 3, 4]
```

### Explanation 2

Among all contiguous subarrays of `A`, the subarray:

```text
[4, -1, 2, 1]
```

has the maximum possible sum of `6`.

Therefore, the answer is:

```text
[4, -1, 2, 1]
```

---

# Q2. Flip

## Problem Description

You are given a binary string `A` consisting of characters `0` and `1`.

In a single operation, you can choose two indices `L` and `R`, such that:

```text
1 ≤ L ≤ R ≤ N
```

and flip all characters from `L` to `R`.

By flipping, we mean:

```text
0 becomes 1
1 becomes 0
```

Your aim is to perform at most one operation such that the number of `1`s in the final string is maximized.

If you do not want to perform the operation, return an empty array.

Otherwise, return an array containing two elements representing `L` and `R`.

If there are multiple valid answers, return the lexicographically smallest pair `[L, R]`.

A pair `[a, b]` is lexicographically smaller than `[c, d]` if:

- `a < c`, or
- `a == c and b < d`

---

## Problem Constraints

- `1 <= length of A <= 100000`

---

## Input Format

The first and only argument is a string `A`.

---

## Output Format

Return an integer array containing `L` and `R`.

If no operation can increase the number of `1`s, return an empty array `[]`.

---

## Example Input

### Input 1

```text
A = "010"
```

### Input 2

```text
A = "111"
```

### Input 3

```text
A = "110000111001"
```

---

## Example Output

### Output 1

```text
[1, 1]
```

### Output 2

```text
[]
```

### Output 3

```text
[3, 6]
```

---

## Example Explanation

### Explanation 1

| Pair [L, R] | Final String |
|---|---|
| [1, 1] | "110" |
| [1, 2] | "100" |
| [1, 3] | "101" |
| [2, 2] | "000" |
| [2, 3] | "001" |

Both `[1, 1]` and `[1, 3]` result in the maximum number of `1`s.

Since `[1, 1]` is lexicographically smaller, the answer is:

```text
[1, 1]
```

### Explanation 2

The string already contains three `1`s, which is the maximum possible. Flipping any non-empty range would decrease the number of `1`s.

Therefore, no operation is performed and the answer is:

```text
[]
```

### Explanation 3

Given:

```text
A = "110000111001"
```

The substring from index `3` to `6` is:

```text
"0000"
```

Flipping this range turns it into:

```text
"1111"
```

So the string:

```text
1 1 0 0 0 0 1 1 1 0 0 1
```

becomes:

```text
1 1 1 1 1 1 1 1 1 0 0 1
```

This increases the number of `1`s from `6` to `10`, which is the maximum possible gain achievable with a single flip operation.

Therefore, the answer is:

```text
[3, 6]
```

---

# Q3. Continuous Sum Query (Similar to Range Update Queries Question[In Assignment])

## Problem Description

There are `A` beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin (according to their faith and ability) to some `K` beggars sitting next to each other.

Given the amount `P` donated by each devotee to the beggars ranging from `L` to `R` index, where `1 <= L <= R <= A`, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.

For `i-th` devotee `B[i][0] = L`, `B[i][1] = R`, `B[i][2] = P`, given by the 2D array `B`.

---

## Problem Constraints

- `1 <= A <= 2 * 10^5`
- `1 <= L <= R <= A`
- `1 <= P <= 10^3`
- `0 <= len(B) <= 10^5`

---

## Input Format

The first argument is a single integer `A`.

The second argument is a 2D integer array `B`.

---

## Output Format

Return an array (0 based indexing) that stores the total number of coins in each beggar's pot.

---

## Example Input

### Input 1

```text
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]
```

---

## Example Output

### Output 1

```text
10 55 45 25 25
```

---

## Example Explanation

### Explanation 1

First devotee donated `10` coins to beggars ranging from `1` to `2`.

Final amount in each beggar's pot after first devotee:

```text
[10, 10, 0, 0, 0]
```

Second devotee donated `20` coins to beggars ranging from `2` to `3`.

Final amount in each beggar's pot after second devotee:

```text
[10, 30, 20, 0, 0]
```

Third devotee donated `25` coins to beggars ranging from `2` to `5`.

Final amount in each beggar's pot after third devotee:

```text
[10, 55, 45, 25, 25]
```

---

# Q4. Merge Intervals - 2

## Problem Description

You have a set of non-overlapping intervals. You are given a new interval `[start, end]`. Insert this new interval into the set of intervals and merge if necessary.

You may assume that the intervals were initially sorted according to their start times.

---

## Problem Constraints

- `0 <= |intervals| <= 10^5`

---

## Input Format

The first argument is the vector of intervals.

The second argument is the new interval to be merged.

---

## Output Format

Return the vector of intervals after inserting and merging the new interval.

---

## Example Input

### Input 1

```text
Given intervals [1, 3], [6, 9]

Insert and merge [2, 5]
```

### Input 2

```text
Given intervals [1, 3], [6, 9]

Insert and merge [2, 6]
```

---

## Example Output

### Output 1

```text
[[1, 5], [6, 9]]
```

### Output 2

```text
[[1, 9]]
```

---

## Example Explanation

### Explanation 1

`[2, 5]` overlaps with `[1, 3]`, so they are merged into `[1, 5]`.

Therefore, the answer is:

```text
[[1, 5], [6, 9]]
```

### Explanation 2

`[2, 6]` overlaps with both `[1, 3]` and `[6, 9]`, so all three intervals are merged into `[1, 9]`.

Therefore, the answer is:

```text
[[1, 9]]
```

---

# Q5. Longest Maintenance Window (Similar to Merge Sorted Overlapping Intervals Question in Assignment)

## Problem Description

Scaler Academy wants to schedule website maintenance during a period when no learners are active on the platform.

You are given sorted data on the active hours of multiple learners in a 2-D array format `DATA`, where each interval is represented by a pair of integers `[start, end]`. The intervals are sorted based on their start values.

Your task is to find the longest continuous period of time during which no learner is active. This period represents the best window to perform maintenance with minimal disruption.

**Note:** Only gaps *between* consecutive learner-active intervals count as valid maintenance windows. Time before the first interval or after the last interval is not considered, since there is no defined boundary (e.g. platform's operating hours) given in this problem.

---

## Problem Constraints

- `1 <= len(DATA) <= 100000`
- `1 <= DATA[i][0] <= DATA[i][1] <= 100000`
- `DATA` is sorted based on the start value `DATA[i][0]`

**Note:** If `len(DATA) == 1` after merging (i.e. all intervals merge into one, or only one interval was given), there is no gap between intervals, so no valid maintenance window exists. In this case, return `[-1, -1]`.

---

## Input Format

First argument is a list of intervals in a 2-Dimensional Array.

---

## Output Format

Return the interval `[start, end]` representing the longest gap of no activity (the best maintenance window).

If no such window exists, return `[-1, -1]`.

---

## Example Input

### Input 1

```text
[ [9, 11], [14, 16], [15, 20] ]
```

### Input 2

```text
[ [5, 10] ]
```

---

## Example Output

### Output 1

```text
[11, 14]
```

### Output 2

```text
[-1, -1]
```

---

## Example Explanation

### Explanation 1

Intervals `[14, 16]` and `[15, 20]` overlap, so they are merged into `[14, 20]`.

Merged active intervals: `[ [9, 11], [14, 20] ]`

The only gap between consecutive merged intervals is between `11` and `14`, giving a window of length `3`.

Therefore, the required answer is:

```text
[11, 14]
```

### Explanation 2

There is only a single interval `[5, 10]`, so there are no consecutive intervals to form a gap between.

Therefore, the required answer is:

```text
[-1, -1]
```

---

