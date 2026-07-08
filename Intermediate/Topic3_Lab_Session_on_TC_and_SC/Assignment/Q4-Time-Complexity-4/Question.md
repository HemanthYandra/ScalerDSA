# Q4. Time Complexity Easy 02

## Problem Statement

What is the Time Complexity of the following snippet?

### C++

```cpp
for (i = 0; i < N; ++i) {
    for (j = i; j < N; ++j) {
        break;
    }
}
```

### Java

```java
for (int i = 0; i < N; i++) {
    for (int j = i; j < N; j++) {
        break;
    }
}
```

### Python

```python
for i in range(N):
    for j in range(i, N):
        break
```

## Options

- O(N * N)
- O(N * log(N))
- O(N)
- O(log(N))
- None of the above