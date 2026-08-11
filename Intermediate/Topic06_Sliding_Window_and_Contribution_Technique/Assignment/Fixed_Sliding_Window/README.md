# Q1. Maximum Sum Subarray of Size K

## Problem Description

Given an integer array `A` of size `N` and an integer `K`, find the **maximum sum** among all contiguous subarrays of size `K`.

Return the maximum sum.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^4 <= A[i] <= 10^4`
- `1 <= K <= N`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `K`.

---

## Output Format

- Return a single integer representing the **maximum sum** of any contiguous subarray of size `K`.

---

## Example Input

### Input 1

```text
A = [2, 3, 4, 1, 5]
K = 2
```

---

## Example Output

### Output 1

```text
7
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [2, 3, 4, 1, 5]
K = 2
```

The subarrays of size `2` are:

```text
[2, 3] → Sum = 5
[3, 4] → Sum = 7
[4, 1] → Sum = 5
[1, 5] → Sum = 6
```

The maximum sum among these subarrays is:

```text
7
```

Hence, the answer is:

```text
7
```

---

## Expected Complexity

| Complexity | Value |
|------------|-------|
| **Time** | **O(N)** |
| **Space** | **O(1)** |

---

# Q2. Subarray with Given Sum and Length

## Problem Description

Given an array `A` of length `N` and two integers `B` and `C`.

Your task is to determine whether there exists a **subarray of length `B`** whose sum is exactly `C`.

- Return `1` if such a subarray exists.
- Otherwise, return `0`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^4`
- `1 <= B <= N`
- `1 <= C <= 10^9`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.
- The third argument is an integer `C`.

---

## Output Format

- Return `1` if there exists a subarray of length `B` with sum `C`.
- Otherwise, return `0`.

---

## Example Input

### Input 1

```text
A = [4, 3, 2, 6, 1]
B = 3
C = 11
```

### Input 2

```text
A = [4, 2, 2, 5, 1]
B = 4
C = 6
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
0
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [4, 3, 2, 6, 1]
B = 3
C = 11
```

The subarray:

```text
[3, 2, 6]
```

has:

- Length = `3`
- Sum = `3 + 2 + 6 = 11`

Hence, such a subarray exists, so the answer is:

```text
1
```

---

### Explanation 2

For the array:

```text
A = [4, 2, 2, 5, 1]
B = 4
C = 6
```

There is no subarray of length `4` whose sum is `6`.

Hence, the answer is:

```text
0
```

---

