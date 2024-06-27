import java.util.Scanner;



class Fibonacci
{
    /*
    * Computes the n-th fibonacci number with 0 <= n <= 45 
    */
    static int fibonacci(int n)
    {
        if (n <= 0) return 0;
        else {
            int fib0 = 0, fib1 = 1, fib = 1;

            for (int i = 2; i <= n; i++) {
                fib = fib0 + fib1;
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

        System.out.println(fibonacci(n));
    }
}