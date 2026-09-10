# Q1. Sum of Digits!

## Problem Description

Given a number `A`, we need to find the sum of its digits using recursion.

---

## Problem Constraints

- `1 <= A <= 10^9`

---

## Input Format

The first and only argument is an integer `A`.

---

## Output Format

Return an integer denoting the sum of digits of the number `A`.

---

## Example Input

### Input 1

```text
A = 46
```

### Input 2

```text
A = 11
```

---

## Example Output

### Output 1

```text
10
```

### Output 2

```text
2
```

---

## Example Explanation

### Explanation 1

Sum of digits of `46` = `4 + 6` = `10`.

Therefore, the answer is:

```text
10
```

### Explanation 2

Sum of digits of `11` = `1 + 1` = `2`.

Therefore, the answer is:

```text
2
```

---

# Q2. Print A to 1 function

## Problem Description

You are given an integer `A`, print `A` to `1` using recursion.

### Note

After printing all the numbers from `A` to `1`, print a new line.

---

## Problem Constraints

- `1 <= A <= 10^4`

---

## Input Format

First argument `A` is an integer.

---

## Output Format

Print `A` space-separated integers `A` to `1`.

### Note

There should be exactly one space after each integer. Print a new line after printing the `A` integers.

---

## Example Input

### Input 1

```text
10
```

### Input 2

```text
5
```

---

## Example Output

### Output 1

```text
10 9 8 7 6 5 4 3 2 1 
```

### Output 2

```text
5 4 3 2 1 
```

---

## Example Explanation

### Explanation 1

Print `10` to `1` space separated integers.

Therefore, the output is:

```text
10 9 8 7 6 5 4 3 2 1 
```

### Explanation 2

Print `5` to `1` space separated integers.

Therefore, the output is:

```text
5 4 3 2 1 
```

---

# Q3. Decreasing Increasing in one Function

## Problem Description

Print `N` numbers in Decreasing Order and then in Increasing Order.

1. You are given a positive number `N`.
2. You are required to print the numbers from `N` to `1`, and then from `1` to `N`.
3. You are required to not use any loops. Don't change the signature of the function `DecThenInc`.

### Note

Please print a new line after printing the output.

---

## Problem Constraints

- `1 <= N <= 100`

---

## Input Format

The first line contains a single integer `N`.

---

## Output Format

A single line having numbers printed from `N` to `1` and then from `1` to `N`.

---

## Example Input

### Input 1

```text
4
```

### Input 2

```text
1
```

---

## Example Output

### Output 1

```text
4 3 2 1 1 2 3 4
```

### Output 2

```text
1 1
```

---

## Example Explanation

### Explanation 1

Elements are first printed from `N` down to `1` and then `1` up to `N`.

For `N = 4`:

```text
4 3 2 1 1 2 3 4
```

### Explanation 2

Elements are first printed from `N` down to `1` and then `1` up to `N`.

For `N = 1`:

```text
1 1
```

---

