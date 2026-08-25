# Q1. Check Whether a Number is Even or Odd Using Bitwise AND

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

# Q2. Bit Manipulation with Negative Numbers

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

