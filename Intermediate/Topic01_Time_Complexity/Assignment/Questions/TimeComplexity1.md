# Intermediate DSA - Time Complexity

## Question

If an algorithm's time complexity is

```text
O((3/2)^n)
```

then its complexity belongs to which category?

- Constant
- Quadratic
- Exponential
- None of the mentioned

---

## Step 1: Identify the Form

The given complexity is

```text
O((3/2)^n)
```

Notice that the variable `n` is present in the exponent.

General forms:

```text
Constant     → O(1)
Linear       → O(n)
Quadratic    → O(n²)
Cubic        → O(n³)
Exponential  → O(a^n), where a > 1
```

Since

```text
(3/2)^n = 1.5^n
```

this matches the exponential form.

---

## Step 2: Compare Different Complexities

| Complexity | Example |
|---|---|
| Constant | O(1) |
| Logarithmic | O(log n) |
| Linear | O(n) |
| Quadratic | O(n²) |
| Cubic | O(n³) |
| Exponential | O(2ⁿ), O(3ⁿ), O(1.5ⁿ), O((3/2)ⁿ) |

The given complexity belongs to the **Exponential** category.

---

## Java Code

```java
public class ExponentialGrowth {
    public static void main(String[] args) {
        for (int n = 1; n <= 10; n++) {
            double operations = Math.pow(3.0 / 2.0, n);
            System.out.printf("n = %d -> %.2f%n", n, operations);
        }
    }
}
```

Output

```text
n = 1 -> 1.50
n = 2 -> 2.25
n = 3 -> 3.38
n = 4 -> 5.06
n = 5 -> 7.59
n = 6 -> 11.39
n = 7 -> 17.09
n = 8 -> 25.63
...
```

Notice how the value increases multiplicatively, not by a fixed amount. This is characteristic of exponential growth.

---

## Why is it Exponential?

Suppose

```text
T(n) = (3/2)^n
```

Every time `n` increases by 1, the work is multiplied by

```text
3/2 = 1.5
```

For example,

```text
n = 4  ->  (3/2)^4 = 5.06
n = 5  ->  (3/2)^5 = 7.59
```

Instead of adding a constant amount, the work is multiplied by `1.5` every step.

This is the definition of **Exponential Growth**.

---

## Common Mistake

Many of us think:

```text
Since 3/2 < 2, it is not exponential.
```

This is **incorrect**.

Any complexity of the form

```text
a^n, where a > 1
```

is classified as Exponential.

Examples:

```text
1.2^n
1.5^n
2^n
3^n
10^n
```

All are exponential time complexities.

---

## Final Answer

Given:

```text
O((3/2)^n)
```

Since it is of the form

```text
O(a^n), a > 1
```

it is an **Exponential Time Complexity**.

✅ **Correct Answer: Exponential**

---

