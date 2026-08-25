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

# Q2. Check Whether a Number is Even or Odd Using Bitwise AND

## Problem Description

Given a positive integer `A`, determine whether the number is even or odd using the bitwise AND (`&`) operator.

You must use the expression:

```text
A & 1
```

If the result is `1`, the number is odd. If the result is `0`, the number is even.

## Constraints

- `1 <= A <= 10^9`

## Input Format

The input consists of a single positive integer:

```text
A
```

## Output Format

Print:

```text
A is odd number.
```

if `A` is odd, otherwise print:

```text
A is even number.
```

## Example 1

**Input:**

```text
5
```

**Output:**

```text
5 is odd number.
```

## Example Explanation

The binary representation of `5` is:

```text
0101
```

Performing AND with `1`:

```text
0101
& 0001
------
0001
```

The result is `1`, so `5` is odd.

## Example 2

**Input:**

```text
6
```

**Output:**

```text
6 is even number.
```

## Example Explanation

The binary representation of `6` is:

```text
0110
```

Performing AND with `1`:

```text
0110
& 0001
------
0000
```

The result is `0`, so `6` is even.

---

# Q3. Properties of Bitwise AND

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

# Q4. Properties of Bitwise OR

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

# Q5. Properties of Bitwise XOR

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

# Q6. Left Shift Operator

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

# Q7. Right Shift Operator

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

# Q8. Bit Manipulation with Negative Numbers

## Problem Description

Given two integers `A` and `B`, and a non-negative shift value `N`, demonstrate the behavior of basic bit manipulation operations in Java.

The program should perform the following operations:

1. Bitwise AND (`&`) between `A` and `B`.
2. Bitwise OR (`|`) between `A` and `B`.
3. Bitwise XOR (`^`) between `A` and `B`.
4. Bitwise NOT (`~`) of `A`.
5. Bitwise NOT (`~`) of `B`.
6. Check whether `A` is even or odd using `A & 1`.
7. Left shift (`<<`) of `A` by `N` positions.
8. Signed right shift (`>>`) of `A` by `N` positions.
9. Unsigned right shift (`>>>`) of `A` by `N` positions.
10. Perform XOR of `A` with itself.
11. Perform AND of `A` with `0`.
12. Perform OR of `A` with `0`.
13. Perform XOR of `A` with `0`.
14. Demonstrate integer overflow using `1 << 31`.

The input may contain positive or negative integers. This problem demonstrates how Java performs bitwise operations on signed 32-bit `int` values using two's complement representation.

---

## Constraints

- `-10^9 <= A, B <= 10^9`
- `0 <= N <= 30`

---

## Input Format

The input consists of three integers, entered as:

```text
Enter any integer(a): A
Enter another integer(b): B
Enter shift value(n): N
```

---

## Output Format

Print the result of each operation in the following format:

```text
a & b = <result>
a | b = <result>
a ^ b = <result>
~a = <result>
~b = <result>
a is odd / a is even
a << n = <result>
a >> n = <result>
a >>> n = <result>
a ^ a = <result>
a & 0 = <result>
a | 0 = <result>
a ^ 0 = <result>
1 << 31 = <result>
```

---

## Example Input

### Input 1

```text
Enter any integer(a): -5
Enter another integer(b): 3
Enter shift value(n): 2
```

---

## Example Output

### Output 1

```text
a & b = 3
a | b = -5
a ^ b = -8
~a = 4
~b = -4
a is odd
a << n = -20
a >> n = -2
a >>> n = 1073741822
a ^ a = 0
a & 0 = 0
a | 0 = -5
a ^ 0 = -5
1 << 31 = -2147483648
```

---

## Example Explanation

### Explanation 1

For `A = -5`, Java stores the value using 32-bit two's complement representation:

```text
-5 = 11111111 11111111 11111111 11111011
```

The bitwise operations are performed directly on this binary representation.

**Bitwise NOT**

The bitwise NOT operation in Java follows:

```text
~X = -(X + 1)
```

Therefore:

```text
~-5 = 4
~3  = -4
```

**Checking Even or Odd**

The expression:

```text
A & 1
```

checks the least significant bit. If the result is `1`, the number is odd; otherwise it is even. This works correctly for both positive and negative integers.

For `A = -5`:

```text
-5 & 1 = 1  ->  a is odd
```

**Left Shift**

The left shift moves all bits to the left by `N` positions:

```text
-5 << 2 = -20
```

**Signed Right Shift**

The signed right shift (`>>`) preserves the sign of the number by filling the leftmost positions with the sign bit:

```text
-5 >> 2 = -2
```

**Unsigned Right Shift**

The unsigned right shift (`>>>`) always fills the leftmost positions with `0`. Therefore, shifting a negative number can produce a large positive value:

```text
-5 >>> 2 = 1073741822
```

**XOR with Itself**

Any integer XORed with itself produces `0`:

```text
A ^ A = 0
```

**AND, OR, XOR with Zero**

```text
A & 0 = 0
A | 0 = A
A ^ 0 = A
```

For `A = -5`:

```text
-5 & 0 = 0
-5 | 0 = -5
-5 ^ 0 = -5
```

**Integer Overflow**

Java's `int` uses 32 bits. The expression:

```text
1 << 31
```

sets the sign bit and produces:

```text
-2147483648
```

This demonstrates how bit shifting can produce a negative value when the highest bit of a signed `int` is set.

---

