# Q5. Time-Complexity-5

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
int a = 0, i = N;
while (i > 0) {
    a += i;
    i /= 2;
}
```

### Java

```java
int a = 0, i = N;
while (i > 0) {
    a = a + i;
    i = i / 2;
}
```

### Python

```python
a = 0
i = N
while i > 0:
    a += i
    i //= 2
```

## Options

- O(N)
- O(√N)
- O(N / 2)
- O(log N)