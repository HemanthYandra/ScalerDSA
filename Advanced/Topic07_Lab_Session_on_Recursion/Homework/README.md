# Q1. Is magic?

## Problem Description

Given a number `A`, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be `1`, then the number is a magic number.

---

## Problem Constraints

- `1 <= A <= 10^9`

---

## Input Format

The first and only argument is an integer `A`.

---

## Output Format

Return `1` if the given number is magic else return `0`.

---

## Example Input

### Input 1

```text
A = 83557
```

### Input 2

```text
A = 1291
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

---

## Example Explanation

### Explanation 1

```text
Sum of digits of (83557) = 28
Sum of digits of (28) = 10
Sum of digits of (10) = 1
```

Single digit is `1`, so it's a magic number. Return `1`.

Therefore, the answer is:

```text
1
```

### Explanation 2

```text
Sum of digits of (1291) = 13
Sum of digits of (13) = 4
```

Single digit is not `1`, so it's not a magic number. Return `0`.

Therefore, the answer is:

```text
0
```

---

# Q2. Check Palindrome using Recursion

## Problem Description

Write a recursive function that checks whether string `A` is a palindrome or not.

Return `1` if the string `A` is a palindrome, else return `0`.

### Note

A palindrome is a string that's the same when read forward and backward.

---

## Problem Constraints

- `1 <= |A| <= 50000`
- String `A` consists only of lowercase letters.

---

## Input Format

The first and only argument is a string `A`.

---

## Output Format

Return `1` if the string `A` is a palindrome, else return `0`.

---

## Example Input

### Input 1

```text
A = "naman"
```

### Input 2

```text
A = "strings"
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

---

## Example Explanation

### Explanation 1

`"naman"` is a palindromic string, so return `1`.

Therefore, the answer is:

```text
1
```

### Explanation 2

`"strings"` is not a palindrome, so return `0`.

Therefore, the answer is:

```text
0
```

---

# Q3. Max of an Array Using Recursion

## Problem Description

Given an array `A` of size `N`, write a recursive function that returns the maximum element of the array.

---

## Problem Constraints

- `1 <= N <= 100`
- `-1000 <= A[i] <= 1000`

---

## Input Format

The first line contains the array `A`.

---

## Output Format

A single integer is the maximum value of the array.

---

## Example Input

### Input 1

```text
A = [12, 10, 3, 4, 5]
```

### Input 2

```text
A = [1, -5, 80, -40]
```

---

## Example Output

### Output 1

```text
12
```

### Output 2

```text
80
```

---

## Example Explanation

### Explanation 1

The maximum element of the array `A`, `[12, 10, 3, 4, 5]` is `12`.

Therefore, the answer is:

```text
12
```

### Explanation 2

The maximum element of the array `A`, `[1, -5, 80, -40]` is `80`.

Therefore, the answer is:

```text
80
```

---

# Q4. First Index using Recursion

## Problem Description

You are given an array `A` of size `N`. Write a recursive function that returns the first index at which an integer `B` is found in the array.

### Note

If `B` is not found anywhere in the array then return `-1`.

---

## Problem Constraints

- `1 <= N <= 100`
- `-1000 <= A[i] <= 1000`
- `-1000 <= B <= 1000`

---

## Input Format

The function contains two arguments.

The first argument is the array `A`.

The second argument is the element `B` that is to be searched.

---

## Output Format

Return the index of `B` from the list in integer format if `B` is present in the array, else return `-1`.

---

## Example Input

### Input 1

```text
A = [-3, 5, 6, 2]
B = 6
```

### Input 2

```text
A = [0, 1, 0, 2]
B = 3
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
-1
```

---

## Example Explanation

### Explanation 1

```text
At index 0 we have -3
At index 1 we have 5
At index 2 we have 6 which is equal to B
```

Therefore, the answer is:

```text
2
```

### Explanation 2

The element `B = 3` is nowhere to be found in the array so we print `-1`.

Therefore, the answer is:

```text
-1
```

---

# Q5. Last Index using Recursion

## Problem Description

You are given an array `A` of size `N`. Write a recursive function that returns the last index at which an integer `B` is found in the array.

### Note

If `B` is not found anywhere in the array then return `-1`.

---

## Problem Constraints

- `1 <= N <= 100`
- `-1000 <= A[i] <= 1000`
- `-1000 <= B <= 1000`

---

## Input Format

The function contains two arguments.

The first argument is the array `A`.

The second argument is the element `B` that is to be searched.

---

## Output Format

Return the last index of `B` from the list in integer format if `B` is present in the array, else return `-1`.

---

## Example Input

### Input 1

```text
A = [6, 5, 6, 2]
B = 6
```

### Input 2

```text
A = [0, 1, 0, 2]
B = 3
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
-1
```

---

## Example Explanation

### Explanation 1

```text
At index 0 we have 6 which is equal to B, but it's not the last occurrence.
At index 1 we have 5
At index 2 we have 6 which is equal to B, and it's the last occurrence as well.
```

So the output is `2` and not `0`.

Therefore, the answer is:

```text
2
```

### Explanation 2

The element `B = 3` is nowhere to be found in the array so we print `-1`.

Therefore, the answer is:

```text
-1
```

---

