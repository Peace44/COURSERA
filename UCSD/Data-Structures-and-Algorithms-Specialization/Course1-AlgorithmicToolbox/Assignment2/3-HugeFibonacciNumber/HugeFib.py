def f(m):
    fib0 = fib1 = i = 1

    while not(fib0 == 0 and fib1 == 1):
        fib = (fib0 + fib1) % m
        fib0 = fib1
        fib1 = fib
        i += 1
    
    return i



def fib_mod(n, m):
    if n <= 0: 
        return 0
    else:
        fib0 = 0
        fib1 = 1
        fib = 1
        
        for i in range(2, n+1):
            fib = (fib0 + fib1) % m
            fib0 = fib1
            fib1 = fib
        
        return fib



def huge_fibonacci(n, m):
    return fib_mod(n % f(m), m)



if __name__ == "__main__":
    inputStr = input().split()

    n = int(inputStr[0])
    m = int(inputStr[1])
    
    print(huge_fibonacci(n, m))