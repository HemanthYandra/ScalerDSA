# Q1. Toggle Case

## Problem Description

You are given a character string `A` having length `N`, consisting of only lowercase and uppercase Latin letters.

You have to **toggle the case** of each character of string `A`.

For example:

```text
'A' → 'a'
'a' → 'A'
'E' → 'e'
'e' → 'E'
```

Return the modified string.

---

## Problem Constraints

- `1 <= N <= 10^5`
- `A[i] ∈ ['a'-'z', 'A'-'Z']`

---

## Input Format

The first and only argument is a character string `A`.

---

## Output Format

Return the character string after toggling the case of every character.

---

## Example Input

### Input 1

```text
A = "Hello"
```

### Input 2

```text
A = "tHiSiSaStRiNg"
```

---

## Example Output

### Output 1

```text
hELLO
```

### Output 2

```text
ThIsIsAsTrInG
```

---

## Example Explanation

### Explanation 1

For the string:

```text
A = "Hello"
```

Each character is toggled:

```text
'H' → 'h'
'e' → 'E'
'l' → 'L'
'l' → 'L'
'o' → 'O'
```

Therefore:

```text
"Hello" → "hELLO"
```

---

### Explanation 2

For the string:

```text
A = "tHiSiSaStRiNg"
```

Toggling the case of every character gives:

```text
"tHiSiSaStRiNg" → "ThIsIsAsTrInG"
```

---

# Q2. String Operations

## Problem Description

Akash likes playing with strings. One day he thought of applying the following operations on a string in the given order:

1. **Concatenate** the string with itself.
2. **Delete** all the uppercase letters.
3. **Replace** each vowel with `#`.

You are given a string `A` of size `N`, consisting of lowercase and uppercase alphabets.

Return the resultant string after applying all the above operations.

> **Note:** The vowels are:
>
> ```text
> 'a', 'e', 'i', 'o', 'u'
> ```

---

## Problem Constraints

- `1 <= N <= 100000`

---

## Input Format

The first and only argument is a string `A` of size `N`.

---

## Output Format

Return the resultant string after applying all three operations.

---

## Example Input

### Input 1

```text
A = "aeiOUz"
```

### Input 2

```text
A = "AbcaZeoB"
```

---

## Example Output

### Output 1

```text
"###z###z"
```

### Output 2

```text
"bc###bc###"
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = "aeiOUz"
```

### Step 1: Concatenate the string with itself

```text
"aeiOUz" + "aeiOUz"
= "aeiOUzaeiOUz"
```

### Step 2: Delete all uppercase letters

Remove:

```text
O, U
```

Result:

```text
"aeizaeiz"
```

### Step 3: Replace every vowel with `#`

```text
"a" → "#"
"e" → "#"
"i" → "#"
"a" → "#"
"e" → "#"
"i" → "#"
```

Result:

```text
"###z###z"
```

---

### Explanation 2

Given:

```text
A = "AbcaZeoB"
```

### Step 1: Concatenate the string with itself

```text
"AbcaZeoBAbcaZeoB"
```

### Step 2: Delete all uppercase letters

Remove:

```text
A, Z, B, A, Z, B
```

Result:

```text
"bcaeobcaeo"
```

### Step 3: Replace every vowel with `#`

```text
"bcaeobcaeo"
→
"bc###bc###"
```

Therefore, the final result is:

```text
"bc###bc###"
```

---

# Q3. Check Palindrome in a Given Range

## Problem Description

Given a string `A` and two integers `si` and `ei`, check whether the substring of `A` from index `si` to index `ei` is a **palindrome**.

A string is said to be a palindrome if it reads the same forward and backward.

The indices `si` and `ei` are inclusive.

Return `true` if the substring is a palindrome; otherwise, return `false`.

---

## Problem Constraints

- `1 <= length of A <= 100000`
- `0 <= si <= ei < length of A`

---

## Input Format

The input consists of:

- First line: A string `A`.
- Second line: An integer `si`, representing the starting index.
- Third line: An integer `ei`, representing the ending index.

