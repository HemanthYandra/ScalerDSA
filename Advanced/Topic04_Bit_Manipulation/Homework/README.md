# Q1. Help From Sam

## Problem Description

Alex and Sam are good friends. Alex is doing a lot of programming these days. He has set a target score of `A` for himself.

Initially, Alex's score was zero. Alex can double his score by doing a question, or Alex can seek help from Sam for doing questions that will contribute `1` to Alex's score. Alex wants his score to be precisely `A`. Also, he does not want to take much help from Sam.

Find and return the minimum number of times Alex needs to take help from Sam to achieve a score of `A`.

---

## Problem Constraints

- `0 <= A <= 10^9`

---

## Input Format

The only argument given is an integer `A`.

---

## Output Format

Return the minimum number of times help taken from Sam.

---

## Example Input

### Input 1

```text
A = 5
```

### Input 2

```text
A = 3
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
2
```

---

## Example Explanation

### Explanation 1

```text
Initial score : 0
Takes help from Sam, score : 1
Alex solves a question, score : 2
Alex solves a question, score : 4
Takes help from Sam, score : 5
```

Therefore, the minimum number of times help is taken from Sam is:

```text
2
```

### Explanation 2

```text
Initial score : 0
Takes help from Sam, score : 1
Alex solves a question, score : 2
Takes help from Sam, score : 3
```

Therefore, the minimum number of times help is taken from Sam is:

```text
2
```

---

# Q2. Find nth Magic Number

## Problem Description

Given an integer `A`, find and return the `A-th` magic number.

A magic number is defined as a number that can be expressed as a power of `5` or a sum of unique powers of `5`.

First few magic numbers are `5, 25, 30(5 + 25), 125, 130(125 + 5), ...`.

---

## Problem Constraints

- `1 <= A <= 5000`

---

## Input Format

The only argument given is integer `A`.

---

## Output Format

Return the `A-th` magic number.

---

## Example Input

### Input 1

```text
A = 3
```

### Input 2

```text
A = 10
```

---

## Example Output

### Output 1

```text
30
```

### Output 2

```text
650
```

---

## Example Explanation

### Explanation 1

Magic Numbers in increasing order are `[5, 25, 30, 125, 130, ...]`.

`3rd` element in this is `30`.

Therefore, the answer is:

```text
30
```

### Explanation 2

In the sequence shown in explanation 1, `10th` element will be `650`.

Therefore, the answer is:

```text
650
```

---

# Q3. Unset x bits from right

## Problem Description

Given an integer `A`. Unset `B` bits from the right of `A` in binary.

For example, if `A = 93` and `B = 4`, the binary representation of `A` is `1011101`.

If we unset the rightmost `4` bits, we get the binary number `1010000`, which is equal to the decimal value `80`.

---

## Problem Constraints

- `1 <= A <= 10^18`
- `1 <= B <= 60`

---

## Input Format

The first argument is a single integer `A`.

The second argument is a single integer `B`.

---

## Output Format

Return the number with `B` unset bits from the right.

---

## Example Input

### Input 1

```text
A = 25
B = 3
```

### Input 2

```text
A = 37
B = 3
```

---

## Example Output

### Output 1

```text
24
```

### Output 2

```text
32
```

---

## Example Explanation

### Explanation 1

```text
A = 11001 to 11000
```

Therefore, the answer is:

```text
24
```

### Explanation 2

```text
A = 100101 to 100000
```

Therefore, the answer is:

```text
32
```

---

