#include <iostream>
using namespace std;



int f(int m)
{    
    int fib0, fib1, i;
    
    fib0 = fib1 = i = 1;

    for ( ; !(fib0 == 0 && fib1 == 1); i++) {
        int fib = (fib0 + fib1) % m;
        fib0 = fib1;
        fib1 = fib;
    }

    return i;
}



int fib_mod(int n, int m)
{
    if (n <= 0) return 0;
    else {
        int fib0 = 0, fib1 = 1, fib = 1;

        for (int i = 2; i <= n; i++) {
            fib = (fib0 + fib1) % m;
            fib0 = fib1;
            fib1 = fib;
        }

        return fib;
    }
}


/*
 * Computes the n-th fibonacci number modulo m with 2 <= m <= 1000 
 */
int huge_fibonacci(long long n, int m)
{
    return fib_mod((int)(n % f(m)), m);
}



int last_digit_of_the_sum_of_sqr_of_fib_nbers(long long n)
{
    return (huge_fibonacci(n, 10) * huge_fibonacci(n + 1, 10)) % 10;
}



int main()
{
    long long n;

    cin >> n;

    cout << last_digit_of_the_sum_of_sqr_of_fib_nbers(n) << endl;

    return 0;
}