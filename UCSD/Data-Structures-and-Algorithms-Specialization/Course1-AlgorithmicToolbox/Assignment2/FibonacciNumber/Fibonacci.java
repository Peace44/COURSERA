import java.util.Scanner;

class Fibonacci
{
    static int fibonacci(int n)
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



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(fibonacci(n));
    }
}