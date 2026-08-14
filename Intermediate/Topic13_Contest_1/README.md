# Q1. SuperStream Engineers

## Problem Description

You've just been hired as a network engineer at SuperStream, a leading video streaming service. One of your first tasks is to optimize the number of video data packets sent to users based on their internet connectivity.

When a user hits "play," video data is transmitted in packets. If their device acknowledges these packets quickly, it means they have a strong connection and can receive more packets simultaneously for smoother streaming. If acknowledgments lag, fewer packets should be sent to prevent buffering.

Given an array `A`, where each entry represents the acknowledgment time (in milliseconds) for individual packets, and two integers `B` and `C`, can you determine if there's a continuous sequence of `B` packets with an average acknowledgment time less than or equal to `C` milliseconds?

If yes, it's a green signal (integer `1`) to send more packets. Otherwise, it's time to throttle back (integer `0`).

### Note

For average, take the floor of:

```text
(sum / total number of elements)
```

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`
- `1 <= B <= N`
- `1 <= C <= 10^9`

---

## Input Format

The first argument `A` is an array of integers.

The remaining arguments `B` and `C` are integers.

---

## Output Format

Return `1` if such a subarray exists and `0` otherwise.

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

Consider subarray:

```text
[22, 18, 15]
```

Sum:

```text
22 + 18 + 15 = 55
```

Floor avg:

```text
⌊55 / 3⌋ = 18
```

Since `18 <= 30`, valid subarray exist. Answer:

```text
1
```

---

# Q2. Range Divisibility

## Problem Description

Samantha is a teacher who is teaching a group of students about divisibility by `7`. To make the lesson more interesting, she gives them an array `A` of size `N` and asks them `Q` queries given by `B`.

In each query, she gives them a range from `L` to `R` given by `B[i][0]` and `B[i][1]` and asks them to find the count of numbers divisible by `7` in subarray `A[L], A[L+1], ..., A[R]`.

Since some students are struggling to solve the problem, Samantha asks for your help to come up with a solution.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= Q <= 10^5`
- `1 <= A[i] <= 10^9`
- `0 <= B[i][0], B[i][1] < N`

---

## Input Format

The first argument `A` is an integer array.

The second argument `B` is a 2D integer array.

---

## Output Format

Return an integer array where the element at index `i` contains the count of numbers divisible by `7` in the range:

```text
A[B[i][0]] to A[B[i][1]]
```

---

## Example Input

### Input 1

```text
A = [7, 14, 21, 2, 5, 56]

B = [[1, 3], [4, 5], [2, 3], [0, 4]]
```

---

## Example Output

### Output 1

```text
[2, 1, 1, 3]
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = [7, 14, 21, 2, 5, 56]
```

Query `[1, 3]` -> subarray `[14, 21, 2]`:

```text
14 divisible by 7
21 divisible by 7
2 not divisible by 7
```

Count = `2`.

Query `[4, 5]` -> subarray `[5, 56]`:

```text
5 not divisible by 7
56 divisible by 7
```

Count = `1`.

Query `[2, 3]` -> subarray `[21, 2]`:

```text
21 divisible by 7
2 not divisible by 7
```

Count = `1`.

Query `[0, 4]` -> subarray `[7, 14, 21, 2, 5]`:

```text
7 divisible by 7
14 divisible by 7
21 divisible by 7
2 not divisible by 7
5 not divisible by 7
```

Count = `3`.

Therefore, the answer is:

```text
[2, 1, 1, 3]
```

---

# Q3. Alice and Capitalizing

## Problem Description

Alice is developing a function that processes strings for a text analysis tool. She wants to write a function that capitalizes the segment of a String `A` starting from the first occurrence of a given character `B` to the end of the string.

If the given character is not found, the string should remain unchanged.

For example, if the string is `"good morning"` and the given character is `"m"`, then the function should capitalize the segment that starts from the first occurrence of `"m"` to the end of the string.

The resulting string will be:

```text
good MORNING
```

Complete the given function to help Alice accomplish this task.

---

## Problem Constraints

- `1 <= A.length <= 10^5`
- `A[i]` contains lowercase English alphabets and spaces.
- `B.length = 1`
- `B` contains a lowercase English Alphabet.

---

## Input Format

The first argument is a string containing only lowercase alphabets and spaces.

The second argument is a string of size `1` containing the character.

---

## Output Format

Return a string denoting the string after performing the given operation.

---

## Example Input

### Input 1

```text
A = "good morning"
B = "m"
```

### Input 2

```text
A = "scaler academy"
B = "a"
```

---

## Example Output

### Output 1

```text
good MORNING
```

### Output 2

```text
scALER ACADEMY
```

---

## Example Explanation

### Explanation 1

The first occurrence of `"m"` is in `"morning"`.

Capitalize the string from `"m"` to the end:

```text
good morning
     ↓
good MORNING
```

Therefore, the answer is:

```text
good MORNING
```

### Explanation 2

The first occurrence of `"a"` is at index `2` in `"scaler academy"`.

Capitalize the string from that `"a"` to the end:

```text
scaler academy
  ↓
scALER ACADEMY
```

Therefore, the answer is:

```text
scALER ACADEMY
```

---

# Q4. Noble Integer

## Problem Description

Given int array `A`, find if int `p` exist in array such that number of integers greater than `p` in array equals `p`.

In other words, find element `p` such that:

```text
Number of elements greater than p = p
```

---

## Problem Constraints

- `1 <= |A| <= 2 * 10^5`
- `-10^8 <= A[i] <= 10^8`

---

## Input Format

First and only argument int array `A`.

---

## Output Format

Return `1` if any such int `p` present, else return `-1`.

---

## Example Input

### Input 1

```text
A = [3, 2, 1, 3]
```

### Input 2

```text
A = [-1, 0, 1, 2]
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

For:

```text
A = [3, 2, 1, 3]
```

Consider:

```text
p = 2
```

Exactly `2` integers greater than `2`:

```text
3, 3
```

Since:

```text
Number of elements greater than p = p
2 = 2
```

`p = 2` noble integer. Answer:

```text
1
```

### Explanation 2

For:

```text
A = [-1, 0, 1, 2]
```

Consider:

```text
p = 1
```

Exactly `1` integer greater than `1`:

```text
2
```

Since:

```text
Number of elements greater than p = p
1 = 1
```

`p = 1` noble integer. Answer:

```text
1
```

---

