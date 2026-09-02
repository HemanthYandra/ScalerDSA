# Q1. Insertion

## Problem Description

You are given two 32-bit numbers, `N` and `M`, and two bit positions, `i` and `j`.

Write a method to insert `M` into `N` such that:

- `M` starts at bit position `j`.
- `M` ends at bit position `i`.
- The bits from `j` through `i` have enough space to contain all the bits of `M`.

For example, if:

```text
M = 10011
```

then you need at least `5` bits between positions `j` and `i`.

You would not have `j = 3` and `i = 2`, because there isn't enough space to fit all `5` bits of `M`.

---

## Important

Bit positions are counted from the rightmost bit, starting at `0`.

For example:

```text
10000000000
          ↑
          bit 0
```

So for:

```text
i = 2
j = 6
```

we are replacing bits:

```text
6 5 4 3 2
```

with:

```text
1 0 0 1 1
```

---

## Example Input

### Input 1

```text
N = 10000000000
M = 10011
i = 2
j = 6
```

---

## Example Output

### Output 1

```text
N = 10001001100
```

---

## Example Explanation

### Explanation 1

Insert `M` into `N` from bit `6` down to bit `2`.

Bits `6` through `2` of `N` are cleared, and replaced with the bits of `M`:

```text
6 5 4 3 2
1 0 0 1 1
```

This gives the updated value:

```text
N = 10001001100
```

---

