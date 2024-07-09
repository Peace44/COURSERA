def range_sum(arr, l, r):
    if l > r:
        return range_sum(arr, r, l)
    elif l == r:
        return 0
    else:
        return arr[l] + range_sum(arr, l+1, r)



if __name__ == "__main__":
    n = int(input())
    arr = [int(a) for a in input().split()]
    if len(arr) != n:
        raise Exception(f"{arr} doesn't contain {n} integers!")
    
    q = int(input())
    ranges = [int(r) for r in input().split() if int(r) >= 0 and int(r) < n]
    if len(ranges) != 2*q:
        raise Exception(f"{ranges} doesn't contain {q} ranges!")
        
    for r in range(q):
        print(range_sum(arr, ranges[2*r], ranges[2*r+1]))