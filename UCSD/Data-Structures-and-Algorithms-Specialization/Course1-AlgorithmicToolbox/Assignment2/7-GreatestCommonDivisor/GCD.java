import java.util.Scanner;



class GCD 
{
    static long gcd(long a, long b)
    {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }



    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        System.out.println(gcd(a, b));
    }
}
