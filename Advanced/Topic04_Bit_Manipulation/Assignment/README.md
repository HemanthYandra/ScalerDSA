# Q1. Single Number

## Problem Description

Given an array of integers `A`, every element appears twice except for one. Find that integer that occurs once.

### Note

Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

---

## Problem Constraints

- `1 <= |A| <= 2000000`
- `0 <= A[i] <= INTMAX`

---

## Input Format

The first and only argument of input contains an integer array `A`.

---

## Output Format

Return a single integer denoting the single element.

---

## Example Input

### Input 1

```text
A = [1, 2, 2, 3, 1]
```

### Input 2

```text
A = [1, 2, 2]
```

---

## Example Output

### Output 1

```text
3
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

`3` occurs once.

Therefore, the answer is:

```text
3
```

### Explanation 2

`1` occurs once.

Therefore, the answer is:

```text
1
```

---

# Q2. Set Bit

## Problem Description

You are given two integers `A` and `B`.

Set the `A-th` bit and `B-th` bit in `0`, and return output in decimal Number System.

### Note

The bit positions are 0-indexed, which means that the least significant bit (LSB) has index `0`.

---

## Problem Constraints

- `0 <= A <= 30`
- `0 <= B <= 30`

---

## Input Format

First argument `A` is an integer.

Second argument `B` is an integer.

---

## Output Format

Return an integer.

---

## Example Input

### Input 1

```text
A = 3
B = 5
```

### Input 2

```text
A = 4
B = 4
```

---

## Example Output

### Output 1

```text
40
```

### Output 2

```text
16
```

---

## Example Explanation

### Explanation 1

The binary expression is `101000` which is `40` in decimal.

Therefore, the answer is:

```text
40
```

### Explanation 2

The binary expression is `10000` which is `16` in decimal.

Therefore, the answer is:

```text
16
```

---

# Q3. Toggle i-th bit

## Problem Description

You are given two integers `A` and `B`.

- If `B-th` bit in `A` is set, make it unset.
- If `B-th` bit in `A` is unset, make it set.

Return the updated `A` value.

---

## Problem Constraints

- `1 <= A <= 10^9`
- `0 <= B <= 30`

---

## Input Format

First argument `A` is an integer.

Second argument `B` is an integer.

---

## Output Format

Return an integer.

---

## Example Input

### Input 1

```text
A = 4
B = 1
```

### Input 2

```text
A = 5
B = 2
```

---

## Example Output

### Output 1

```text
6
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

Given `A = 4` which is `100` in binary. The `1-st` bit is unset so we make it set.

Therefore, the answer is:

```text
6
```

### Explanation 2

Given `A = 5` which is `101` in binary. The `2-nd` bit is set so we make it unset.

Therefore, the answer is:

```text
1
```

---

# Q4. Check Whether the ith Bit is 1 or 0

## Problem Description

Given an integer `A` and an integer `B`, where `B` represents the bit position, check whether the `B-th` bit of `A` is `1` or `0`.

The bit positions are 0-indexed, meaning the rightmost bit is at position `0`.

Return `1` if the `B-th` bit is `1`, otherwise return `0`.

---

## Input Format

- The first line contains an integer `A`.
- The second line contains an integer `B`, representing the bit position to check.

---

## Output Format

Print `1` if the `B-th` bit of `A` is set (`1`), otherwise print `0`.

---

## Constraints

- `1 <= A <= 10^9`
- `0 <= B <= 30`

---

## Example Input

### Input 1

```text
10
1
```

### Input 2

```text
10
2
```

### Input 3

```text
7
0
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
0
```

### Output 3

```text
1
```

---

## Example Explanation

### Explanation 1

The binary representation of `10` is:

```text
1010
```

Bit positions are:

```text
Position:  3 2 1 0
Bit:       1 0 1 0
```

The bit at position `1` is `1`.

Therefore, the output is:

```text
1
```

### Explanation 2

The binary representation of `10` is:

```text
1010
```

Bit positions are:

```text
Position:  3 2 1 0
Bit:       1 0 1 0
```

The bit at position `2` is `0`.

Therefore, the output is:

```text
0
```

### Explanation 3

The binary representation of `7` is:

```text
111
```

The bit at position `0` is `1`.

Therefore, the output is:

```text
1
```

---

# Q5. Unset i-th bit

## Problem Description

You are given two integers `A` and `B`.

- If `B-th` bit in `A` is set, make it unset.
- If `B-th` bit in `A` is unset, leave as it is.

Return the updated `A` value.

### Note

The bit position is 0-indexed, which means that the least significant bit (LSB) has index `0`.

---

## Problem Constraints

- `1 <= A <= 10^9`
- `0 <= B <= 30`

---

## Input Format

First argument `A` is an integer.

Second argument `B` is an integer.

---

## Output Format

Return an integer.

---

## Example Input

### Input 1

```text
A = 4
B = 1
```

### Input 2

```text
A = 5
B = 2
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

Given `A = 4` which is `100` in binary. The `1-st` bit is already unset.

Therefore, the answer is:

```text
4
```

### Explanation 2

Given `A = 5` which is `101` in binary. We unset the `2-nd` bit.

It becomes `001` which is `1` in decimal.

Therefore, the answer is:

```text
1
```

---

# Q6. Single Number III

## Problem Description

Given an array of positive integers `A`, two integers appear only once, and all the other integers appear twice.

Find the **two integers that appear only once**.

**Note:** Return the two numbers in ascending order.

## Problem Constraints

- `2 <= |A| <= 100000`
- `1 <= A[i] <= 10^9`

## Input Format

The first argument is an array of integers of size `N`.

## Output Format

Return an array of two integers that appear only once, in ascending order.

## Example

### Input 1

```text
A = [1, 2, 3, 1, 2, 4]
```

### Output 1

```text
[3, 4]
```

### Explanation

`3` and `4` appear only once.

---

### Input 2

```text
A = [1, 2]
```

### Output 2

```text
[1, 2]
```

### Explanation

`1` and `2` appear only once.

---

# Q7. Number of 1 Bits

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

