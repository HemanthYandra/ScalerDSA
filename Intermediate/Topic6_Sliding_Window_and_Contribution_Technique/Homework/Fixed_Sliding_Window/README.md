# Q1. Minimum Sum Subarray of Size K

## Problem Description

Given an integer array `A` of size `N` and an integer `K`, find the **minimum sum** among all contiguous subarrays of size `K`.

Return the minimum sum.

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

- Return a single integer representing the **minimum sum** of any contiguous subarray of size `K`.

---

## Example Input

### Input 1

```text
A = [3, 1, 4, 1, 5, 9, 2, 6]
K = 3
```

---

## Example Output

### Output 1

```text
6
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [3, 1, 4, 1, 5, 9, 2, 6]
K = 3
```

The subarrays of size `3` are:

```text
[3, 1, 4] → Sum = 8
[1, 4, 1] → Sum = 6
[4, 1, 5] → Sum = 10
[1, 5, 9] → Sum = 15
[5, 9, 2] → Sum = 16
[9, 2, 6] → Sum = 17
```

The minimum sum among these subarrays is:

```text
6
```

Hence, the answer is:

```text
6
```

---

## Expected Complexity

| Complexity | Value |
|------------|-------|
| **Time** | **O(N)** |
| **Space** | **O(1)** |

---

# Q2. Average of Every Subarray of Size K

## Problem Description

Given an integer array `A` of size `N` and an integer `K`, find the **average** of every contiguous subarray of size `K`.

Return the averages as a **double array**.

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

- Return a double array containing the average of every contiguous subarray of size `K`.

---

## Example Input

### Input 1

```text
A = [1, 3, 2, 6, 4]
K = 2
```

---

## Example Output

### Output 1

```text
[2.0, 2.5, 4.0, 5.0]
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [1, 3, 2, 6, 4]
K = 2
```

The subarrays of size `2` are:

```text
[1, 3] → Average = (1 + 3) / 2 = 2.0
[3, 2] → Average = (3 + 2) / 2 = 2.5
[2, 6] → Average = (2 + 6) / 2 = 4.0
[6, 4] → Average = (6 + 4) / 2 = 5.0
```

Hence, the answer is:

```text
[2.0, 2.5, 4.0, 5.0]
```

---

## Expected Complexity

| Complexity | Value |
|------------|-------|
| **Time** | **O(N)** |
| **Space** | **O(1)** *(excluding the output array)* |

---

# Q3. SuperStream Engineers

## Problem Description

You've just been hired as a network engineer at **SuperStream**, a leading video streaming service.

One of your first tasks is to optimize the number of video data packets sent to users based on their internet connectivity.

When a user hits **Play**, video data is transmitted in packets. If the device acknowledges these packets quickly, it indicates a strong connection, allowing the server to send more packets simultaneously for smoother streaming. If acknowledgments are slow, fewer packets should be sent to avoid buffering.

You are given an integer array `A`, where each element represents the acknowledgment time (in milliseconds) for a packet, along with two integers `B` and `C`.

Determine whether there exists a **contiguous subarray of length `B`** whose **average acknowledgment time** is **less than or equal to `C`**.

> **Note:** While calculating the average, use the floor value:
>
> ```text
> floor(sum / B)
> ```

