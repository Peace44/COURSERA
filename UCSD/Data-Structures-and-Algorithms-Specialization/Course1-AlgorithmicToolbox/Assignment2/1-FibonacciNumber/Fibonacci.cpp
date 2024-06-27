#include <iostream>
using namespace std;



/*
 * Computes the n-th fibonacci number with 0 <= n <= 45 
 */
int fibonacci(int n)
{
    if (n <= 0) return 0;
    else {
        int fib = 1, fib1 = 0, fib2 = 1;

        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
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

    cout << fibonacci(n) << endl;

    return 0;
}