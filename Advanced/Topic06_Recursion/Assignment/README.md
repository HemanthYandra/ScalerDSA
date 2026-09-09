# Q1. Find Factorial!

## Problem Description

Write a program to find the factorial of the given number `A` using recursion.

### Note

The factorial of a number `N` is defined as the product of the numbers from `1` to `N`.

---

## Problem Constraints

- `0 <= A <= 12`

---

## Input Format

First and only argument is an integer `A`.

---

## Output Format

Return an integer denoting the factorial of the number `A`.

---

## Example Input

### Input 1

```text
A = 4
```

### Input 2

```text
A = 1
```

---

## Example Output

### Output 1

```text
24
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

Factorial of `4` = `4 * 3 * 2 * 1` = `24`.

Therefore, the answer is:

```text
24
```

### Explanation 2

Factorial of `1` = `1`.

Therefore, the answer is:

```text
1
```

---

# Q2. Print 1 to A function

## Problem Description

You are given an integer `A`, print `1` to `A` using recursion.

### Note

After printing all the numbers from `1` to `A`, print a new line.

---

## Problem Constraints

- `1 <= A <= 10^4`

---

## Input Format

First argument `A` is an integer.

---

## Output Format

Print `A` space-separated integers `1` to `A`.

### Note

There should be exactly one space after each integer. After printing all the integers, print a new line.

---

## Example Input

### Input 1

```text
A = 10
```

### Input 2

```text
A = 5
```

---

## Example Output

### Output 1

```text
1 2 3 4 5 6 7 8 9 10 
```

### Output 2

```text
1 2 3 4 5 
```

---

## Example Explanation

### Explanation 1

Print `1` to `10` space separated integers.

Therefore, the output is:

```text
1 2 3 4 5 6 7 8 9 10 
```

### Explanation 2

Print `1` to `5` space separated integers.

Therefore, the output is:

```text
1 2 3 4 5 
```

---

# Q3. Find Fibonacci - II

## Problem Description

The Fibonacci numbers are the numbers in the following integer sequence.

```text
0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, ……..
```

In mathematical terms, the sequence `Fn` of Fibonacci numbers is defined by the recurrence relation:

```text
Fn = Fn-1 + Fn-2
```

Given a number `A`, find and return the `A-th` Fibonacci Number using recursion.

Given that `F0 = 0` and `F1 = 1`.

---

## Problem Constraints

- `0 <= A <= 20`

---

## Input Format

First and only argument is an integer `A`.

---

## Output Format

Return an integer denoting the `A-th` term of the sequence.

---

## Example Input

### Input 1

```text
A = 2
```

### Input 2

```text
A = 9
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
34
```

---

## Example Explanation

### Explanation 1

```text
f(2) = f(1) + f(0) = 1
```

Therefore, the answer is:

```text
1
```

### Explanation 2

```text
f(9) = f(8) + f(7) = 21 + 13 = 34
```

Therefore, the answer is:

```text
34
```

---

# Q4. Print Array using Recursion

## Problem Description

You are given an array `A`. Print the elements of the array using recursion.

### Note

- You are required to not use any loops. You can create new functions.
- Don't change the signature of the function `PrintArray`.
- Print a new empty line after printing the output.

---

## Problem Constraints

- `1 <= |A| <= 100`
- `-1000 <= A[i] <= 1000`

---

## Input Format

One line containing the array `A`.

---

## Output Format

Print the elements of the array in the sequential order.

---

## Example Input

### Input 1

```text
A = [6, -2, 5, 3]
```

### Input 2

```text
A = [1]
```

---

## Example Output

### Output 1

```text
6 -2 5 3 
```

### Output 2

```text
1 
```

---

