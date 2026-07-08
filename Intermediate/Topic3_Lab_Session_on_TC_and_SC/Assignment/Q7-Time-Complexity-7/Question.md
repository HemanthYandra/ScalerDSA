# Q7. Find Time Complexity - 2

## Problem Statement

What is the time complexity of the following code snippet?

### C++

```cpp
void solve(int N, int M) {
    for (int i = 1; i <= N; i++) {
        if (N % i == 0)
            cout << i << endl;
    }

    for (int i = 1; i <= M; i++) {
        if (M % i == 0)
            cout << i << endl;
    }
}
```

### Java

```java
static void solve(int N, int M) {
    for (int i = 1; i <= N; i++) {
        if (N % i == 0)
            System.out.println(i);
    }

    for (int i = 1; i <= M; i++) {
        if (M % i == 0)
            System.out.println(i);
    }
}
```

### Python

```python
def solve(N, M):
    for i in range(1, N + 1):
        if N % i == 0:
            print(i)

    for i in range(1, M + 1):
        if M % i == 0:
            print(i)
```

## Options

- O(N)
- O(M)
- O(N + M)
- O(NM)