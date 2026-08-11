# Q11. Double Loop Analysis

## Problem Statement

What is the time complexity of the following code?

### C++

```cpp
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
        cout << i + j << " ";
    }
    cout << endl;
}
```

### Java

```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j <= i; j++) {
        System.out.print(i + j + " ");
    }
    System.out.println();
}
```

### Python

```python
for i in range(n):
    for j in range(i + 1):
        print(i + j, end=' ')
    print()
```

## Options

- O(n²)
- O(n)
- O(n log n)
- O(n³)