def fibonacci(n):
    if n <= 0: 
        return 0
    else:
        fib0 = 0
        fib1 = 1
        fib = 1
        
        for i in range(2, n+1):
            fib = fib0 + fib1
            fib0 = fib1
            fib1 = fib
        
        return fib



if __name__ == "__main__":
    n = int(input())
    print(fibonacci(n))