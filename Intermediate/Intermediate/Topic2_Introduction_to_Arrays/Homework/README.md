# Q1. Time to Equality

## Problem Description

Given an integer array `A` of size `N`.

In one second, you can increase the value of **one element** by `1`.

Find the **minimum time (in seconds)** required to make all elements of the array equal.

---

## Problem Constraints

- `1 <= N <= 10^6`
- `1 <= A[i] <= 1000`

---

## Input Format

- First argument: Integer array `A`

---

## Output Format

Return an integer denoting the minimum time required to make all elements equal.

---

## Example Input

```text
A = [2, 4, 1, 3, 2]
```

---

## Example Output

```text
8
```

---

## Explanation

The optimal approach is to increase every element until it becomes equal to the maximum element (`4`).

```text
2 → 4 : 2 seconds
4 → 4 : 0 seconds
1 → 4 : 3 seconds
3 → 4 : 1 second
2 → 4 : 2 seconds
```

Total time:

```text
2 + 0 + 3 + 1 + 2 = 8 seconds
```

---

# Q2. Second Largest

## Problem Description

Given an integer array `A`, find the **second largest distinct element** in the array. If no such element exists, return `-1`.

---

## Problem Constraints

- `1 <= |A| <= 10^5`
- `0 <= A[i] <= 10^9`

---

## Input Format

- First argument: Integer array `A`

---

## Output Format

Return the second largest distinct element. If no such element exists, return `-1`.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [2, 1, 2]
```

**Output**
```text
1
```

**Explanation**

```text
Largest element        = 2
Second largest element = 1
```

---

### Example 2

**Input**
```text
A = [2]
```

**Output**
```text
-1
```

**Explanation**

The array contains only one element, so there is no second largest element.

---

# Q3. Linear Search - Multiple Occurrences

## Problem Description

Given an integer array `A` and an integer `B`, find the number of occurrences of `B` in the array.

---

## Problem Constraints

- `1 <= A.length <= 10^5`
- `1 <= A[i] <= 10^9`
- `1 <= B <= 10^9`

---

## Input Format

- First argument: Integer array `A`
- Second argument: Integer `B`

---

## Output Format

Return an integer representing the number of occurrences of `B` in `A`.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [1, 2, 2]
B = 2
```

**Output**
```text
2
```

**Explanation**

The element `2` appears at indices `1` and `2`.

Therefore, the total number of occurrences is:

```text
2
```

---

### Example 2

**Input**
```text
A = [1, 2, 1]
B = 3
```

**Output**
```text
0
```

**Explanation**

The element `3` does not appear in the array.

---

# Q4. Count of Elements

## Problem Description

Given an integer array `A` of size `N`, count the number of elements that have **at least one element greater than themselves** in the array.

---

## Problem Constraints

- `1 <= N <= 10^3`
- `1 <= A[i] <= 10^9`

---

## Input Format

- First and only argument: Integer array `A`

---

## Output Format

Return an integer representing the count of elements that have at least one greater element in the array.

---

## Example Inputs & Outputs

### Example 1

**Input**
```text
A = [3, 1, 2]
```

**Output**
```text
2
```

**Explanation**

The maximum element is `3`.

The elements that have at least one greater element are:

```text
1, 2
```

Hence, the answer is:

```text
2
```

---

### Example 2

**Input**
```text
A = [5, 5, 3]
```

**Output**
```text
1
```

**Explanation**

The maximum element is `5`.

Only the element `3` has a greater element in the array.

The elements equal to the maximum value do not have any greater element.

Hence, the answer is:

```text
1
```

---

