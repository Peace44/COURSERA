import java.util.Scanner;



class LastDigitOfTheSumOfSqrOfFibNbers 
{
    static int f(int m)
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



    static int fib_mod(int n, int m)
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



    static int huge_fibonacci(long n, int m)
    {
        return fib_mod((int)(n % f(m)), m);
    }



    static int last_digit_of_the_sum_of_sqr_of_fib_nbers(long n)
    {
        return (huge_fibonacci(n, 10) * huge_fibonacci(n + 1, 10)) % 10;
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        System.out.println(last_digit_of_the_sum_of_sqr_of_fib_nbers(n));
    }
}
