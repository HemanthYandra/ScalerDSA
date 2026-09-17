# Q1. Largest Coprime Divisor

## Problem Description

You are given two positive numbers `A` and `B`. You need to find the maximum valued integer `X` such that:

- `X` divides `A` i.e. `A % X = 0`
- `X` and `B` are co-prime i.e. `gcd(X, B) = 1`

---

## Problem Constraints

- `1 <= A, B <= 10^9`

---

## Input Format

First argument is an integer `A`.

Second argument is an integer `B`.

---

## Output Format

Return an integer, the maximum value of `X` as described above.

---

## Example Input

### Input 1

```text
A = 30
B = 12
```

### Input 2

```text
A = 5
B = 10
```

---

## Example Output

### Output 1

```text
5
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

All divisors of `A` are `(1, 2, 3, 5, 6, 10, 15, 30)`.

The maximum value is `5` such that `A % 5 == 0` and `gcd(5, 12) = 1`.

Therefore, the answer is:

```text
5
```

### Explanation 2

`1` is the only value such that `A % 1 == 0` and `gcd(1, 10) = 1`.

Therefore, the answer is:

```text
1
```

---

# Q2. Divisor game

## Problem Description

Scooby has `3` three integers `A`, `B`, and `C`.

Scooby calls a positive integer special if it is divisible by `B` and it is divisible by `C`. You need to tell the number of special integers less than or equal to `A`.

---

## Problem Constraints

- `1 <= A, B, C <= 10^9`

---

## Input Format

First argument is a positive integer `A`.

Second argument is a positive integer `B`.

Third argument is a positive integer `C`.

---

## Output Format

One integer corresponding to the number of special integers less than or equal to `A`.

---

## Example Input

### Input 1

```text
A = 12
B = 3
C = 2
```

### Input 2

```text
A = 6
B = 1
C = 4
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

The two integers divisible by `2` and `3` and less than or equal to `12` are `6, 12`.

Therefore, the answer is:

```text
2
```

### Explanation 2

Only `4` is a positive integer less than or equal to `6` which is divisible by `1` and `4`.

Therefore, the answer is:

```text
1
```

---

# Q3. Mod Sum

## Problem Description

Given an array of integers `A`, calculate the sum of `A[i] % A[j]` for all possible `i, j` pairs. Return `sum % (10^9 + 7)` as an output.

---

## Problem Constraints

- `1 <= length of the array A <= 10^5`
- `1 <= A[i] <= 10^3`

---

## Input Format

The only argument given is the integer array `A`.

---

## Output Format

Return a single integer denoting `sum % (10^9 + 7)`.

---

## Example Input

### Input 1

```text
A = [1, 2, 3]
```

### Input 2

```text
A = [17, 100, 11]
```

---

## Example Output

### Output 1

```text
5
```

### Output 2

```text
61
```

---

## Example Explanation

### Explanation 1

```text
(1 % 1) + (1 % 2) + (1 % 3) + (2 % 1) + (2 % 2) + (2 % 3) + (3 % 1) + (3 % 2) + (3 % 3) = 5
```

Therefore, the answer is:

```text
5
```

### Explanation 2

All pairs `A[i] % A[j]` for `A = [17, 100, 11]` are computed and summed up.

Therefore, the answer is:

```text
61
```

---

# Q4. A, B and Modulo

## Problem Description

Given two integers `A` and `B`, find the greatest possible positive integer `M`, such that `A % M = B % M`.

---

## Problem Constraints

- `1 <= A, B <= 10^9`
- `A != B`

---

## Input Format

The first argument is an integer `A`.

The second argument is an integer `B`.

---

## Output Format

Return an integer denoting the greatest possible positive `M`.

---

## Example Input

### Input 1

```text
A = 1
B = 2
```

### Input 2

```text
A = 5
B = 10
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
5
```

---

## Example Explanation

### Explanation 1

`1` is the largest value of `M` such that `A % M == B % M`.

Therefore, the answer is:

```text
1
```

### Explanation 2

For `M = 5`, `A % M = 0` and `B % M = 0`.

No value greater than `M = 5` satisfies the condition.

Therefore, the answer is:

```text
5
```

---

# Q5. Delete one

## Problem Description

You are given an integer array `A` of size `N`. You must remove exactly one element. Return the maximum possible gcd of the remaining `N - 1` elements.

---

## Problem Constraints

- `2 <= N <= 10^5`
- `1 <= A[i] <= 10^9`

---

## Input Format

The only argument is the integer array `A`.

---

## Output Format

Return a single integer, the maximum gcd after removing one element.

---

## Example Input

### Input 1

```text
A = [12, 15, 18]
```

### Input 2

```text
A = [5, 15, 30]
```

---

## Example Output

### Output 1

```text
6
```

### Output 2

```text
15
```

---

## Example Explanation

### Explanation 1

```text
Remove 12 -> gcd(15, 18) = 3
Remove 15 -> gcd(12, 18) = 6
Remove 18 -> gcd(12, 15) = 3
```

Best is `6`.

Therefore, the answer is:

```text
6
```

### Explanation 2

```text
Remove 5  -> gcd(15, 30) = 15
Remove 15 -> gcd(5, 30)  = 5
Remove 30 -> gcd(5, 15)  = 5
```

Best is `15`.

Therefore, the answer is:

```text
15
```

---

