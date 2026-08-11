# Q1. Good Pair

## Problem Description

Given an array `A` and an integer `B`.

A pair `(i, j)` in the array is called a **good pair** if:

- `i != j`
- `A[i] + A[j] == B`

Determine whether any good pair exists.

---

## Problem Constraints

- `1 <= A.size() <= 10^4`
- `1 <= A[i] <= 10^9`
- `1 <= B <= 10^9`

---

## Input Format

- First argument: Integer array `A`
- Second argument: Integer `B`

---

## Output Format

Return:

- `1` if a good pair exists.
- `0` otherwise.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [1, 2, 3, 4]
B = 7
```

**Output**
```text
1
```

**Explanation**

The pair `(3, 4)` satisfies:

```text
A[3] + A[4] = 3 + 4 = 7
```

---

### Example 2

**Input**
```text
A = [1, 2, 4]
B = 4
```

**Output**
```text
0
```

**Explanation**

No pair has a sum equal to `4`.

---

### Example 3

**Input**
```text
A = [1, 2, 2]
B = 4
```

**Output**
```text
1
```

**Explanation**

The pair `(2, 3)` satisfies:

```text
A[2] + A[3] = 2 + 2 = 4
```

---

# Q2. Max Min of an Array

## Problem Description

Given an integer array `A` of size `N`, find the sum of the **maximum** and **minimum** elements in the array.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`

---

## Input Format

- First argument: Integer array `A`

---

## Output Format

Return the sum of the maximum and minimum elements of the array.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [-2, 1, -4, 5, 3]
```

**Output**
```text
1
```

**Explanation**

- Maximum element = `5`
- Minimum element = `-4`

```text
5 + (-4) = 1
```

---

### Example 2

**Input**
```text
A = [1, 3, 4, 1]
```

**Output**
```text
5
```

**Explanation**

- Maximum element = `4`
- Minimum element = `1`

```text
4 + 1 = 5
```

---

# Q3. Array Rotation

## Problem Description

Given an integer array `A` of size `N` and an integer `B`, return the same array after rotating it `B` times towards the **right**.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`
- `1 <= B <= 10^9`

---

## Input Format

- First argument: Integer array `A`
- Second argument: Integer `B`

---

## Output Format

Return the array `A` after rotating it `B` times to the right.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [1, 2, 3, 4]
B = 2
```

**Output**
```text
[3, 4, 1, 2]
```

**Explanation**

Rotate the array to the right two times:

```text
[1, 2, 3, 4]
→ [4, 1, 2, 3]
→ [3, 4, 1, 2]
```

---

### Example 2

**Input**
```text
A = [2, 5, 6]
B = 1
```

**Output**
```text
[6, 2, 5]
```

**Explanation**

Rotate the array to the right one time:

```text
[2, 5, 6]
→ [6, 2, 5]
```

---

# Q4. Reverse in a Range

## Problem Description

Given an integer array `A` of size `N` and two integers `B` and `C`, reverse the elements of the array within the inclusive range `[B, C]`.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `1 <= A[i] <= 10^9`
- `0 <= B <= C <= N - 1`

---

## Input Format

- First argument: Integer array `A`
- Second argument: Integer `B`
- Third argument: Integer `C`

---

## Output Format

Return the array `A` after reversing the elements in the given range.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [1, 2, 3, 4]
B = 2
C = 3
```

**Output**
```text
[1, 2, 4, 3]
```

**Explanation**

Reverse the subarray:

```text
[3, 4] → [4, 3]
```

Result:

```text
[1, 2, 4, 3]
```

---

### Example 2

**Input**
```text
A = [2, 5, 6]
B = 0
C = 2
```

**Output**
```text
[6, 5, 2]
```

**Explanation**

Reverse the entire array:

```text
[2, 5, 6] → [6, 5, 2]
```

---

