# Q1. Length of Longest Consecutive 1's (String)

## Problem Description

Given a binary string `A`, it is allowed to perform **at most one swap** between any `0` and `1`.

Find and return the **maximum length of consecutive `1`s** that can be achieved after performing the swap.

### Important

The operation is a **swap**, not a replacement.

This means:

- One `0` can be swapped with one `1`.
- The total number of `1`s in the string remains unchanged.
- If the string already contains only `1`s, no swap is required.
- The answer can never be greater than the total number of `1`s in the string.

---

## Problem Constraints

- `1 <= length of string <= 1000000`
- `A` contains only characters `0` and `1`.

---

## Input Format

The only argument given is the string `A`.

---

## Output Format

Return the length of the **longest consecutive `1`s** that can be achieved after at most one swap.

---

## Example Input

### Input 1

```text
A = "111000"
```

### Input 2

```text
A = "111011101"
```

---

## Example Output

### Output 1

```text
3
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
A = "111000"
```

The string contains:

```text
111000
```

There are only `3` ones in the entire string.

Even after swapping a `0` with a `1`, we cannot create more than `3` consecutive `1`s.

Therefore, the maximum length is:

```text
3
```

---

### Explanation 2

Given:

```text
A = "111011101"
```

The string can be divided into groups of consecutive `1`s:

```text
111 0 111 0 1
```

There are `7` ones in total.

Consider the `0` between the first two groups:

```text
111 0 111 0 1
    ↑
```

Swap this `0` with the `1` at the end:

```text
111 1 111 0 0
```

which becomes:

```text
111111100
```

Now there are:

```text
7 consecutive 1's
```

Since the string contains exactly `7` ones, we cannot get more than `7`.

Therefore, the answer is:

```text
7
```

---

# Q2. Simple Reverse

## Problem Description

Given a string `A`, reverse the string and return the reversed string.

---

## Problem Constraints

- `1 <= |A| <= 100000`
- String `A` consists only of lowercase characters.

---

## Input Format

The first and only argument is a string `A`.

---

## Output Format

Return a string denoting the reversed string.

---

## Example Input

### Input 1

```text
A = "scaler"
```

### Input 2

```text
A = "academy"
```

---

## Example Output

### Output 1

```text
"relacs"
```

### Output 2

```text
"ymedaca"
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = "scaler"
```

Reverse the characters of the string:

```text
scaler
```

Starting from the last character and moving towards the first:

```text
r → e → l → a → c → s
```

Therefore, the reversed string is:

```text
"relacs"
```

---

### Explanation 2

Given:

```text
A = "academy"
```

Reverse the characters of the string:

```text
academy
```

Starting from the last character and moving towards the first:

```text
y → m → e → d → a → c → a
```

Therefore, the reversed string is:

```text
"ymedaca"
```

---

# Q3. Reverse the String Word by Word

## Problem Description

You are given a string `A` of size `N`.

Return the string `A` after reversing the string **word by word**.

### Note

- A sequence of non-space characters constitutes a word.
- The reversed string should **not contain leading or trailing spaces**, even if they are present in the input string.
- If there are multiple spaces between words, reduce them to a **single space** in the reversed string.

---

## Problem Constraints

- `1 <= N <= 3 * 10^5`

---

## Input Format

The only argument given is string `A`.

---

## Output Format

Return the string `A` after reversing the string word by word.

---

## Example Input

### Input 1

```text
A = "the sky is blue"
```

### Input 2

```text
A = "this is ib"
```

---

## Example Output

### Output 1

```text
"blue is sky the"
```

### Output 2

```text
"ib is this"
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = "the sky is blue"
```

The words in the original string are:

```text
the
sky
is
blue
```

Reverse the order of the words:

```text
blue
is
sky
the
```

Join the words using a single space:

```text
"blue is sky the"
```

Therefore, the output is:

```text
"blue is sky the"
```

---

### Explanation 2

Given:

```text
A = "this is ib"
```

The words in the original string are:

```text
this
is
ib
```

Reverse the order of the words:

```text
ib
is
this
```

Join the words using a single space:

```text
"ib is this"
```

Therefore, the output is:

```text
"ib is this"
```

---

