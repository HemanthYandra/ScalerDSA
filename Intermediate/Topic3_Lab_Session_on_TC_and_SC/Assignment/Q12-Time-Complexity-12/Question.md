# Q12. Find Time Complexity - 8

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
for (int i = 1; i <= n; i *= 2) {
    for (int j = 1; j <= n; j++) {
        cout << i + j << " ";
    }
    cout << endl;
}
```

### Java

```java
for (int i = 1; i <= n; i *= 2) {
    for (int j = 1; j <= n; j++) {
        System.out.print(i + j + " ");
    }
    System.out.println();
}
```

### Python

```python
i = 1
while i <= n:
    for j in range(1, n + 1):
        print(i + j, end=' ')
    print()
    i *= 2
```

## Options

- O(n²)
- O(n log n)
- O(n)
- O(1)