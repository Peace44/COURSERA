def fibonacci(n):
    if n <= 0: 
        return 0
    else:
        fib = 1
        fib1 = 0
        fib2 = 1

        for i in range(2, n+1):
            fib = fib1 + fib2
            fib1 = fib2
            fib2 = fib
        
        return fib



if __name__ == "__main__":
    n = int(input())
    print(fibonacci(n))