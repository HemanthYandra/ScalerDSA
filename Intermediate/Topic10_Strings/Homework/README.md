# Q1. Is Alphanumeric or not

## Problem Description

You are given a character array `A`.

Return `1` if **all characters** in the character array are **alphanumeric**, otherwise return `0`.

A character is considered alphanumeric if it is one of:

- Lowercase English letters: `a-z`
- Uppercase English letters: `A-Z`
- Digits: `0-9`

---

## Problem Constraints

- `1 <= |A| <= 10^5`

---

## Input Format

The only argument is a character array `A`.

---

## Output Format

- Return `1` if all characters of `A` are alphanumeric.
- Otherwise, return `0`.

---

## Example Input

### Input 1

```text
A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
```

### Input 2

```text
A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
0
```

---

## Example Explanation

### Explanation 1

For:

```text
A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
```

Every character is either:

- An uppercase letter
- A lowercase letter
- A digit

Therefore, all characters are alphanumeric.

Hence, the answer is:

```text
1
```

---

### Explanation 2

For:

```text
A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']
```

The character:

```text
'#'
```

is **not** an alphabet or a digit.

Therefore, not all characters are alphanumeric.

Hence, the answer is:

```text
0
```

---

# Q2. Amazing Subarrays

## Problem Description

You are given a string `S`. Find the number of **amazing substrings** of `S`.

An **amazing substring** is a substring that starts with a **vowel**.

The vowels are:

```text
a, e, i, o, u
A, E, I, O, U
```

Return the number of amazing substrings modulo `10003`.

---

## Problem Constraints

- `1 <= length(S) <= 10^6`
- `S` can contain special characters.

---

## Input Format

The only argument is a string `S`.

---

## Output Format

Return a single integer `X` modulo `10003`, where `X` is the number of amazing substrings in `S`.

---

## Example Input

### Input 1

```text
S = "ABEC"
```

---

## Example Output

### Output 1

```text
6
```

---

## Example Explanation

For:

```text
S = "ABEC"
```

The amazing substrings are:

```text
1. "A"
2. "AB"
3. "ABE"
4. "ABEC"
5. "E"
6. "EC"
```

There are a total of:

```text
6
```

amazing substrings.

Therefore:

```text
6 % 10003 = 6
```

Hence, the answer is:

```text
6
```

---

# Q3. Count Occurrences

## Problem Description

You are given a string `A` consisting of lowercase English letters.

Count the number of times the substring **`"bob"`** appears in `A`.

> **Note:** Overlapping occurrences are counted separately.
>
> For example, `"bobob"` contains two occurrences of `"bob"`:
>
> - Starting at index `0`
> - Starting at index `2`

---

## Problem Constraints

- `1 <= |A| <= 1000`

---

## Input Format

The only argument is the string `A`.

---

## Output Format

Return a single integer denoting the number of times the substring `"bob"` occurs in `A`.

---

## Example Input

### Input 1

```text
A = "abobc"
```

### Input 2

```text
A = "bobob"
```

---

## Example Output

### Output 1

```text
1
```

### Output 2

```text
2
```

---

## Example Explanation

### Explanation 1

For:

```text
A = "abobc"
```

The substring `"bob"` appears once:

```text
a [bob] c
  ↑
 index 1
```

Therefore, the answer is:

```text
1
```

---

### Explanation 2

For:

```text
A = "bobob"
```

The substring `"bob"` appears twice:

```text
[bob]ob
  bob
```

The two occurrences start at indices:

```text
0 and 2
```

The occurrences overlap on the middle character.

Therefore, the answer is:

```text
2
```

---

# Q4. Longest Common Prefix

## Problem Description

Given an array of strings `A`, find the **longest string `S`** that is a prefix of **all the strings** in the array.

The **longest common prefix** of two strings `S1` and `S2` is the longest string `S` that is a prefix of both `S1` and `S2`.

For example, the longest common prefix of:

```text
"abcdefgh"
"abcefgh"
```

is:

```text
"abc"
```

---

## Problem Constraints

- `0 <= sum of length of all strings <= 10^6`

---

## Input Format

The only argument is an array of strings `A`.

---

## Output Format

Return the **longest common prefix** of all the strings in `A`.

---

## Example Input

### Input 1

```text
A = ["abcdefgh", "aefghijk", "abcefgh"]
```

### Input 2

```text
A = ["abab", "ab", "abcd"]
```

---

## Example Output

### Output 1

```text
"a"
```

### Output 2

```text
"ab"
```

---

## Example Explanation

### Explanation 1

For:

```text
A = ["abcdefgh", "aefghijk", "abcefgh"]
```

All three strings start with:

```text
"a"
```

But their second characters are different.

Therefore, the longest common prefix is:

```text
"a"
```

---

### Explanation 2

For:

```text
A = ["abab", "ab", "abcd"]
```

All three strings start with:

```text
"ab"
```

The third character is not common to all strings.

Therefore, the longest common prefix is:

```text
"ab"
```

---

