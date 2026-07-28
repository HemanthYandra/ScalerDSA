## Answer

✅ **B. Odd**

### Explanation

The expression

```text
a & 1
```

checks the **least significant bit (LSB)**.

- Even numbers end with **0** in binary.
- Odd numbers end with **1** in binary.

Examples:

```text
6 = 110
110 & 001 = 000

7 = 111
111 & 001 = 001
```

Since `a & 1 = 1`, the last bit is **1**, so **a is odd**.

**Answer:** **Odd**