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



def naive_last_digit_of_the_partial_sum_of_fib_nbers(m, n):
    f10 = f(10)
    result = 0
    for i in range(m, n + 1):
        result = (result + fib_mod(i % f10, 10)) % 10
    return result



def last_digit_of_the_partial_sum_of_fib_nbers(m, n):
    if m % 60 <= n % 60:
        return naive_last_digit_of_the_partial_sum_of_fib_nbers(m % 60, n % 60)
    else:
        return naive_last_digit_of_the_partial_sum_of_fib_nbers(m % 60, (n % 60) + 60)


if __name__ == "__main__":
    inputStr = input().split()
    m = int(inputStr[0])
    n = int(inputStr[1])
    print(last_digit_of_the_partial_sum_of_fib_nbers(m, n))