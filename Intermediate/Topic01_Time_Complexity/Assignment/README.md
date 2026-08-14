# Q1. Count of Factors

## Problem Description

Given an integer `A`, find and return the number of factors of `A`.

A factor of an integer `A` is an integer that divides `A` completely without leaving a remainder.

For example, the factors of `12` are:

```text
1, 2, 3, 4, 6, 12
```

Therefore, the number of factors of `12` is `6`.

---

## Problem Constraints

- `1 <= A <= 10^9`

---

## Input Format

The first and only argument is an integer `A`.

---

## Output Format

Return an integer denoting the number of factors of `A`.

---

## Example Input

### Input 1

```text
A = 12
```

### Input 2

```text
A = 10
```

---

## Example Output

### Output 1

```text
6
```

### Output 2

```text
4
```

---

## Example Explanation

### Explanation 1

The factors of `12` are:

```text
1, 2, 3, 4, 6, 12
```

There are `6` factors.

Therefore, the answer is:

```text
6
```

### Explanation 2

The factors of `10` are:

```text
1, 2, 5, 10
```

There are `4` factors.

Therefore, the answer is:

```text
4
```

---

# Q2. Prime or Not

## Problem Description

Given an integer `A`, determine whether `A` is a prime number.

A prime number is a positive integer greater than `1` that has exactly two factors:

```text
1 and itself
```

If `A` is a prime number, print:

```text
A is a Prime Number.
```

Otherwise, print:

```text
A is not a Prime Number.
```

---

## Problem Constraints

- `-10^9 <= A <= 10^9`

---

## Input Format

The first and only argument is an integer `A`.

---

## Output Format

Print whether `A` is a prime number or not.

---

## Example Input

### Input 1

```text
A = 7
```

### Input 2

```text
A = 10
```

### Input 3

```text
A = 1
```

---

## Example Output

### Output 1

```text
7 is a Prime Number.
```

### Output 2

```text
10 is not a Prime Number.
```

### Output 3

```text
1 is not a Prime Number.
```

---

## Example Explanation

### Explanation 1

The factors of `7` are:

```text
1, 7
```

Since `7` has exactly two factors, it is a prime number.

Therefore, the answer is:

```text
7 is a Prime Number.
```

### Explanation 2

The factors of `10` are:

```text
1, 2, 5, 10
```

Since `10` has more than two factors, it is not a prime number.

Therefore, the answer is:

```text
10 is not a Prime Number.
```

### Explanation 3

`1` has only one factor, which is `1`.

Therefore, `1` is not a prime number.

The answer is:

```text
1 is not a Prime Number.
```

---

