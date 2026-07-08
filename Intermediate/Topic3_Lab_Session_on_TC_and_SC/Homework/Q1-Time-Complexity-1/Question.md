# Q1. Nested Loop Time Complexity

## Problem

What is the time complexity of the following code?

### C++

```cpp
int a = 0, b = 0;

for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {
        a = a + j;
    }
}

for (int k = 0; k < N; k++) {
    b = b + k;
}
```

### Java

```java
int a = 0, b = 0;

for (int i = 0; i < N; i++) {
    for (int j = 0; j < N; j++) {
        a = a + j;
    }
}

for (int k = 0; k < N; k++) {
    b = b + k;
}
```

### Python

```python
a = 0
b = 0

for i in range(N):
    for j in range(N):
        a = a + j

for k in range(N):
    b = b + k
```

## Options

- A. **O(N * N)**
- B. **O(1)**
- C. **O(N)**
- D. **O(N * N * N)**

