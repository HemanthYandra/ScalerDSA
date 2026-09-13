# Q1. Implement Power Function

## Problem Description

Implement `pow(A, B) % C`.

In other words, given `A`, `B` and `C`, find `(A^B % C)`.

### Note

The remainders on division cannot be negative. In other words, make sure the answer you return is non-negative.

---

## Problem Constraints

- `-10^9 <= A <= 10^9`
- `0 <= B <= 10^9`
- `1 <= C <= 10^9`

---

## Input Format

Given three integers `A`, `B`, `C`.

---

## Output Format

Return an integer.

---

## Example Input

### Input 1

```text
A = 2
B = 3
C = 3
```

### Input 2

```text
A = 3
B = 3
C = 1
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
0
```

---

## Example Explanation

### Explanation 1

```text
2^3 % 3 = 8 % 3 = 2
```

Therefore, the answer is:

```text
2
```

### Explanation 2

```text
3^3 % 1 = 27 % 1 = 0
```

Therefore, the answer is:

```text
0
```

---

# Q2. Pair Sum divisible by M

## Problem Description

Given an array of integers `A` and an integer `B`, find and return the number of pairs in `A` whose sum is divisible by `B`.

Since the answer may be large, return the answer modulo `(10^9 + 7)`.

### Note

Ensure to handle integer overflow when performing the calculations.

---

## Problem Constraints

- `1 <= length of the array <= 100000`
- `1 <= A[i] <= 10^9`
- `1 <= B <= 10^6`

---

## Input Format

The first argument given is the integer array `A`.

The second argument given is the integer `B`.

---

## Output Format

Return the total number of pairs for which the sum is divisible by `B` modulo `(10^9 + 7)`.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
B = 2
```

### Input 2

```text
A = [5, 17, 100, 11]
B = 28
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

All pairs which are divisible by `2` are `(1, 3), (1, 5), (2, 4), (3, 5)`.

So total `4` pairs.

Therefore, the answer is:

```text
4
```

### Explanation 2

There is only one pair which is divisible by `28`, which is `(17, 11)`.

Therefore, the answer is:

```text
1
```

---

# Q3. Greatest Common Divisor

## Problem Description

Given `2` non-negative integers `A` and `B`, find `gcd(A, B)`.

GCD of `2` integers `A` and `B` is defined as the greatest integer `'g'` such that `'g'` is a divisor of both `A` and `B`. Both `A` and `B` fit in a `32-bit` signed integer.

### Note

DO NOT USE LIBRARY FUNCTIONS.

---

## Problem Constraints

- `0 <= A, B <= 10^9`

---

## Input Format

First argument is an integer `A`.

Second argument is an integer `B`.

---

## Output Format

Return an integer denoting the `gcd(A, B)`.

---

## Example Input

### Input 1

```text
A = 4
B = 6
```

### Input 2

```text
A = 6
B = 7
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

`2` divides both `4` and `6`.

Therefore, the answer is:

```text
2
```

### Explanation 2

`1` divides both `6` and `7`.

Therefore, the answer is:

```text
1
```

---

