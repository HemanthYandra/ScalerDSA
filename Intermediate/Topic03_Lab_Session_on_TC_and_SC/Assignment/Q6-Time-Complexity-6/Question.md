# Q6. Loop_Time Complexity

## Problem Statement

What is the time complexity of the following code snippet?

### C++

```cpp
for (int i = 1; i <= n; i += 2) {
    cout << i;
}
```

### Java

```java
for (int i = 1; i <= n; i += 2) {
    System.out.print(i);
}
```

### Python

```python
for i in range(1, n + 1, 2):
    print(i, end='')
```

## Options

- O(n³)
- O(n²)
- O(n)
- O(log n)