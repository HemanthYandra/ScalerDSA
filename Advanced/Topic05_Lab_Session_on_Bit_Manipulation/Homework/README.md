# Q1. SUBARRAY OR

## Problem Description

You are given an array of integers `A` of size `N`.

The value of a subarray is defined as BITWISE OR of all elements in it.

Return the sum of value of all subarrays of `A % (10^9 + 7)`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^8`

---

## Input Format

The first argument given is the integer array `A`.

---

## Output Format

Return the sum of value of all subarrays of `A % (10^9 + 7)`.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
```

### Input 2

```text
A = [7, 8, 9, 10]
```

---

## Example Output

### Output 1

```text
71
```

### Output 2

```text
110
```

---

## Example Explanation

### Explanation 1

```text
Value([1]) = 1
Value([1, 2]) = 3
Value([1, 2, 3]) = 3
Value([1, 2, 3, 4]) = 7
Value([1, 2, 3, 4, 5]) = 7
Value([2]) = 2
Value([2, 3]) = 3
Value([2, 3, 4]) = 7
Value([2, 3, 4, 5]) = 7
Value([3]) = 3
Value([3, 4]) = 7
Value([3, 4, 5]) = 7
Value([4]) = 4
Value([4, 5]) = 5
Value([5]) = 5
```

Sum of all these values = `71`.

Therefore, the answer is:

```text
71
```

### Explanation 2

Sum of value of all subarrays is `110`.

Therefore, the answer is:

```text
110
```

---

# Q2. Min XOR value

## Problem Description

Given an integer array `A` of `N` integers, find the pair of integers in the array which have minimum XOR value. Report the minimum XOR value.

---

## Problem Constraints

- `2 <= length of the array <= 100000`
- `0 <= A[i] <= 10^9`

---

## Input Format

First and only argument of input contains an integer array `A`.

---

## Output Format

Return a single integer denoting minimum XOR value.

---

## Example Input

### Input 1

```text
A = [0, 2, 5, 7]
```

### Input 2

```text
A = [0, 4, 7, 9]
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
3
```

---

## Example Explanation

### Explanation 1

```text
0 xor 2 = 2
```

Therefore, the answer is:

```text
2
```

### Explanation 2

```text
4 xor 7 = 3
```

Therefore, the answer is:

```text
3
```

---

# Q3. Strange Equality

## Problem Description

Given an integer `A`.

Two numbers, `X` and `Y`, are defined as follows:

- `X` is the greatest number smaller than `A` such that the XOR sum of `X` and `A` is the same as the sum of `X` and `A`.
- `Y` is the smallest number greater than `A`, such that the XOR sum of `Y` and `A` is the same as the sum of `Y` and `A`.

Find and return the XOR of `X` and `Y`.

### Note 1

XOR of `X` and `Y` is defined as `X ^ Y` where `^` is the BITWISE XOR operator.

### Note 2

Your code will be run against a maximum of `100000` test cases.

---

## Problem Constraints

- `1 <= A <= 10^9`

---

## Input Format

First and only argument is an integer `A`.

---

## Output Format

Return an integer denoting the XOR of `X` and `Y`.

---

## Example Input

```text
A = 5
```

---

## Example Output

```text
10
```

---

## Example Explanation

`A = 5` is `101` in binary.

`X` must be the greatest number smaller than `5` such

---

