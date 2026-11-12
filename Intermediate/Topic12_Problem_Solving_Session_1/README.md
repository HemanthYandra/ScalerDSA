# Q1. Search in a Row-Wise and Column-Wise Sorted Matrix

## Problem Description

Given an `N x M` matrix `A`, where **each row and each column is sorted in increasing order**, and an integer `B`, search for the element `B` in the matrix.

If the element is found, return `true`. Otherwise, return `false`.

### Note

- Every row is sorted from left to right.
- Every column is sorted from top to bottom.

---

## Problem Constraints

- `1 <= N, M <= 1000`
- `-10^9 <= A[i][j], B <= 10^9`

---

## Input Format

The first line contains two integers:

```text
N M
```

The next `N` lines contain `M` integers representing the matrix.

The last line contains the integer `B`, representing the element to search.

---

## Output Format

Return:

```text
true
```

if `B` is present in the matrix.

Otherwise, return:

```text
false
```

---

## Example Input

### Input 1

```text
N = 4
M = 4

1  4  7  11
2  5  8  12
3  6  9  16
10 13 14 17

B = 9
```

### Input 2

```text
N = 4
M = 4

1  4  7  11
2  5  8  12
3  6  9  16
10 13 14 17

B = 15
```

---

## Example Output

### Output 1

```text
true
```

### Output 2

```text
false
```

---

## Example Explanation

### Explanation 1

The element `9` is present in the matrix at row `2` and column `2`.

Therefore, the output is:

```text
true
```

### Explanation 2

The element `15` is not present anywhere in the matrix.

Therefore, the output is:

```text
false
```

---

# Q2. Majority Element

## Problem Description

Given an integer array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

---

## Problem Constraints

- `n == nums.length`
- `1 <= n <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

---

## Input Format

A single integer array `nums`.

---

## Output Format

Return the majority element present in the array.

---

## Example Input 1

```text
nums = [3,2,3]
```

## Example Output 1

```text
3
```

## Example Explanation 1

The element `3` appears 2 times, which is more than `⌊3 / 2⌋ = 1`.

---

## Example Input 2

```text
nums = [2,2,1,1,1,2,2]
```

## Example Output 2

```text
2
```

## Example Explanation 2

The element `2` appears 4 times, which is more than `⌊7 / 2⌋ = 3`.

---

# Q3. Majority Element II

## Problem Description

Given int array `nums` size `N`, find all elements appear more than `⌊N / 3⌋` times.

---

## Problem Constraints

- `1 <= nums.length <= 5 * 10^4`
- `-10^9 <= nums[i] <= 10^9`

---

## Example Input

### Input 1

```text
nums = [3, 2, 3]
```

### Input 2

```text
nums = [1]
```

### Input 3

```text
nums = [1, 2]
```

---

## Example Output

### Output 1

```text
[3]
```

### Output 2

```text
[1]
```

### Output 3

```text
[1, 2]
```

---

## Example Explanation

### Explanation 1

`3` appear `2` times.

Since:

```text
⌊3 / 3⌋ = 1
```

`3` more than `1` time. Answer:

```text
[3]
```

### Explanation 2

Array only one elem `1`. Answer:

```text
[1]
```

### Explanation 3

Array two elem `1`, `2`.

Since:

```text
⌊2 / 3⌋ = 0
```

both more than `0` times. Answer:

```text
[1, 2]
```

---
# Q4. Dishes

## Problem Description

There are **N** kinds of dishes in the wedding ceremony. You know that the i-th dish contains **A[i]** amount of protein.

Sam likes some of the dishes among them and doesn't like the rest. If **B[i]** is 1, it means that Sam likes that dish, otherwise 0. If Sam likes the dish he will eat the dish, otherwise not.

Now, as an elder brother, you can force him to eat **C consecutive dishes** no matter whether he likes them or not.

Find the maximum protein Sam can get if you force him to eat C consecutive and eats the rest of the dishes of his choice.

## Problem Constraints

- 1 <= N <= 10^5
- 1 <= A[i] <= 10^6
- 0 <= C <= N
- B[i] is either 0 or 1

## Input Format

The first argument contains the integer array **A**.

The second argument contains the integer array **B**.

The third argument contains the integer **C**.

## Output Format

Return a single integer denoting the maximum protein Sam can get.

## Example Input

**Input 1:**
```text
A = [1, 3, 5, 2, 5, 4]
B = [1, 1, 0, 1, 0, 0]
C = 3
```

**Input 2:**
```text
A = [1, 2]
B = [1, 0]
C = 0
```

## Example Output

**Output 1:**
```text
16
```

**Output 2:**
```text
1
```

## Example Explanation

**Explanation 1:**

We see that among all the subarrays of size 3, if Sam is forced to eat the subarray from the 3rd dish, we can get the most amount of protein for Sam. In this case, he eats the 1st, 2nd, 3rd, 4th and 5th dish and gets a protein of 16.

**Explanation 2:**

Sam just eats everything of his choice. So he only eats the 1st dish and gets a protein of 1.

---

