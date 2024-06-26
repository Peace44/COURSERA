import java.util.Scanner;



class LastDigitOfFib 
{
    /*
    * Computes the last digit of the n-th fibonacci number with 0 <= n <= 1,000,000 
    */
    static int last_digit_of_fibonacci(int n)
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



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(last_digit_of_fibonacci(n));
    }
}
