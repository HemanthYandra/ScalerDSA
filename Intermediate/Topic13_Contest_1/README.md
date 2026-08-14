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

