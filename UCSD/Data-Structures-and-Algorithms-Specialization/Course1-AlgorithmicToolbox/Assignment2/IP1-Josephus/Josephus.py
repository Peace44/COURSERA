import sys



def greedy_josephus(n, k):
    rebels = [i for i in range(n)]
    nber_of_remaining_rebels = n
    i = j = 0
    while nber_of_remaining_rebels != 1:
        if rebels[i] >= 0:
            j = (j + 1) % k
            if j == 0:
                rebels[i] = -1  # killing rebel rebels[i]
                nber_of_remaining_rebels -= 1
        i = (i + 1) % n
    return next(survivor for survivor in rebels if survivor >= 0)


# Python has a default max recursion depth of 1000.
# The limit can be increased with sys.setrecursionlimit(n)
def recursive_josephus(n, k):
    if n == 1:
        return 0
    else:
        return (recursive_josephus(n-1, k) + k) % n



if __name__ == "__main__":
    n, k = map(int, input().split())
    print(greedy_josephus(n, k))
    sys.setrecursionlimit(n+1)
    print(recursive_josephus(n, k))