- Return `1` if such a subarray exists.
- Otherwise, return `0`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`
- `1 <= B <= N`
- `1 <= C <= 10^9`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.
- The third argument is an integer `C`.

---

## Output Format

- Return `1` if there exists a subarray of length `B` whose average is less than or equal to `C`.
- Otherwise, return `0`.

---

## Example Input

### Input 1

```text
A = [30, 25, 40, 35, 20, 45, 50, 55, 22, 18, 15]
B = 3
C = 30
```

---

## Example Output

### Output 1

```text
1
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [30, 25, 40, 35, 20, 45, 50, 55, 22, 18, 15]
B = 3
C = 30
```

Consider the subarray:

```text
[35, 20, 45]
```

Its average is:

```text
floor((35 + 20 + 45) / 3)
= floor(100 / 3)
= 33
```

This does **not** satisfy the condition.

Now consider:

```text
[22, 18, 15]
```

Its average is:

```text
floor((22 + 18 + 15) / 3)
= floor(55 / 3)
= 18
```

Since:

```text
18 <= 30
```

A valid subarray exists.

Hence, the answer is:

```text
1
```

---

## Expected Complexity

| Complexity | Value |
|------------|-------|
| **Time** | **O(N)** |
| **Space** | **O(1)** |

---

# Q4. Minimum Swaps

## Problem Description

Given an integer array `A` and an integer `B`, find the **minimum number of swaps** required to bring **all elements less than or equal to `B` together**.

> **Note:** You can swap **any two elements** in the array. The swapped elements do **not** have to be adjacent.

---

## Problem Constraints

- `1 <= length(A) <= 10^5`
- `-10^9 <= A[i], B <= 10^9`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.

---

## Output Format

- Return a single integer denoting the **minimum number of swaps** required.

---

## Example Input

### Input 1

```text
A = [1, 12, 10, 3, 14, 10, 5]
B = 8
```

### Input 2

```text
A = [5, 17, 100, 11]
B = 20
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [1, 12, 10, 3, 14, 10, 5]
B = 8
```

The elements less than or equal to `8` are:

```text
[1, 3, 5]
```

One possible sequence of swaps is:

1. Swap `12` and `3`:

```text
[1, 3, 10, 12, 14, 10, 5]
```

2. Swap the first `10` and `5`:

```text
[1, 3, 5, 12, 14, 10, 10]
```

Now all elements less than or equal to `8` are together.

Hence, the minimum number of swaps is:

```text
2
```

---

### Explanation 2

For the array:

```text
A = [5, 17, 100, 11]
B = 20
```

The elements less than or equal to `20` are:

```text
[5, 17, 11]
```

Swap `100` and `11`:

```text
[5, 17, 11, 100]
```

Now all elements less than or equal to `20` are together.

Hence, the minimum number of swaps is:

```text
1
```

---

# Q5. Subarray with Least Average

## Problem Description

Given an integer array `A` of size `N` and an integer `B`, find the **subarray of size `B`** that has the **least average**.

Return the **index of the first element** of that subarray.

> **Note:** Array indexing starts from `0`.

---

## Problem Constraints

- `1 <= B <= N <= 10^5`
- `-10^5 <= A[i] <= 10^5`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.

---

## Output Format

- Return the starting index of the subarray of size `B` having the least average.

---

## Example Input

### Input 1

```text
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
```

### Input 2

```text
A = [3, 7, 5, 20, -10, 0, 12]
B = 2
```

---

## Example Output

### Output 1

```text
3
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
A = [3, 7, 90, 20, 10, 50, 40]
B = 3
```

The subarrays of size `3` are:

```text
[3, 7, 90]   → Average = 100 / 3 ≈ 33.33
[7, 90, 20]  → Average = 117 / 3 = 39
[90, 20, 10] → Average = 120 / 3 = 40
[20, 10, 50] → Average = 80 / 3 ≈ 26.67
[10, 50, 40] → Average = 100 / 3 ≈ 33.33
```

The least average is for the subarray:

```text
[20, 10, 50]
```

Starting index:

```text
3
```

Hence, the answer is:

```text
3
```

---

### Explanation 2

For the array:

```text
A = [3, 7, 5, 20, -10, 0, 12]
B = 2
```

The subarrays of size `2` are:

```text
[3, 7]    → Average = 5
[7, 5]    → Average = 6
[5, 20]   → Average = 12.5
[20, -10] → Average = 5
[-10, 0]  → Average = -5
[0, 12]   → Average = 6
```

The least average is for the subarray:

```text
[-10, 0]
```

Starting index:

```text
4
```

Hence, the answer is:

```text
4
```