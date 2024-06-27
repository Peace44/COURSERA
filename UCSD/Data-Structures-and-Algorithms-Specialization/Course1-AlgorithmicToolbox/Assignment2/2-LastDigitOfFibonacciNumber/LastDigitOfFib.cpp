#include <iostream>
using namespace std;



/*
 * Computes the last digit of the n-th fibonacci number with 0 <= n <= 1,000,000 
 */
int last_digit_of_fibonacci(int n)
{
    if (n <= 0) return 0;
    else {
        int fib0 = 0, fib1 = 1, fib = 1;

        for (int i = 2; i <= n; i++) {
            fib = (fib0 + fib1) % 10;
            fib0 = fib1;
            fib1 = fib;
        }

        return fib;
    }
}



int main()
{
    int n;

    cin >> n;

    cout << last_digit_of_fibonacci(n) << endl;

    return 0;
}