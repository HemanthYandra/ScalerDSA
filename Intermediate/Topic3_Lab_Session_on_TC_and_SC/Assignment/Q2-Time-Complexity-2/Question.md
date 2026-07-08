# Q2. Time Complexity

## Problem Statement

What will be the Time Complexity of the given code?

### C++

```cpp
void solve() {
    int i = 1;
    while (i < n) {
        int x = i;
        while (x--) {
            // O(1) operation
        }
        i++;
    }
}
```

### Java

```java
public void solve() {
    int i = 1;
    while (i < n) {
        int x = i;
        while (x-- > 0) {
            // O(1) operation
        }
        i++;
    }
}
```

### Python

```python
def solve():
    i = 1
    while (i < n):
        x = i
        while (x > 0):
            # O(1) operation
            x -= 1
        i += 1
```

## Options

- O(n log n)
- O(n)
- O(n sqrt(n))
- O(n²)
- None of the above