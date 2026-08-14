# Intermediate DSA - Time Complexity

## Question

Evaluate the time complexity of the following Java code.

```java
public void solve(int N) {
    for (int i = 0; i < Math.pow(2, N); i++) {
        int j = i;
        while (j > 0) {
            j--;
        }
    }
}
```

Predict the Time Complexity

- O(N × N)
- O(4^N)
- O(N × 2^N)
- O(2^N)

---

## Step 1: Analyze the Outer Loop

```java
for (int i = 0; i < Math.pow(2, N); i++)
```

The loop starts from `i = 0`.

It continues until `i < 2^N`.

Therefore, the outer loop executes:

```text
2^N times
```

---

## Step 2: Analyze the Inner Loop

Inside the outer loop:

```java
int j = i;
while (j > 0) {
    j--;
}
```

The value of `j` depends on the current value of `i`.

| i | j starts at | While loop runs |
|---|---|---|
| 0 | 0 | 0 times |
| 1 | 1 | 1 time |
| 2 | 2 | 2 times |
| 3 | 3 | 3 times |
| 4 | 4 | 4 times |
| ... | ... | ... |
| 2^N - 1 | 2^N - 1 | 2^N - 1 times |

The inner loop does not always run `2^N` times.

It runs exactly `i` times.

---

## Step 3: Total Number of Operations

The total work done is:

```text
0 + 1 + 2 + 3 + ... + (2^N - 1)
```

This is the sum of the first `(2^N - 1)` natural numbers.

Formula:

```text
k(k+1)/2, where k = 2^N - 1
```

Substituting:

```text
(2^N - 1)(2^N) / 2
```

Ignoring constants:

```text
O((2^N)^2)
```

Since:

```text
(2^N)^2 = 2^(2N) = 4^N
```

Final Complexity:

```text
O(4^N)
```

---

## Dry Run (N = 3)

When:

```text
N = 3
```

then:

```text
2^N = 8
```

Outer loop values:

```text
0, 1, 2, 3, 4, 5, 6, 7
```

Inner loop iterations:

```text
0 + 1 + 2 + 3 + 4 + 5 + 6 + 7
```

Total:

```text
28
```

Using the formula:

```text
(7 × 8) / 2 = 28
```

The result matches our calculation.

---

## Important Observation

Many of us think:

```text
Outer Loop = 2^N
Inner Loop = 2^N
```

Therefore:

```text
O(2^N × 2^N)
```

Although the final answer is indeed `O(4^N)`, this reasoning is incorrect because the inner loop does not always execute `2^N` times.

It executes `i` times, where `i` changes during each iteration.

The correct way to calculate the complexity is by using the summation:

```text
Σ (i = 0 to 2^N - 1) i
```

---

## Final Answer

Outer Loop:

```text
O(2^N)
```

Inner Loop:

```text
Runs i times
```

Total Work:

```text
Σ (i = 0 to 2^N - 1) i = (2^N - 1)(2^N) / 2 = O(4^N)
```

✅ **Answer: O(4^N)**

---

