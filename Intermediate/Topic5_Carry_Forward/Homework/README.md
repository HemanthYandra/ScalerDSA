# Q1. Best Time to Buy and Sell Stocks I

## Problem Description

You are given an array `A`, where the `i`th element represents the price of a stock on day `i`.

You are allowed to complete **at most one transaction**, i.e., buy one share of the stock and sell one share of the stock.

Your task is to find the **maximum possible profit**.

> **Note:** You must buy the stock before you sell it.

---

## Problem Constraints

- `0 <= A.size() <= 700000`
- `1 <= A[i] <= 10^7`

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return an integer representing the maximum possible profit.

---

## Example Input

### Input 1

```text
A = [1, 2]
```

### Input 2

```text
A = [1, 4, 5, 2, 4]
```

---

## Example Output

### Output 1

```text
1
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
A = [1, 2]
```

- Buy the stock on **day 0** at price `1`.
- Sell the stock on **day 1** at price `2`.

Profit:

```text
2 - 1 = 1
```

Hence, the maximum profit is:

```text
1
```

---

### Explanation 2

For the array:

```text
A = [1, 4, 5, 2, 4]
```

- Buy the stock on **day 0** at price `1`.
- Sell the stock on **day 2** at price `5`.

Profit:

```text
5 - 1 = 4
```

Hence, the maximum profit is:

```text
4
```

---

# Q2. Closest MinMax

## Problem Description

Given an array `A`, find the length of the **smallest subarray** that contains **at least one occurrence of the minimum value** of the array and **at least one occurrence of the maximum value** of the array.

---

## Problem Constraints

- `1 <= |A| <= 2000`

---

## Input Format

- The first and only argument is an integer array `A`.

---

## Output Format

- Return the length of the smallest subarray that contains at least one occurrence of both the minimum and maximum elements of the array.

---

## Example Input

### Input 1

```text
A = [1, 3, 2]
```

### Input 2

```text
A = [2, 6, 1, 6, 9]
```

---

## Example Output

### Output 1

```text
2
```

### Output 2

```text
3
```

---

## Example Explanation

### Explanation 1

For the array:

```text
A = [1, 3, 2]
```

- Minimum element = `1`
- Maximum element = `3`

The smallest subarray containing both is:

```text
[1, 3]
```

Length:

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
A = [2, 6, 1, 6, 9]
```

- Minimum element = `1`
- Maximum element = `9`

The smallest subarray containing both is:

```text
[1, 6, 9]
```

Length:

```text
3
```

Hence, the answer is:

```text
3
```

---