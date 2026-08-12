# Q1. Maximum Consecutive 1's After Replacing One 0

## Problem Description

Given an array `A` consisting only of `0`s and `1`s, you are allowed to replace **at most one `0` with `1`**.

Find the **maximum number of consecutive `1`s** that can be obtained after making the replacement.

### Note

You can replace **only one `0`** with `1`.

If the array already contains only `1`s, return the length of the array.

---

## Problem Constraints

- `1 <= N <= 100000`
- `A[i]` is either `0` or `1`

---

## Input Format

The first line contains an integer `N`, representing the size of the array.

The second line contains `N` integers representing the array `A`.

---

## Output Format

Return the maximum number of consecutive `1`s that can be obtained after replacing at most one `0` with `1`.

---

## Example Input

### Input 1

```text
N = 8

1 1 0 1 1 0 1 1
```

### Input 2

```text
N = 7

1 1 1 0 1 1 1
```

---

## Example Output

### Output 1

```text
5
```

### Output 2

```text
7
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = [1, 1, 0, 1, 1, 0, 1, 1]
```

We are allowed to replace only one `0` with `1`.

If we replace the `0` at index `2`:

```text
[1, 1, 1, 1, 1, 0, 1, 1]
```

We get:

```text
5 consecutive 1's
```

Similarly, if we replace the `0` at index `5`:

```text
[1, 1, 0, 1, 1, 1, 1, 1]
```

Again, we get:

```text
5 consecutive 1's
```

Therefore, the maximum number of consecutive `1`s is:

```text
5
```

---

### Explanation 2

Given:

```text
A = [1, 1, 1, 0, 1, 1, 1]
```

Replace the `0` at index `3` with `1`:

```text
[1, 1, 1, 1, 1, 1, 1]
```

Now all `7` elements are consecutive `1`s.

Therefore, the maximum number of consecutive `1`s is:

```text
7
```

---

