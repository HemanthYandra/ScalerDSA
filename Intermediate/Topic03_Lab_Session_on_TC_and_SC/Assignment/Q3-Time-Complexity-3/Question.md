# Q3. Time Complexity Easy 01

## Problem Statement

What is the Time Complexity of the following snippet?

### C++

```cpp
int count = 0;
while (N) {
    count++;
    N /= 3;
}
```

### Java

```java
int count = 0;
while (N > 0) {
    count++;
    N /= 3;
}
```

### Python

```python
count = 0
while N > 0:
    count += 1
    N = N // 3
```

## Options

- O(N)
- O(N * N)
- O(N log(N))
- O(log₃(N))
- O(log₂(N))