import java.util.Scanner;



class LastDigitOfThePartialSumOfFibNbers 
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



    static int naive_last_digit_of_the_sum_of_fib_nbers(int n)
    {
        int m = 10;
        int f_m = f(m);

        int result = 0;
        for (int i = 0; i <= n; i++) result = (result + fib_mod(i % f_m, m)) % m;
        
        return result;
    }



    static int naive_last_digit_of_the_partial_sum_of_fib_nbers(int m, int n)
    {
        int f10 = f(10);
        int result = 0;
        for (int i = m; i <= n; i++) result = (result + fib_mod(i % f10, 10)) % 10;
        return result;
    }



    static int last_digit_of_the_partial_sum_of_fib_nbers(long m, long n)
    {
        if (m % 60 <= n % 60) return naive_last_digit_of_the_partial_sum_of_fib_nbers((int)(m % 60), (int)(n % 60));
        else return naive_last_digit_of_the_partial_sum_of_fib_nbers((int)(m % 60), (int)((n % 60) + 60));
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        long m = scanner.nextLong();
        long n = scanner.nextLong();
        System.out.println(last_digit_of_the_partial_sum_of_fib_nbers(m, n));
    }
}
