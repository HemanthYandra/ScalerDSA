# Q1. NESTED_CMPL2

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
int a = 0;
for (i = 0; i < N; i++) {
    for (j = N; j > i; j--) {
        a = a + i + j;
    }
}
```

### Java

```java
int a = 0;
for (int i = 0; i < N; i++) {
    for (int j = N; j > i; --j) {
        a += i + j;
    }
}
```

### Python

```python
a = 0
for i in range(N):
    for j in range(N):
        a = a + i + j
```

## Options

- O(N)
- O(N * log(N))
- O(N * √N)
- O(N * N)