# Q10. Nested Loop with Doubling

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
for (int i = 1; i <= 100; i *= 2) {
    for (int j = 1; j <= n; j++) {
        cout << i + j << " ";
    }
    cout << endl;
}
```

### Java

```java
for (int i = 1; i <= 100; i *= 2) {
    for (int j = 1; j <= n; j++) {
        System.out.print(i + j + " ");
    }
    System.out.println();
}
```

### Python

```python
i = 1
while i <= 100:
    for j in range(1, n + 1):
        print(i + j, end=' ')
    print()
    i *= 2
```

## Options

- O(n²)
- O(n)
- O(n log n)
- O(1)