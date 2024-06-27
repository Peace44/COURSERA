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



int naive_last_digit_of_the_partial_sum_of_fib_nbers(int m, int n)
{
    int f10 = f(10);
    int result = 0;
    for (int i = m; i <= n; i++) result = (result + fib_mod(i % f10, 10)) % 10;
    return result;
}



int last_digit_of_the_partial_sum_of_fib_nbers(long long m, long long n)
{
    if (m % 60 <= n % 60) return naive_last_digit_of_the_partial_sum_of_fib_nbers(m % 60, n % 60);
    else return naive_last_digit_of_the_partial_sum_of_fib_nbers(m % 60, (n % 60) + 60);
}



int main()
{
    long long m, n;
    cin >> m >> n;
    cout << last_digit_of_the_partial_sum_of_fib_nbers(m, n) << endl;
    return 0;
}