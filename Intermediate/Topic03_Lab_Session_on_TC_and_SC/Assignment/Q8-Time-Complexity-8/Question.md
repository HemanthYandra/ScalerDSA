# Q8. Linear Loop Time Complexity

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
int func(int n) {
    int s = 0;
    for (int i = 1; i <= 100; i++) {
        s = s + i;
    }
    return s;
}
```

### Java

```java
static int func(int n) {
    int s = 0;
    for (int i = 1; i <= 100; i++) {
        s += i;
    }
    return s;
}
```

### Python

```python
def func(n):
    s = 0
    for i in range(1, 101):
        s = s + i
    return s
```

## Options

- O(n)
- O(n²)
- O(s)
- O(1)