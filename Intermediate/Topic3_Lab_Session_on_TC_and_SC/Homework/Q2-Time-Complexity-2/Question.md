# Q2. Time Complexity - M4

## Problem

Evaluate the time complexity of the following code.

### C++

```cpp
void solve(int N) {
    for (int i = 0; i < pow(2, N); i++) {
        int j = i;
        while (j > 0) {
            j--;
        }
    }
}
```

### Java

```java
public void solve(int N) {
    for (int i = 0; i < Math.pow(2, N); i++) {
        int j = i;
        while (j > 0) {
            j--;
        }
    }
}
```

### Swift

```swift
func solve(_ N: Int) {
    for i in 0..<Int(pow(2.0, Double(N))) {
        var j = i
        while j > 0 {
            j -= 1
        }
    }
}
```

### Python

```python
def solve(N):
    for i in range(2 ** N):
        j = i
        while j > 0:
            j -= 1
```

### C#

```csharp
public void Solve(int N) {
    for (int i = 0; i < Math.Pow(2, N); i++) {
        int j = i;
        while (j > 0) {
            j--;
        }
    }
}
```

## Options

- A. **Time Complexity: O(N × N)**
- B. **Time Complexity: O(4^N)**
- C. **Time Complexity: O(N × 2^N)**
- D. **Time Complexity: O(2^N)**
