# Intermediate DSA - Mathematical Basics

## Question

Find the sum of the first **n natural numbers**.

Choose the correct formula.

- (n × (n + 1)) / 2
- (n × (n - 1)) / 2
- (n + 1) / 2
- (n(n + 1)(2n + 1)) / 6

---

## What are Natural Numbers?

Natural numbers start from **1**.

Example:

For n = 5

```text
1 + 2 + 3 + 4 + 5
```

We need a formula to calculate this sum without using a loop.

---

## Derivation of the Formula

Suppose

```text
S = 1 + 2 + 3 + ... + (n-1) + n
```

Write the same sum in reverse order.

```text
S = n + (n-1) + (n-2) + ... + 2 + 1
```

Now add both equations.

```text
2S = (n+1) + (n+1) + (n+1) + ... + (n+1)
```

There are **n** terms.

Therefore,

```text
2S = n × (n+1)
```

Divide both sides by 2.

```text
S = n(n+1)/2
```

---

## Java Code

```java
public class SumOfNaturalNumbers {

    public static int sum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {

        int n = 5;

        System.out.println("Sum = " + sum(n));

    }
}
```

Output

```text
Sum = 15
```

---

## Dry Run

Let

```text
n = 5
```

Using the formula

```text
n(n+1)/2
= 5 × 6 / 2
= 30 / 2
= 15
```

Verification

```text
1 + 2 + 3 + 4 + 5
= 15
```

The formula gives the correct answer.

---

## Why Do We Use This Formula?

Without the formula:

```java
int sum = 0;

for(int i = 1; i <= n; i++){
    sum += i;
}
```

Time Complexity:

```text
O(n)
```

Using the formula:

```java
sum = n * (n + 1) / 2;
```

Only one multiplication, one addition, and one division are performed.

Time Complexity:

```text
O(1)
```

---

## Understanding the Other Options

### Option 1

```text
(n × (n+1))/2 ✅
```

Correct formula for the sum of the first n natural numbers.

### Option 2

```text
(n × (n-1))/2 ❌
```

Example:

```text
n = 5
5 × 4 / 2 = 10
Actual sum = 15
```

Incorrect.

### Option 3

```text
(n+1)/2 ❌
```

This gives the average of numbers only in a limited context, not the total sum.

### Option 4

```text
n(n+1)(2n+1)/6 ❌
```

This is the formula for

```text
1² + 2² + 3² + ... + n²
```

(sum of squares), not the sum of natural numbers.

---

