## Answer

✅ **A. It gets toggled**

### Explanation

The XOR (`^`) operator toggles a bit whenever it is XORed with `1`.

Truth table:

| Bit | XOR 1 | Result |
|-----|-------|--------|
| 0 | 1 | 1 |
| 1 | 1 | 0 |

Since `1` in binary is:

```text
0001
```

Only the **0-th bit** is `1`, so only that bit changes.

Examples:

```text
a = 10
1010

 1010
^0001
-----
 1011
```

The 0-th bit changes from **0 → 1**.

Another example:

```text
a = 11
1011

 1011
^0001
-----
 1010
```

The 0-th bit changes from **1 → 0**.

Hence, the **0-th bit is toggled** every time.

**Answer:** **It gets toggled**