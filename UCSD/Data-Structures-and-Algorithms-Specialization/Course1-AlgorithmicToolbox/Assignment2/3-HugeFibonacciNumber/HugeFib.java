import java.util.Scanner;



class HugeFib 
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

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        int m = scanner.nextInt();

        System.out.println(huge_fibonacci(n, m));
    }
}
