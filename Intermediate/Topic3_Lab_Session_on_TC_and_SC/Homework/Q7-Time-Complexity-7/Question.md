# Q7. Find Time Complexity - 4

## Problem

What is the **Time Complexity** of the following code?

### C++

```cpp
int func(int n) {
    int s = 0;

    for (int i = 1; i * i * i * i <= n; i++) {
        s = s + i;
    }

    return s;
}
```

### Java

```java
int func(int n) {
    int s = 0;

    for (int i = 1; i * i * i * i <= n; i++) {
        s = s + i;
    }

    return s;
}
```

### Python

```python
def func(n):
    s = 0
    i = 1

    while i * i * i * i <= n:
        s = s + i
        i += 1

    return s
```

## Options

- A. **O(n^(1/4))**
- B. **O(n^(1/3))**
- C. **O(n^(1/2))**
- D. **O(n)**
