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



def last_digit_of_the_sum_of_sqr_of_fib_nbers(n):
    return (huge_fibonacci(n, 10) * huge_fibonacci(n + 1, 10)) % 10



if __name__ == "__main__":
    n = int(input())
    print(last_digit_of_the_sum_of_sqr_of_fib_nbers(n))
