# Q1. Counting Subarrays Easy

## Problem Description

Given an array `A` of `N` non-negative integers and a non-negative integer `B`, count the number of **contiguous subarrays** whose sum is **less than `B`**.

> **Note:** You may assume that there is no integer overflow.

---

## Problem Constraints

- `1 <= N <= 5 × 10^3`
- `1 <= A[i] <= 1000`
- `1 <= B <= 10^7`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.

---

## Output Format

- Return a single integer denoting the number of subarrays whose sum is less than `B`.

---

## Example Input

### Input 1

```text
A = [2, 5, 6]
B = 10
```

### Input 2

```text
A = [1, 11, 2, 3, 15]
B = 10
```

---

## Example Output

### Output 1

```text
4
```

### Output 2

```text
4
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [2, 5, 6]
B = 10
```

The subarrays with sum less than `10` are:

```text
[2]     → Sum = 2
[5]     → Sum = 5
[6]     → Sum = 6
[2, 5]  → Sum = 7
```

There are **4** such subarrays.

Hence, the answer is:

```text
4
```

---

### Explanation 2

For the array:

```text
A = [1, 11, 2, 3, 15]
B = 10
```

The subarrays with sum less than `10` are:

```text
[1]     → Sum = 1
[2]     → Sum = 2
[3]     → Sum = 3
[2, 3]  → Sum = 5
```

There are **4** such subarrays.

Hence, the answer is:

```text
4
```

---

# Q2. Maximum Consecutive 1's After Replacing One 0

## Problem Description

Given an array `A` consisting only of `0`s and `1`s, you are allowed to replace **at most one `0` with `1`**.

Find the **maximum number of consecutive `1`s** that can be obtained after making the replacement.

### Note

You can replace **only one `0`** with `1`.

If the array already contains only `1`s, return the length of the array.

---

## Problem Constraints

- `1 <= N <= 100000`
- `A[i]` is either `0` or `1`

---

## Input Format

The first line contains an integer `N`, representing the size of the array.

The second line contains `N` integers representing the array `A`.

---

## Output Format

Return the maximum number of consecutive `1`s that can be obtained after replacing at most one `0` with `1`.

---

## Example Input

### Input 1

```text
N = 8

1 1 0 1 1 0 1 1
```

### Input 2

```text
N = 7

1 1 1 0 1 1 1
```

---

## Example Output

### Output 1

```text
5
```

### Output 2

```text
7
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = [1, 1, 0, 1, 1, 0, 1, 1]
```

We are allowed to replace only one `0` with `1`.

If we replace the `0` at index `2`:

```text
[1, 1, 1, 1, 1, 0, 1, 1]
```

We get:

```text
5 consecutive 1's
```

Similarly, if we replace the `0` at index `5`:

```text
[1, 1, 0, 1, 1, 1, 1, 1]
```

Again, we get:

```text
5 consecutive 1's
```

Therefore, the maximum number of consecutive `1`s is:

```text
5
```

---

### Explanation 2

Given:

```text
A = [1, 1, 1, 0, 1, 1, 1]
```

Replace the `0` at index `3` with `1`:

```text
[1, 1, 1, 1, 1, 1, 1]
```

Now all `7` elements are consecutive `1`s.

Therefore, the maximum number of consecutive `1`s is:

```text
7
```

---

# Q2. Maximum Consecutive 1's by Swapping One 0 with One 1

## Problem Description

Given an array `A` consisting only of `0`s and `1`s, find the **maximum number of consecutive `1`s** that can be obtained by **swapping at most one `0` with one `1`**.

### Important

The operation is a **swap**, not a replacement.

You can swap:

```text
0 ↔ 1
```

at most once.

Therefore, the total number of `1`s in the array does not change.

For example, given:

```text
A = [1, 0, 1, 1, 0, 1]
```

We can swap the `0` at index `1` with the `1` at index `5`:

```text
[1, 0, 1, 1, 0, 1]
          ↓
[1, 1, 1, 1, 0, 0]
```

This gives `4` consecutive `1`s.

---

## Problem Constraints

- `1 <= N <= 100000`
- `A[i]` is either `0` or `1`

---

## Input Format

The first line contains an integer `N`, representing the size of the array.

The second line contains `N` integers representing the array `A`.

---

## Output Format

Return the maximum number of consecutive `1`s that can be obtained by swapping at most one `0` with one `1`.

---

## Example Input

### Input 1

```text
N = 6

1 0 1 1 0 1
```

### Input 2

```text
N = 7

1 1 0 1 1 1 0
```

---

## Example Output

### Output 1

```text
4
```

### Output 2

```text
5
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = [1, 0, 1, 1, 0, 1]
```

There are four `1`s in total.

We can swap the `0` at index `1` with the `1` at index `5`:

```text
Original:
[1, 0, 1, 1, 0, 1]
```

After swapping:

```text
[1, 1, 1, 1, 0, 0]
```

Now we have:

```text
4 consecutive 1's
```

We cannot obtain `5` consecutive `1`s because the array contains only four `1`s in total.

Therefore, the answer is:

```text
4
```

---

### Explanation 2

Given:

```text
A = [1, 1, 0, 1, 1, 1, 0]
```

There are five `1`s in total.

Swap the `0` at index `2` with the `1` at index `6`:

```text
Original:
[1, 1, 0, 1, 1, 1, 0]
```

After swapping:

```text
[1, 1, 1, 1, 1, 1, 0]
```

This gives:

```text
6 consecutive 1's
```

Therefore, the answer should actually be:

```text
6
```

> **Note:** The maximum can never be greater than the total number of `1`s present in the original array.

---

