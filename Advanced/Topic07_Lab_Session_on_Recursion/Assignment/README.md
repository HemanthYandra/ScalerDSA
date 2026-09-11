# Q1. Fast Power

## Problem Description

Given two positive integers `A` and `B`. Implement Fast Power function to compute `A^B`.

### Note

Please use the approach taught in the class.

---

## Problem Constraints

`A^B` would fit in `64-bit` type integer.

---

## Input Format

Two integers `A` and `B`.

---

## Output Format

Single integer denoting the answer to `A^B`.

---

## Example Input

### Input 1

```text
A = 2, B = 10
```

### Input 2

```text
A = 1, B = 100000000
```

---

## Example Output

### Output 1

```text
1024
```

### Output 2

```text
1
```

---

## Example Explanation

### Explanation 1

```text
2^10 = 2^5 * 2^5
2^5 = 32, so 32 * 32 = 1024
```

Therefore, the answer is:

```text
1024
```

### Explanation 2

`1` raised to power anything is `1`.

Therefore, the answer is:

```text
1
```

---

# Q2. All Indices Of Array

## Problem Description

Given an array of integers `A` with `N` elements and a target integer `B`, the task is to find all the indices at which `B` occurs in the array.

### Note

The problem encourages recursive logic for learning purposes. Although the online judge doesn't enforce recursion, it's recommended to use recursive solutions to align with the question's spirit.

---

## Problem Constraints

- `1 <= N <= 10^3`
- `1 <= A[i] <= 10^3`
- `1 <= B <= 10^3`
- It is guaranteed that the target `B` exists at least once in the array `A`.

---

## Input Format

First argument is an array of integers, `A`.

Second argument is the target, `B`.

---

## Output Format

Return the sorted array of indices.

---

## Example Input

### Input 1

```text
A = [1, 2, 3, 4, 5]
B = 1
```

### Input 2

```text
A = [8, 9, 5, 6, 5, 5]
B = 5
```

---

## Example Output

### Output 1

```text
[0]
```

### Output 2

```text
[2, 4, 5]
```

---

## Example Explanation

### Explanation 1

The target `1` occurs on index `0`. So returning `[0]`.

Therefore, the answer is:

```text
[0]
```

### Explanation 2

Here, the target `5` occurs at indexes `[2, 4, 5]`.

Therefore, the answer is:

```text
[2, 4, 5]
```

---

# Q3. Tower of Hanoi

## Problem Description

You are given `N` disks and three towers.

Your task is to move all `N` disks from a **source tower** to a **destination tower** using a **helper tower**.

Initially, all the disks are placed on the source tower in decreasing order of size, with the largest disk at the bottom and the smallest disk at the top.

The following rules must be followed:

1. Only one disk can be moved at a time.
2. Only the top disk from any tower can be moved.
3. A larger disk cannot be placed on top of a smaller disk.
4. All `N` disks must be moved from the source tower to the destination tower.
5. The problem must be solved using recursion.

For every move, print the disk number along with its source and destination towers in the following format:

```text
Move the disk X from src to dest
```

where `X` is the disk number.

The names of the three towers are given as input.

## Problem Constraints

- `1 <= N <= 15`
- The names of the three towers are distinct.

## Input Format

The input consists of four lines:

- The first line contains an integer `N`, representing the number of disks.
- The second line contains the name of the **source tower**.
- The third line contains the name of the **destination tower**.
- The fourth line contains the name of the **helper tower**.

## Output Format

Print every move required to transfer all `N` disks from the source tower to the destination tower.

Each move should be printed in the following format:

```text
Move the disk X from src to dest
```

where:

- `X` is the disk number.
- `src` is the current source tower.
- `dest` is the current destination tower.

## Example Input 1

```text
3
A
B
C
```

## Example Output 1

```text
Move the disk 1 from A to B
Move the disk 2 from A to C
Move the disk 1 from B to C
Move the disk 3 from A to B
Move the disk 1 from C to A
Move the disk 2 from C to B
Move the disk 1 from A to B
```

## Example Explanation 1

There are 3 disks, with `A` as the source, `B` as the destination, and `C` as the helper.

First, the top 2 disks are moved from `A` to `C`. Then disk 3 is moved from `A` to `B`. Finally, the 2 disks on `C` are moved to `B`.

Therefore, all 3 disks are transferred from `A` to `B` in `7` moves.

## Example Input 2

```text
2
A
C
B
```

## Example Output 2

```text
Move the disk 1 from A to B
Move the disk 2 from A to C
Move the disk 1 from B to C
```

## Example Explanation 2

There are 2 disks, with `A` as the source, `C` as the destination, and `B` as the helper.

First, disk 1 is moved from `A` to `B`. Then disk 2 is moved from `A` to `C`. Finally, disk 1 is moved from `B` to `C`.

Thus, both disks are successfully moved from `A` to `C` in `3` moves.

---

# Q4. Tower of Hanoi - 1

## Problem Description

In the classic problem of the Towers of Hanoi, you have `3` towers numbered from `1` to `3` (left to right) and `A` disks numbered from `1` to `A` (top to bottom) of different sizes which can slide onto any tower.

The puzzle starts with disks sorted in ascending order of size from top to bottom (i.e., each disk sits on top of an even larger one).

You have the following constraints:

- Only one disk can be moved at a time.
- A disk is slid off the top of one tower onto another tower.
- A disk cannot be placed on top of a smaller disk.

You have to find the solution to the Tower of Hanoi problem.

You have to return a 2D array of dimensions `M x 3`, where `M` is the minimum number of moves needed to solve the problem.

In each row, there should be `3` integers `(disk, start, end)`, where:

- `disk` - number of the disk being moved
- `start` - number of the tower from which the disk is being moved
- `end` - number of the tower to which the disk is being moved

---

## Problem Constraints

- `1 <= A <= 18`

---

## Input Format

The first argument is the integer `A`.

---

## Output Format

Return a 2D array with dimensions `M x 3` as mentioned above in the description.

---

## Example Input

### Input 1

```text
A = 2
```

### Input 2

```text
A = 3
```

---

## Example Output

### Output 1

```text
[1 1 2] [2 1 3] [1 2 3]
```

### Output 2

```text
[1 1 3] [2 1 2] [1 3 2] [3 1 3] [1 2 1] [2 2 3] [1 1 3]
```

---

## Example Explanation

### Explanation 1

We shift the first disk to the middle tower.

We shift the second disk to the last tower.

We, finally, shift the first disk from the middle tower to the last tower.

Therefore, the answer is:

```text
[1 1 2] [2 1 3] [1 2 3]
```

### Explanation 2

We can see that this was the only unique path with minimal moves to move all disks from the first to the third tower.

Therefore, the answer is:

```text
[1 1 3] [2 1 2] [1 3 2] [3 1 3] [1 2 1] [2 2 3] [1 1 3]
```

---

