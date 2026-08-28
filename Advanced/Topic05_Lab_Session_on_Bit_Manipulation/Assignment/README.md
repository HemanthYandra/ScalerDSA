# Q1. Number of 1 Bits

## Problem Description

Write a function that takes an integer and returns the number of `1` bits present in its binary representation.

---

## Problem Constraints

- `1 <= A <= 10^9`

---

## Input Format

First and only argument contains integer `A`.

---

## Output Format

Return an integer.

---

## Example Input

### Input 1

```text
11
```

### Input 2

```text
6
```

---

## Example Output

### Output 1

```text
3
```

### Output 2

```text
2
```

---

## Example Explanation

### Explanation 1

`11` is represented as `1011` in binary.

Therefore, the answer is:

```text
3
```

### Explanation 2

`6` is represented as `110` in binary.

Therefore, the answer is:

```text
2
```

---

# Q2. Finding Good Days

## Problem Description

Alex has a cat named Boomer. He decides to put his cat to the test for eternity.

He starts on day `1` with one stash of food unit, every next day, the stash doubles.

If Boomer is well behaved during a particular day, only then she receives food worth equal to the stash produced on that day.

Boomer receives a net worth of `A` units of food. What is the number of days she received the stash?

---

## Problem Constraints

- `1 <= A <= 2^31 - 1`

---

## Input Format

First and only argument is an integer `A`.

---

## Output Format

Return an integer denoting the number of days Boomer was well behaved.

---

## Example Input

### Input 1

```text
A = 5
```

### Input 2

```text
A = 8
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

To eat a total of `5` units of food, Boomer behaved normally on Day `1` and on Day `3`.

Therefore, the answer is:

```text
2
```

### Explanation 2

To eat a total of `8` units of food, Boomer behaved normally only on day `4`.

Therefore, the answer is:

```text
1
```

---

# Q3. Single Number II

## Problem Description

Given an array of integers, every element appears thrice except for one, which occurs once.

Find that element that does not appear thrice.

### Note

Your algorithm should have a linear runtime complexity.

Could you implement it without using extra memory?

---

## Problem Constraints

- `2 <= |A| <= 5 * 10^6`
- `0 <= A[i] <= INTMAX`

---

## Input Format

First and only argument of input contains an integer array `A`.

---

## Output Format

Return a single integer.

---

## Example Input

### Input 1

```text
A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1]
```

### Input 2

```text
A = [0, 0, 0, 1]
```

---

## Example Output

### Output 1

```text
4
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

`4` occurs exactly once in Input 1.

Therefore, the answer is:

```text
4
```

### Explanation 2

`1` occurs exactly once in Input 2.

Therefore, the answer is:

```text
1
```

---