---

## Output Format

Return `true` if the substring from index `si` to `ei` is a palindrome.

Otherwise, return `false`.

---

## Example Input

### Input 1

```text
A = "madam"
si = 0
ei = 4
```

### Input 2

```text
A = "hello"
si = 1
ei = 3
```

---

## Example Output

### Output 1

```text
true
```

### Output 2

```text
false
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = "madam"
si = 0
ei = 4
```

The substring from index `0` to index `4` is:

```text
"madam"
```

Compare characters from both ends:

```text
m == m
a == a
d == d
```

All corresponding characters are equal.

Therefore, `"madam"` is a palindrome.

Hence, the answer is:

```text
true
```

---

### Explanation 2

Given:

```text
A = "hello"
si = 1
ei = 3
```

The substring from index `1` to index `3` is:

```text
"ell"
```

Compare characters from both ends:

```text
e != l
```

Since the corresponding characters are not equal, the substring is not a palindrome.

Hence, the answer is:

```text
false
```

---

# Q4. Longest Palindromic Substring

## Problem Description

Given a string `A` of size `N`, find and return the **longest palindromic substring** in `A`.

A substring of string `A` is `A[i...j]` where:

```text
0 <= i <= j < length of A
```

### Palindrome String

A string is called a palindrome if it reads the same backwards.

More formally, a string `A` is a palindrome if:

```text
reverse(A) = A
```

**In case of a conflict**, return the substring which occurs first, i.e., the one with the **least starting index**.

---

## Problem Constraints

- `1 <= N <= 6000`

---

## Input Format

The first and only argument is a string `A`.

---

## Output Format

Return a string denoting the longest palindromic substring of `A`.

---

## Example Input

### Input 1

```text
A = "aaaabaaa"
```

### Input 2

```text
A = "abba"
```

---

## Example Output

### Output 1

```text
"aaabaaa"
```

### Output 2

```text
"abba"
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = "aaaabaaa"
```

The longest palindromic substring is:

```text
"aaabaaa"
```

It has a length of `7`.

Therefore, the answer is:

```text
"aaabaaa"
```

---

### Explanation 2

Given:

```text
A = "abba"
```

The entire string is a palindrome because it reads the same forwards and backwards:

```text
"abba"
```

Therefore, the longest palindromic substring has a length of `4`.

Hence, the answer is:

```text
"abba"
```

---

# Q5. Length of the Longest Palindromic Substring

## Problem Description

Given a string `A` of size `N`, find and return the **length of the longest palindromic substring** in `A`.

A substring of string `A` is `A[i...j]` where:

```text
0 <= i <= j < length of A
```

### Palindrome String

A string is called a palindrome if it reads the same backwards.

More formally, a string is a palindrome if:

```text
reverse(A) = A
```

You need to find the maximum length among all palindromic substrings of `A`.

---

## Problem Constraints

- `1 <= N <= 6000`

---

## Input Format

The first and only argument is a string `A`.

---

## Output Format

Return an integer denoting the **length of the longest palindromic substring** in `A`.

---

## Example Input

### Input 1

```text
A = "aaaabaaa"
```

### Input 2

```text
A = "abba"
```

### Input 3

```text
A = "abc"
```

---

## Example Output

### Output 1

```text
7
```

### Output 2

```text
4
```

### Output 3

```text
1
```

---

## Example Explanation

### Explanation 1

Given:

```text
A = "aaaabaaa"
```

The longest palindromic substring is:

```text
"aaabaaa"
```

Its length is:

```text
7
```

Therefore, the answer is:

```text
7
```

---

### Explanation 2

Given:

```text
A = "abba"
```

The entire string is a palindrome:

```text
"abba"
```

Its length is:

```text
4
```

Therefore, the answer is:

```text
4
```

---

### Explanation 3

Given:

```text
A = "abc"
```

There is no palindromic substring with more than one character.

Every individual character is a palindrome:

```text
"a"
"b"
"c"
```

Therefore, the longest palindromic substring has length:

```text
1
```

---

