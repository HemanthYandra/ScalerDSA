# Q1. Special Subsequences "AG"

## Problem Description

You are given a string `A` consisting of uppercase English letters.

Your task is to find the number of pairs `(i, j)` such that:

- `A[i] = 'A'`
- `A[j] = 'G'`
- `i < j`

In other words, count the number of times the subsequence `"AG"` appears in the given string.

---

## Problem Constraints

- `1 <= length(A) <= 10^5`

---

## Input Format

- The first and only argument is a string `A`.

---

## Output Format

- Return a **long integer** denoting the number of valid pairs.

---

## Example Input

### Input 1

```text
A = "ABCGAG"
```

### Input 2

```text
A = "GAB"
```

---

## Example Output

### Output 1

```text
3
```

### Output 2

```text
0
```

---

## Example Explanation

### Explanation 1

The subsequence `"AG"` appears **3** times.

The valid pairs are:

```text
(0, 3)
(0, 5)
(4, 5)
```

Hence, the answer is:

```text
3
```

### Explanation 2

There is no valid pair `(i, j)` such that:

- `A[i] = 'A'`
- `A[j] = 'G'`
- `i < j`

Hence, the answer is:

```text
0
```

---

# Q2. Leaders in an Array

## Problem Description

Given an integer array `A` containing `N` distinct integers, find all the **leaders** in the array.

An element is called a **leader** if it is **strictly greater** than all the elements to its right.

> **Note:** The rightmost element is always a leader.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^8`

---

## Input Format

- A single integer array `A`.

---

## Output Format

- Return an integer array containing all the leader elements.

> **Note:** The leaders can be returned in **any order**.

---

## Example Input

### Input 1

```text
A = [16, 17, 4, 3, 5, 2]
```

### Input 2

```text
A = [5, 4]
```

---

## Example Output

### Output 1

```text
[17, 5, 2]
```

### Output 2

```text
[5, 4]
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [16, 17, 4, 3, 5, 2]
```

- `16` is **not** a leader because `17` is greater.
- `17` is a leader because it is greater than every element to its right.
- `4` is **not** a leader because `5` is greater.
- `3` is **not** a leader because `5` is greater.
- `5` is a leader because it is greater than `2`.
- `2` is the rightmost element, so it is always a leader.

Hence, the leaders are:

```text
[17, 2, 5]
```

Any ordering of these leaders is accepted, for example:

```text
[2, 5, 17]
```

or

```text
[5, 2, 17]
```

---

### Explanation 2

For the array:

```text
A = [5, 4]
```

- `5` is greater than `4`, so it is a leader.
- `4` is the rightmost element, so it is also a leader.

Hence, the leaders are:

```text
[5, 4]
```

Any ordering of these leaders is accepted.

---

# Q3. Generate All Subarrays

## Problem Description

You are given an array `A` of `N` integers.

Your task is to return a **2D array** consisting of **all the subarrays** of the given array.

> **Note:** The order of the subarrays in the resulting 2D array does not matter.

---

## Problem Constraints

- `1 <= N <= 100`
- `1 <= A[i] <= 10^5`

---

## Input Format

- The first argument is an integer array `A`.

---

## Output Format

- Return a 2D array containing all the subarrays of the given array in **any order**.

---

## Example Input

### Input 1

```text
A = [1, 2, 3]
```

### Input 2

```text
A = [5, 2, 1, 4]
```

---

## Example Output

### Output 1

```text
[
  [1],
  [1, 2],
  [1, 2, 3],
  [2],
  [2, 3],
  [3]
]
```

### Output 2

```text
[
  [1],
  [1, 4],
  [2],
  [2, 1],
  [2, 1, 4],
  [4],
  [5],
  [5, 2],
  [5, 2, 1],
  [5, 2, 1, 4]
]
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [1, 2, 3]
```

All possible subarrays are:

```text
[1]
[1, 2]
[1, 2, 3]
[2]
[2, 3]
[3]
```

There are a total of:

```text
6
```

subarrays.

---

### Explanation 2

For the array:

```text
A = [5, 2, 1, 4]
```

All possible subarrays are:

```text
[5]
[5, 2]
[5, 2, 1]
[5, 2, 1, 4]
[2]
[2, 1]
[2, 1, 4]
[1]
[1, 4]
[4]
```

There are a total of:

```text
10
```

subarrays.

---

# Q4. Subarray in Given Range

## Problem Description

Given an array `A` of length `N`, return the subarray from index `B` to index `C` (inclusive).

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`
- `0 <= B <= C < N`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.
- The third argument is an integer `C`.

---

## Output Format

- Return the subarray from index `B` to index `C` (inclusive).

---

## Example Input

### Input 1

```text
A = [4, 3, 2, 6]
B = 1
C = 3
```

### Input 2

```text
A = [4, 2, 2]
B = 0
C = 1
```

---

## Example Output

### Output 1

```text
[3, 2, 6]
```

### Output 2

```text
[4, 2]
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [4, 3, 2, 6]
```

The elements from index `1` to index `3` are:

```text
[3, 2, 6]
```

Hence, the answer is:

```text
[3, 2, 6]
```

---

### Explanation 2

For the array:

```text
A = [4, 2, 2]
```

The elements from index `0` to index `1` are:

```text
[4, 2]
```

Hence, the answer is:

```text
[4, 2]
```

---

