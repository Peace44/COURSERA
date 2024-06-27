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



def naive_last_digit_of_the_sum_of_fib_nbers(n):
    m = 10
    f_m = f(m)
    result = 0
    for i in range(n + 1):
        result = (result + fib_mod(i % f_m, m)) % m
    return result



def last_digit_of_the_sum_of_fib_nbers(n):
    return naive_last_digit_of_the_sum_of_fib_nbers(n % 60)



if __name__ == "__main__":
    n = int(input())
    print(last_digit_of_the_sum_of_fib_nbers(n))
