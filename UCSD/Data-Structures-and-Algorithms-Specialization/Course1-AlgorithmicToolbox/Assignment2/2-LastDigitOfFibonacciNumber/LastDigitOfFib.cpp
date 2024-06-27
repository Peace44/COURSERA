#include <iostream>
using namespace std;



/*
 * Computes the last digit of the n-th fibonacci number with 0 <= n <= 1,000,000 
 */
int last_digit_of_fibonacci(int n)
{
    if (n <= 0) return 0;
    else {
        int fib = 1, fib1 = 0, fib2 = 1;

        for (int i = 2; i <= n; i++) {
            fib = (fib1 + fib2) % 10;
            fib1 = fib2;
            fib2 = fib;
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