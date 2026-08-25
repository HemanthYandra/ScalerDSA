# Q1. Bitwise Operators

## Problem Description

Given two positive integers `A` and `B`, perform the basic bitwise operations on them.

You need to calculate and print the results of:

- Bitwise AND (`&`)
- Bitwise OR (`|`)
- Bitwise XOR (`^`)
- Bitwise NOT (`~`) of `A`
- Bitwise NOT (`~`) of `B`

## Constraints

- `1 <= A, B <= 10^9`

## Input Format

The input consists of two positive integers:

```text
A
B
```

## Output Format

Print the result of each bitwise operation in the following format:

```text
A & B = <result>
A | B = <result>
A ^ B = <result>
~A = <result>
~B = <result>
```

## Example 1

**Input:**

```text
5
3
```

**Output:**

```text
A & B = 1
A | B = 7
A ^ B = 6
~A = -6
~B = -4
```

## Example Explanation

For `A = 5` and `B = 3`:

```text
5 = 0101
3 = 0011
```

Therefore:

```text
5 & 3 = 0001 = 1
5 | 3 = 0111 = 7
5 ^ 3 = 0110 = 6
```

The bitwise NOT operation in Java follows:

```text
~A = -(A + 1)
```

So:

```text
~5 = -6
~3 = -4
```

---


# Q2. Properties of Bitwise AND

## Problem Description

Given a positive integer `A`, demonstrate the basic properties of the bitwise AND (`&`) operator.

Calculate and print the results of:

1. `A & 0`
2. `A & 1`
3. `A & A`

## Constraints

- `1 <= A <= 10^9`

## Input Format

The input consists of a single positive integer:

```text
A
```

## Output Format

Print the results in the following format:

```text
A & 0 = <result>
A & 1 = <result>
A & A = <result>
```

## Example 1

**Input:**

```text
5
```

**Output:**

```text
A & 0 = 0
A & 1 = 1
A & A = 5
```

## Example Explanation

For `A = 5`:

```text
5 = 0101
```

Therefore:

```text
5 & 0 = 0
5 & 1 = 1
5 & 5 = 5
```

The important properties are:

```text
A & 0 = 0
A & 1 = least significant bit of A
A & A = A
```

---

# Q3. Properties of Bitwise OR

## Problem Description

Given a positive integer `A`, demonstrate the basic properties of the bitwise OR (`|`) operator.

Calculate and print the results of:

1. `A | 0`
2. `A | 1`
3. `A | A`

## Constraints

- `1 <= A <= 10^9`

## Input Format

The input consists of a single positive integer:

```text
A
```

## Output Format

Print the results in the following format:

```text
A | 0 = <result>
A | 1 = <result>
A | A = <result>
```

## Example 1

**Input:**

```text
6
```

**Output:**

```text
A | 0 = 6
A | 1 = 7
A | A = 6
```

## Example Explanation

For `A = 6`:

```text
6 = 0110
```

Therefore:

```text
6 | 0 = 6
6 | 1 = 7
6 | 6 = 6
```

The important properties are:

```text
A | 0 = A
A | 1 = sets the least significant bit to 1
A | A = A
```

If `A` is even, `A | 1` produces the next odd number. If `A` is already odd, it remains unchanged.

---

# Q4. Properties of Bitwise XOR

## Problem Description

Given a positive integer `A`, demonstrate the basic properties of the bitwise XOR (`^`) operator.

Calculate and print the results of:

1. `A ^ 0`
2. `A ^ 1`
3. `A ^ A`

## Constraints

- `1 <= A <= 10^9`

## Input Format

The input consists of a single positive integer:

```text
A
```

## Output Format

Print the results in the following format:

```text
A ^ 0 = <result>
A ^ 1 = <result>
A ^ A = <result>
```

## Example 1

**Input:**

```text
6
```

**Output:**

```text
A ^ 0 = 6
A ^ 1 = 7
A ^ A = 0
```

## Example Explanation

For `A = 6`:

```text
6 = 0110
1 = 0001
```

Therefore:

```text
6 ^ 0 = 6
6 ^ 1 = 7
6 ^ 6 = 0
```

The important properties are:

```text
A ^ 0 = A
A ^ 1 = toggles the least significant bit
A ^ A = 0
```

If `A` is even, `A ^ 1` produces an odd number. If `A` is odd, `A ^ 1` produces an even number.

---

# Q5. Left Shift Operator

## Problem Description

Given a positive integer `A` and a non-negative integer `B`, perform the left shift operation on `A` by `B` positions.

Use the left shift operator:

```text
A << B
```

A left shift moves all the bits of `A` to the left by `B` positions. For each left shift by one position, the value is multiplied by `2`.

## Constraints

- `1 <= A <= 10^9`
- `0 <= B <= 30`

## Input Format

The input consists of two integers:

```text
A
B
```

## Output Format

Print the result in the following format:

```text
A << B = <result>
```

## Example 1

**Input:**

```text
5
2
```

**Output:**

```text
A << B = 20
```

## Example Explanation

For `A = 5`:

```text
5 = 0101
```

Left shifting by `2` positions:

```text
0101 << 2
= 010100
= 20
```

Therefore:

```text
5 << 2 = 20
```

---

# Q6. Right Shift Operator

## Problem Description

Given a positive integer `A` and a non-negative integer `B`, perform the right shift operation on `A` by `B` positions.

Use the right shift operator:

```text
A >> B
```

A right shift moves all the bits of `A` to the right by `B` positions. For positive integers, each right shift by one position approximately divides the value by `2`.

## Constraints

- `1 <= A <= 10^9`
- `0 <= B <= 30`

## Input Format

The input consists of two integers:

```text
A
B
```

## Output Format

Print the result in the following format:

```text
A >> B = <result>
```

## Example 1

**Input:**

```text
20
2
```

**Output:**

```text
A >> B = 5
```

## Example Explanation

For `A = 20`:

```text
20 = 10100
```

Right shifting by `2` positions:

```text
10100 >> 2
= 00101
= 5
```

Therefore:

```text
20 >> 2 = 5
```

---

