# Q1. Elements Removal

## Problem Description

Given an integer array `A` of size `N`, you can remove **any element** from the array in one operation.

The **cost** of each operation is the **sum of all elements currently present in the array before the removal**.

Your task is to find the **minimum total cost** required to remove all the elements from the array.

---

## Problem Constraints

- `0 <= N <= 1000`
- `1 <= A[i] <= 10^3`

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return an integer denoting the **minimum total cost** of removing all the elements from the array.

---

## Example Input

### Input 1

```text
A = [2, 1]
```

### Input 2

```text
A = [5]
```

---

## Example Output

### Output 1

```text
4
```

### Output 2

```text
5
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [2, 1]
```

One optimal sequence of removals is:

1. Remove `2`

```text
Array before removal: [2, 1]
Cost = 2 + 1 = 3
Remaining array: [1]
```

2. Remove `1`

```text
Array before removal: [1]
Cost = 1
Remaining array: []
```

Total cost:

```text
3 + 1 = 4
```

Hence, the minimum total cost is:

```text
4
```

---

### Explanation 2

For the array:

```text
A = [5]
```

There is only one element.

```text
Cost = 5
```

Hence, the minimum total cost is:

```text
5
```

---

# Q2. Kth Smallest Element

## Problem Description

Given an integer array `A` and an integer `B`, find the **Bth smallest element** in the array.

> **Note:** Try to solve the problem using **at most `B` swaps**.

---

## Problem Constraints

- `1 <= |A| <= 10^5`
- `1 <= B <= min(|A|, 500)`
- `1 <= A[i] <= 10^9`

---

## Input Format

- The first argument is an integer array `A`.
- The second argument is an integer `B`.

---

## Output Format

- Return the **Bth smallest element** in the given array.

---

## Example Input

### Input 1

```text
A = [2, 1, 4, 3, 2]
B = 3
```

### Input 2

```text
A = [1, 2]
B = 2
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

For the array:

```text
A = [2, 1, 4, 3, 2]
```

After sorting:

```text
[1, 2, 2, 3, 4]
```

The **3rd smallest element** is:

```text
2
```

Hence, the answer is:

```text
2
```

---

### Explanation 2

For the array:

```text
A = [1, 2]
```

After sorting:

```text
[1, 2]
```

The **2nd smallest element** is:

```text
2
```

Hence, the answer is:

```text
2
```

---

# Q3. Noble Integers

## Problem Description

Given an array `A` of **distinct integers** of size `N`, find the **count of noble integers** in the array.

An element `A[i]` is called a **noble integer** if the number of elements **strictly smaller** than `A[i]` is equal to the value of `A[i]`.

Return the total number of noble integers present in the array.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`
- All elements in the array are **distinct**.

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return an integer denoting the **count of noble integers** in the array.

---

## Example Input

### Input 1

```text
A = [1, -5, 3, 5, -10, 4]
```

### Input 2

```text
A = [0, 1, 2, 3]
```

---

## Example Output

### Output 1

```text
3
```

### Output 2

```text
4
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [1, -5, 3, 5, -10, 4]
```

| Element | Number of Smaller Elements | Noble? |
|---------:|---------------------------:|:-------:|
| 1 | 2 | ❌ |
| -5 | 1 | ❌ |
| 3 | 3 | ✅ |
| 5 | 5 | ✅ |
| -10 | 0 | ❌ |
| 4 | 4 | ✅ |

The noble integers are:

```text
3, 4, 5
```

Hence, the answer is:

```text
3
```

---

### Explanation 2

For the array:

```text
A = [0, 1, 2, 3]
```

The number of elements smaller than each element is:

| Element | Smaller Elements | Noble? |
|---------:|-----------------:|:-------:|
| 0 | 0 | ✅ |
| 1 | 1 | ✅ |
| 2 | 2 | ✅ |
| 3 | 3 | ✅ |

Hence, the answer is:

```text
4
```

---

# Q4. Noble Integers (Duplicates Allowed)

## Problem Description

Given an integer array `A` of size `N`, find the **count of noble integers** in the array.

An element `A[i]` is called a **noble integer** if the number of elements **strictly smaller** than `A[i]` is equal to the value of `A[i]`.

> **Note:**
> - The array **may contain duplicate elements**.
> - While counting, consider only **strictly smaller** elements (equal elements are **not** counted).

Return the total number of noble integers present in the array.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `-10^9 <= A[i] <= 10^9`

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return an integer denoting the **count of noble integers** in the array.

---

## Example Input

### Input 1

```text
A = [3, 3, 1, 0]
```

### Input 2

```text
A = [2, 2, 0]
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [3, 3, 1, 0]
```

The number of elements strictly smaller than each element is:

| Element | Smaller Elements | Count | Noble? |
|---------:|------------------|------:|:------:|
| 3 | {0, 1} | 2 | ❌ |
| 3 | {0, 1} | 2 | ❌ |
| 1 | {0} | 1 | ✅ |
| 0 | {} | 0 | ✅ |

The noble elements are:

```text
0, 1
```

Hence, the answer is:

```text
2
```

---

### Explanation 2

For the array:

```text
A = [2, 2, 0]
```

The number of elements strictly smaller than each element is:

| Element | Smaller Elements | Count | Noble? |
|---------:|------------------|------:|:------:|
| 2 | {0} | 1 | ❌ |
| 2 | {0} | 1 | ❌ |
| 0 | {} | 0 | ✅ |

The noble element is:

```text
0
```

Hence, the answer is:

```text
1
```

---

# Q5. Noble Integer (Count of Greater Elements)

## Problem Description

Given an integer array `A`, determine whether there exists an integer `p` in the array such that the number of elements **strictly greater than `p`** is exactly equal to `p`.

- Return `1` if such an integer exists.
- Otherwise, return `-1`.

---

## Problem Constraints

- `1 <= |A| <= 2 × 10^5`
- `-10^8 <= A[i] <= 10^8`

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return `1` if a noble integer exists.
- Otherwise, return `-1`.

---

## Example Input

### Input 1

```text
A = [3, 2, 1, 3]
```

### Input 2

```text
A = [1, 1, 3, 3]
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
-1
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [3, 2, 1, 3]
```

Consider the element:

```text
p = 2
```

The elements greater than `2` are:

```text
3, 3
```

Number of elements greater than `2`:

```text
2
```

Since:

```text
2 = p
```

A noble integer exists.

Hence, the answer is:

```text
1
```

---

### Explanation 2

For the array:

```text
A = [1, 1, 3, 3]
```

No element satisfies the condition that the number of elements greater than it is equal to its value.

Hence, the answer is:

```text
-1
```