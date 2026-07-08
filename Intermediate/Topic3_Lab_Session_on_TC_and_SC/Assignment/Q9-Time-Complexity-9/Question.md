# Q9. Time Complexity with Condition

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
int func(int n) {
    int s = 0;
    for (int i = 0; i < n; i = i * 2) {
        s = s + i;
    }
    return s;
}
```

### Java

```java
static int func(int n) {
    int s = 0;
    for (int i = 0; i < n; i = i * 2) {
        s += i;
    }
    return s;
}
```

### Python

```python
def func(n):
    s = 0
    i = 0
    while i < n:
        s = s + i
        i = i * 2
    return s
```

## Options

- O(n)
- O(n^(1/2))
- O(log n)
- O(∞)