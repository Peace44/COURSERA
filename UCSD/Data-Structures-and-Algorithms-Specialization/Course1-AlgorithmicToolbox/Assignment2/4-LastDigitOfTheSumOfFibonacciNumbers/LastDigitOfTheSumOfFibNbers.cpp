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



int naive_last_digit_of_the_sum_of_fib_nbers(int n)
{
    int m = 10;
    int f_m = f(m);

    int result = 0;
    for (int i = 0; i <= n; i++) result = (result + fib_mod(i % f_m, m)) % m;
    
    return result;
}



int last_digit_of_the_sum_of_fib_nbers(long long n)
{
    return naive_last_digit_of_the_sum_of_fib_nbers(n % 60);
}



int main()
{
    long long n;

    cin >> n;

    cout << last_digit_of_the_sum_of_fib_nbers(n) << endl;

    return 0;
}